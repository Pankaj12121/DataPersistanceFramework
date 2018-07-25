package com.demo.dbUploader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.demo.framework.core.scenarioResult.ScenarioResultObject;
import com.demo.pages.FB_Login;



public class ExcelToDB {

	public void uploadTestDataFile (String testDataUploadTestDataFilePath, Connection dataDBConnectionObject) throws FileNotFoundException, IOException {


		DataFileUploadFilter DFUF= new DataFileUploadFilter();
		System.out.println("===============================================================================");
		System.out.println("Uploading Test Data File : " + testDataUploadTestDataFilePath);
		System.out.println("===============================================================================");

		File testDataExcelFileReference;
		FileInputStream testDataFileInputStreamReference;
		XSSFWorkbook testDataWorkBookReference;
		XSSFSheet tableUploadMasterWorksheet;
		XSSFSheet dataWorksheet;

		FileOutputStream testDataFileOutputStreamReference;

		testDataExcelFileReference = new File(testDataUploadTestDataFilePath);
		testDataFileInputStreamReference = new FileInputStream(testDataExcelFileReference);
		testDataWorkBookReference = new XSSFWorkbook (testDataFileInputStreamReference);

		Iterator<Sheet> tableUploadMasterIterator = testDataWorkBookReference.iterator();
		tableUploadMasterIterator.next();

		for(int i=0;i<=testDataWorkBookReference.getNumberOfSheets()-1;i++){

			dataWorksheet = testDataWorkBookReference.getSheetAt(i);
			String tableUploadTableNameInDB=dataWorksheet.getSheetName();
			createTableInDB(tableUploadTableNameInDB, dataWorksheet, dataDBConnectionObject);
			uploadFileInDB(tableUploadTableNameInDB,dataWorksheet,dataDBConnectionObject);

		}

		testDataFileInputStreamReference.close();
		testDataFileInputStreamReference.close();
		testDataWorkBookReference.close();
		System.out.println("-------------------------------------------------------------------------------\n\n");

	}	
	private void createTableInDB (String tableUploadTableNameInDB, XSSFSheet dataWorksheet, Connection dataDBConnectionObject) {

		try {
			Iterator<Row> rows = dataWorksheet.rowIterator();
			Row columnHeaderRow;
			Row columnTypesRow;

			if (rows.hasNext()) {
				columnHeaderRow = rows.next();
			}
			else
				throw new RuntimeException ("Header Row Not Found. Please check the datasheet - " + dataWorksheet.getSheetName());

			if (rows.hasNext()) {
				columnTypesRow = rows.next();
			}
			else
				throw new RuntimeException ("Column Type Row Not Found. Please check the datasheet - " + dataWorksheet.getSheetName());

			Iterator<Cell> columnTitles = columnHeaderRow.cellIterator();
			Iterator<Cell> columnTypes = columnTypesRow.cellIterator();

			String tableCreateStatementString = "Create Table " + tableUploadTableNameInDB + " ( \n";
			String tableDropStatementString = "Drop Table " + tableUploadTableNameInDB;

			for (int i = 0; i < columnHeaderRow.getPhysicalNumberOfCells(); i++){
				Cell columnTitleCell = columnHeaderRow.getCell(i);
				Cell columnTypeCell = columnTypesRow.getCell(i);

				int originalColumnTitleCellType = columnTitleCell.getCellType(); 
				int originalColumnTypeCellType = columnTitleCell.getCellType(); 

				columnTitleCell.setCellType(Cell.CELL_TYPE_STRING);
				columnTypeCell.setCellType(Cell.CELL_TYPE_STRING);

				if (!columnTitleCell.getStringCellValue().equalsIgnoreCase("columntype")) {
					tableCreateStatementString = tableCreateStatementString + columnTitleCell.getStringCellValue() + " " + columnTypeCell.getStringCellValue();

					columnTitleCell.setCellType(originalColumnTitleCellType);
					columnTypeCell.setCellType(originalColumnTypeCellType);

					if(i<columnHeaderRow.getPhysicalNumberOfCells()-1) {
						tableCreateStatementString = tableCreateStatementString + ", \n";
					}
				}
			}

			tableCreateStatementString = tableCreateStatementString + ") \n";

			try {
				System.out.println(tableDropStatementString);
				Statement dropTableStatement = dataDBConnectionObject.createStatement();
				dropTableStatement.execute(tableDropStatementString);
				System.out.println("Table Dropped");
			}
			catch(SQLException sqle) {
				System.out.println("Table Dropped: " + sqle.getMessage());
				//sqle.printStackTrace();
			}

			try {
				System.out.println("Table Creation Started ====>> "+tableCreateStatementString);
				Statement createTableStatement = dataDBConnectionObject.createStatement();
				createTableStatement.execute(tableCreateStatementString);
				System.out.println("Table Created====>> "+tableCreateStatementString);
			}
			catch(SQLException sqle) {
				sqle.printStackTrace();
			}

		} catch (Exception e) {
			System.out.println("e = " + e);
		}

	}

	private void uploadFileInDB (String tableUploadTableNameInDB, XSSFSheet dataWorksheet, Connection dataDBConnectionObject) {
		try {
			Iterator<Row> rows = dataWorksheet.rowIterator();

			Row columnHeaderRow;
			Row columnTypesRow;

			if (rows.hasNext()) {
				columnHeaderRow = rows.next();
			}
			else
				throw new RuntimeException ("Header Row Not Found. Please check the datasheet - " + dataWorksheet.getSheetName());

			if (rows.hasNext()) {
				columnTypesRow = rows.next();
			}
			else
				throw new RuntimeException ("Column Type Row Not Found. Please check the datasheet - " + dataWorksheet.getSheetName());

			Iterator<Cell> columnTitles = columnHeaderRow.cellIterator();
			Iterator<Cell> columnTypes = columnTypesRow.cellIterator();

			String columnNameString = "";
			String columnValueString = "";

			while (rows.hasNext()) {
				Row currentRow = rows.next(); 
				columnNameString = "";
				columnValueString = "";
				for (int i = 0; i < columnHeaderRow.getPhysicalNumberOfCells(); i++){
					Cell currentCell = currentRow.getCell(i);
					columnNameString = columnNameString + columnHeaderRow.getCell(i);

					if (currentCell != null) {
						if (columnTypesRow.getCell(i).getStringCellValue().equalsIgnoreCase("integer") ||
								columnTypesRow.getCell(i).getStringCellValue().equalsIgnoreCase("int") ||
								columnTypesRow.getCell(i).getStringCellValue().toLowerCase().startsWith("number") ||
								columnTypesRow.getCell(i).getStringCellValue().toLowerCase().startsWith("long") || 
								columnTypesRow.getCell(i).getStringCellValue().toLowerCase().startsWith("short") ||
								columnTypesRow.getCell(i).getStringCellValue().equalsIgnoreCase("bit")) {
							double tmpValue;
							try {
								tmpValue = currentCell.getNumericCellValue();
							}
							catch (Exception e) {
								tmpValue = 0.0;
							}
							columnValueString = columnValueString + Integer.toString((int) tmpValue);
						}
						else if (columnTypesRow.getCell(i).getStringCellValue().toLowerCase().startsWith("float") ||
								columnTypesRow.getCell(i).getStringCellValue().toLowerCase().startsWith("double")) {
							double tmpValue;
							try {
								tmpValue = currentCell.getNumericCellValue();
							}
							catch (Exception e) {
								tmpValue = 0.0;
							}
							columnValueString = columnValueString + Double.toString(tmpValue);
						}
						/*else if (columnTypesRow.getCell(i).getStringCellValue().equalsIgnoreCase("bit")) {
						int originalCellType = currentCell.getCellType(); 
						currentCell.setCellType(Cell.CELL_TYPE_STRING);
						String tmpValue = currentCell.getStringCellValue();
						if (tmpValue == null) {
							tmpValue = "FALSE";
						}
						columnValueString = columnValueString + Boolean.parseBoolean(tmpValue);
						currentCell.setCellType(originalCellType);
					}
						 */
						else if (columnTypesRow.getCell(i).getStringCellValue().toLowerCase().startsWith("varchar") || 
								columnTypesRow.getCell(i).getStringCellValue().toLowerCase().startsWith("varchar2") || 
								columnTypesRow.getCell(i).getStringCellValue().toLowerCase().startsWith("text") || 
								columnTypesRow.getCell(i).getStringCellValue().toLowerCase().startsWith("date") || 
								columnTypesRow.getCell(i).getStringCellValue().toLowerCase().startsWith("time") ||
								columnTypesRow.getCell(i).getStringCellValue().toLowerCase().startsWith("timestamp") ||
								columnTypesRow.getCell(i).getStringCellValue().toLowerCase().startsWith("char")) {
							int originalCellType = currentCell.getCellType(); 
							currentCell.setCellType(Cell.CELL_TYPE_STRING);
							String tmpValue = currentCell.getStringCellValue();
							if (tmpValue == null) {
								tmpValue = "";
							}

							columnValueString = columnValueString + "'" +  tmpValue + "'";
							//currentCell.setCellType(originalCellType);
						}
					}
					else
						columnValueString = columnValueString + "null";

					if(i<columnHeaderRow.getPhysicalNumberOfCells()-1) {
						columnNameString = columnNameString + ", ";
						columnValueString = columnValueString + ", ";
					}
				}

				try {
					String insertStatement = "insert into " + tableUploadTableNameInDB + " (" + columnNameString + ") values (" + columnValueString + ")";
					//System.out.println(insertStatement);
					Statement statement = dataDBConnectionObject.createStatement();
					statement.executeUpdate(insertStatement);
					dataDBConnectionObject.commit();
				}
				catch(SQLException sqle) {
					sqle.printStackTrace();
				}
			}
		} catch (Exception e) {
			System.out.println("e = " + e);
		}finally{

			System.out.println("Data Uploaded ");
		}
	}

	
}
