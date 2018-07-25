package com.demo.tests;

import java.net.MalformedURLException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.demo.DBUtil.DBConnectClass;
import com.demo.applicationDatabin.ApplicationDataBin;
import com.demo.core.hibernate.TestDataHibernateUtil;
import com.demo.databin.Databin;
import com.demo.databin.Resultbin;
import com.demo.excelReport.ExcelReportGenerator;
import com.demo.flowcontrol.FlowControl;
import com.demo.framework.core.CustomAssert;
import com.demo.frameworkcore.AssertionType;
import com.demo.frameworkcore.BrowserInsatnce;
import com.demo.pages.FB_Login;
import com.demo.pages.FB_TicketBooking;
import com.demo.pages.FB_TicketBookingCreate;



public class CreateAndVerifyTicketBooking {
	private WebDriver driver;
	private Properties prop;
	BrowserInsatnce instance= new BrowserInsatnce();
	private static Connection dataDBConnectionObject;
	String className;
	CustomAssert customAssert;
	@SuppressWarnings("rawtypes")

	@DataProvider(name = "dp001")
	public Iterator<Object[]> dp001() {
		className=this.getClass().getSimpleName();
		ApplicationDataBin appbin= new ApplicationDataBin(FB_TicketBooking.class,className);
		prop=appbin.loadConfig();
		return appbin.getDataByiterator();
	}

	@Test(dataProvider = "dp001",threadPoolSize=5 ,groups={"functional","Sanity","PolicyCreation","demo","TC001"})
	public void createLogin1(List<Databin> testcasesData) {
		Resultbin resultBin= new Resultbin();
		for(Databin aTestCase:testcasesData){
			String automationID=aTestCase.getAutomationID();

			try {
				driver=	instance.setup(prop.getProperty("BrowserName"));
				customAssert= new CustomAssert(driver);
				driver.get(prop.getProperty("ApplicationURL"));
				FlowControl flowcontrol= new FlowControl(driver,aTestCase);
				flowcontrol.steps(resultBin,automationID);
				
				if (automationID.equalsIgnoreCase("CreateAndVerifyLogin_001")){
					customAssert.assertEquals(resultBin.getFbLoginCreate().get(0).getPassword(),resultBin.getFbLoginCreate().get(0).getPassword(),AssertionType.WARNING);
				}
			} catch (MalformedURLException e) {
				System.out.println("Login 1-> Exceucted test case from Test class "+ automationID);
				e.printStackTrace();
			}catch(AssertionError ae){			
				ae.printStackTrace();
			}finally{
			}
			System.out.println("Login 1-> Browser get closed in Test class for " + automationID);
		}

	}


	@AfterMethod()
	public void closeBrowser(){
		driver.close();
	}

	@BeforeSuite(alwaysRun=true,groups={"functional"})
	public void beforeSuite() throws SQLException{
		new DBConnectClass();
		System.out.println("I am in beforeSuite");

	}
	@AfterSuite(alwaysRun=true)
	public void aftersuite(){

		System.out.println("I am in AfterSuite");
		TestDataHibernateUtil hibernateinst= new TestDataHibernateUtil();
		hibernateinst.closeSession(ApplicationDataBin.getSession());
		System.out.println("closed hibernate session");
		ExcelReportGenerator Rgenerator= new ExcelReportGenerator();
		Rgenerator.excelReportGen();

	}


}
