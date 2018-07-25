package com.demo.DBUtil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.demo.dbUploader.ExcelToDB;

public class DBConnectClass {
	public static Properties prop;
	private FileInputStream input;
	private Connection dataDBConnectionObject;

	public DBConnectClass() throws SQLException{
		loadConfig();
		if(prop.getProperty("UploadAllDataTables").equalsIgnoreCase("yes"))
		databaseConnMethod();
		else
		System.out.println("Please make the flag to YES to upload the data at config file");
	}
	public void databaseConnMethod() throws SQLException {

		String dbConnectionURL;
		String DBServerAddress= prop.getProperty("TestScenarioDBServer");
		String DatabaseName= prop.getProperty("TestScenarioDBSchemaName");
		String testDataUploadTestDataFilePath="C:\\TestData\\testData.xlsx";
		dbConnectionURL = "jdbc:sqlserver:"+DBServerAddress+";databaseName="+DatabaseName+";portNumber=1433;integratedSecurity=true";
		//dbConnectionURL = "jdbc:sqlserver://INDHYDELP029\\SQLEXPRESS\\;databaseName=TEBTTestAutomationDataDB;portNumber=1433;integratedSecurity=true";
		try {
			dataDBConnectionObject = DriverManager.getConnection(dbConnectionURL);

			ExcelToDB db= new ExcelToDB();
			db.uploadTestDataFile(testDataUploadTestDataFilePath, dataDBConnectionObject);
			dataDBConnectionObject.close();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}catch (FileNotFoundException e2){
			e2.printStackTrace();
		}catch (IOException e3){
			e3.printStackTrace();
		}finally{
			dataDBConnectionObject.close();
			System.out.println("DB connection get closed successfully !!!");
		}

	}

	public Properties loadConfig(){

		try {
			input= new FileInputStream("config.properties");

			prop= new Properties();
			prop.load(input);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1){
			e1.printStackTrace();
		}

		return prop;
	}
}
