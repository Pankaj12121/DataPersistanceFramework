package com.demo.excelReport;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.automationtesting.excelreport.Xl;
import org.testng.ITestContext;
import org.testng.TestRunner;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
@Test
public class ExcelReportGenerator {
	public String folderLocation;
	public String FileNameExcel;
	public String TestNGReportPath;
	public void excelReportGen() {
		try {
			//Xl.generateReport("myTest.xls");
			dir();
			//Xl.generateReport(folderLocation, FileNameExcel);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	 private Date getTime(long millis) {
	        Calendar calendar = Calendar.getInstance();
	        calendar.setTimeInMillis(millis);
	        return calendar.getTime();      
	    }

	    public String dir(){
			Date now = new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_hh-mm-ss");
			String time = dateFormat.format(now);
			folderLocation="C:\\TestNGReport\\";
			File dir = new File("ResultSummary"+time+".xlsx");
			FileNameExcel= dir.toString();
			TestNGReportPath=folderLocation+FileNameExcel;
			System.out.println(FileNameExcel);
			//dir.mkdir();
			return FileNameExcel;
		}
	    @BeforeTest(groups={"functional"})
	    public void setup(ITestContext ctx) {
	        TestRunner runner = (TestRunner) ctx;
	        runner.setOutputDirectory(TestNGReportPath);
	    }
	}




