package com.demo.applicationDatabin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.demo.DBUtil.DBConnectClass;
import com.demo.framework.core.CustomAssert;
import com.demo.framework.core.scenarioResult.ScenarioResultObject;
import com.demo.framework.core.scenarioResult.WorkbookBuilder;


public class TestResultUtility {
	
		public TestResultUtility(){}
			
		public TestResultUtility(CustomAssert customAssert, String AutomationID,ScenarioResultObject sro,String sheetName) throws IOException{
		
		if(customAssert.isWarning()){
			sro.setScenarioStatus("failed");
			sro.setReasonIfFailed(customAssert.getErrorMessage());
		}else if(customAssert.allStepsSkip())
			sro.setScenarioStatus("skipped");
		else if(!customAssert.isWarning())
			sro.setScenarioStatus("failed");
		
		
			File testDataExcelFileReference;
			FileInputStream testDataFileInputStreamReference;
			XSSFWorkbook testDataWorkBookReference;
			XSSFSheet tableUploadMasterWorksheet;
			XSSFSheet dataWorksheet;

			testDataExcelFileReference = new File(DBConnectClass.prop.getProperty("TestNGOutPutDir"));
			testDataFileInputStreamReference = new FileInputStream(testDataExcelFileReference);
			testDataWorkBookReference = new XSSFWorkbook (testDataFileInputStreamReference);

			for (int i=0;i<=testDataWorkBookReference.getNumberOfSheets()-1;i++){
				if(testDataWorkBookReference.getSheetAt(i).getSheetName().equals(sheetName)){
					tableUploadMasterWorksheet=testDataWorkBookReference.getSheetAt(i);
					for(int j=2;j<=tableUploadMasterWorksheet.getPhysicalNumberOfRows()-1;j++){
						Row row=tableUploadMasterWorksheet.getRow(j);
						String automationID=row.getCell(1).getStringCellValue().trim();
						System.out.println(automationID);
						if(automationID.equalsIgnoreCase(AutomationID)){
							
							row.createCell(9).setCellValue(sro.getPlatformName().toString());
							row.createCell(10).setCellValue(sro.getBrowserNameVersion().toString());
							row.createCell(11).setCellValue(sro.getDateTimeOfExecution().toString());
							row.createCell(12).setCellValue(sro.getDurationOfExecution().toString());
							row.createCell(13).setCellValue(sro.getReasonIfFailed().toString());
							row.createCell(14).setCellValue(sro.getScenarioStatus().toString());
							
							FileOutputStream out= new FileOutputStream(testDataExcelFileReference);
							testDataWorkBookReference.write(out);
							out.close();
							testDataWorkBookReference.close();
							break;
						}
					}
				}
			}
		}
	/*
		public void GenResultsummary(ArrayList<ScenarioResultObject> sro){
			String headerLine[]={"Serial Number","Platform Name","Browser Name-Version","Lob","Product","Scenario ID","Date Time Of Execution","Duration Of Execution","Scenario Status","Reason If Failed","Type Of Failure","Scripter Name"};
			WorkbookBuilder GenerateExcelResult = new WorkbookBuilder();
			GenerateExcelResult.mkXlsx("ResultSummary", DBConnectClass.prop.getProperty("TestExecutionResultsFolder"), headerLine, sro);
					
		}*/
}

			


		