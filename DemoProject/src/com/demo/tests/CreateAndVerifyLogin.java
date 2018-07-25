package com.demo.tests;

import java.io.IOException;
import java.net.MalformedURLException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.TestRunner;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.demo.DBUtil.DBConnectClass;
import com.demo.applicationDatabin.ApplicationDataBin;
import com.demo.applicationDatabin.TestResultUtility;
import com.demo.core.hibernate.TestDataHibernateUtil;
import com.demo.databin.Databin;
import com.demo.databin.Resultbin;
import com.demo.dbUploader.ExcelToDB;
import com.demo.excelReport.ExcelReportGenerator;
import com.demo.flowcontrol.FlowControl;
import com.demo.framework.core.CustomAssert;
import com.demo.framework.core.scenarioResult.ScenarioResultCollection;
import com.demo.framework.core.scenarioResult.ScenarioResultObject;
import com.demo.framework.core.scenarioResult.ScenarioResultStringGen;
import com.demo.framework.core.scenarioResult.WriteScenarioResultInExcel;
import com.demo.frameworkcore.AssertionType;
import com.demo.frameworkcore.BrowserInsatnce;
import com.demo.pages.FB_Login;

public class CreateAndVerifyLogin{

	private WebDriver driver;
	private Properties prop;
	BrowserInsatnce instance= new BrowserInsatnce();
	private static Connection dataDBConnectionObject;
	String className;
	String baseClassName;
	CustomAssert customAssert;
	ScenarioResultObject sro;
	String scenarioStatus="skipped";
	long exetime;
	@SuppressWarnings("rawtypes")

	@DataProvider(name = "dp001")
	public Iterator<Object[]> dp001() {
		className=this.getClass().getSimpleName();
		baseClassName=FB_Login.class.getSimpleName();
		ApplicationDataBin appbin= new ApplicationDataBin(FB_Login.class,className);
		prop=appbin.loadConfig();
		return appbin.getDataByiterator();
	}

	@Test(dataProvider = "dp001",threadPoolSize=5 ,groups={"functional","Sanity","PolicyCreation","demo","TC001"})
	public void createLogin1(List<Databin> testcasesData) {
		sro= new ScenarioResultObject();
		Resultbin resultBin= new Resultbin();
		for(Databin aTestCase:testcasesData){

			String automationID=aTestCase.getAutomationID();

			try {
				StopWatch ScenarioWatch = new StopWatch();
				ScenarioWatch.reset();
				ScenarioWatch.start();
				driver=	instance.setup(prop.getProperty("BrowserName"));
				customAssert= new CustomAssert(driver);
				driver.get(prop.getProperty("ApplicationURL"));
				FlowControl flowcontrol= new FlowControl(driver,aTestCase);
				flowcontrol.steps(resultBin,automationID);
				ScenarioWatch.stop();
				sro.setBrowserNameVersion(prop.getProperty("BrowserName"));
				sro.setScenarioID(automationID);;
				sro.setDurationOfExecution(ScenarioWatch.getTime());
				sro.setScripterName(aTestCase.getFbLogin().get(0).getTesterName());
				sro.setDateTimeOfExecution(Calendar.getInstance());
				sro.setPlatformName(prop.getProperty("Platform"));
				sro.setProductName(prop.getProperty("ProjectName"));
				sro.setLobName(prop.getProperty("ProductName"));
				sro.setTypeOfFailure("No Error");
				exetime= ScenarioWatch.getTime();
				if (automationID.equalsIgnoreCase("CreateAndVerifyLogin_001")){
					customAssert.assertEquals(resultBin.getFbLoginCreate().get(1).getFooter(),resultBin.getFbLoginCreate().get(0).getFooter(),AssertionType.WARNING);
				}
			} catch(NullPointerException asserterror) {
				System.out.println("Login 1-> Exceucted test case from Test class "+ automationID);
				asserterror.printStackTrace();
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				try {
					new TestResultUtility(customAssert,automationID, sro,baseClassName);
					ScenarioResultCollection.getInstance().addListResultCollection(sro);
				} catch (IOException e) {
					e.printStackTrace();
				}	
			}
		}
	}

	@Test(dataProvider = "dp001",threadPoolSize=5 ,groups={"functional","Sanity","PolicyCreation","demo","TC001"})
	public void createLogin2(List<Databin> testcasesData) {
		sro= new ScenarioResultObject();
		Resultbin resultBin= new Resultbin();
		for(Databin aTestCase:testcasesData){

			String automationID=aTestCase.getAutomationID();

			try {
				StopWatch ScenarioWatch = new StopWatch();
				ScenarioWatch.reset();
				ScenarioWatch.start();
				driver=	instance.setup(prop.getProperty("BrowserName"));
				customAssert= new CustomAssert(driver);
				driver.get(prop.getProperty("ApplicationURL"));
				FlowControl flowcontrol= new FlowControl(driver,aTestCase);
				flowcontrol.steps(resultBin,automationID);
				ScenarioWatch.stop();
				sro.setBrowserNameVersion(prop.getProperty("BrowserName"));
				sro.setScenarioID(automationID);;
				sro.setDurationOfExecution(ScenarioWatch.getTime());
				sro.setScripterName(aTestCase.getFbLogin().get(0).getTesterName());
				sro.setDateTimeOfExecution(Calendar.getInstance());
				sro.setPlatformName(prop.getProperty("Platform"));
				sro.setProductName(prop.getProperty("ProjectName"));
				sro.setLobName(prop.getProperty("ProductName"));
				sro.setTypeOfFailure("No Error");
				exetime= ScenarioWatch.getTime();
				if (automationID.equalsIgnoreCase("CreateAndVerifyLogin_001")){
					customAssert.assertEquals(resultBin.getFbLoginCreate().get(1).getFooter(),resultBin.getFbLoginCreate().get(0).getFooter(),AssertionType.WARNING);
				}
			} catch(NullPointerException asserterror) {
				System.out.println("Login 1-> Exceucted test case from Test class "+ automationID);
				asserterror.printStackTrace();
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				try {
					new TestResultUtility(customAssert,automationID, sro,baseClassName);
					ScenarioResultCollection.getInstance().addListResultCollection(sro);
				} catch (IOException e) {
					e.printStackTrace();
				}	
			}
		}
	}
	@Test(dataProvider = "dp001",threadPoolSize=5 ,groups={"functional","Sanity","PolicyCreation","demo","TC001"})
	public void createLogin3(List<Databin> testcasesData) {
		sro= new ScenarioResultObject();
		Resultbin resultBin= new Resultbin();
		for(Databin aTestCase:testcasesData){

			String automationID=aTestCase.getAutomationID();

			try {
				StopWatch ScenarioWatch = new StopWatch();
				ScenarioWatch.reset();
				ScenarioWatch.start();
				driver=	instance.setup(prop.getProperty("BrowserName"));
				customAssert= new CustomAssert(driver);
				driver.get(prop.getProperty("ApplicationURL"));
				FlowControl flowcontrol= new FlowControl(driver,aTestCase);
				flowcontrol.steps(resultBin,automationID);
				ScenarioWatch.stop();
				sro.setBrowserNameVersion(prop.getProperty("BrowserName"));
				sro.setScenarioID(automationID);;
				sro.setDurationOfExecution(ScenarioWatch.getTime());
				sro.setScripterName(aTestCase.getFbLogin().get(0).getTesterName());
				sro.setDateTimeOfExecution(Calendar.getInstance());
				sro.setPlatformName(prop.getProperty("Platform"));
				sro.setProductName(prop.getProperty("ProjectName"));
				sro.setLobName(prop.getProperty("ProductName"));
				sro.setTypeOfFailure("No Error");
				exetime= ScenarioWatch.getTime();
				if (automationID.equalsIgnoreCase("CreateAndVerifyLogin_001")){
					customAssert.assertEquals(resultBin.getFbLoginCreate().get(1).getFooter(),resultBin.getFbLoginCreate().get(0).getFooter(),AssertionType.WARNING);
				}
			} catch(NullPointerException asserterror) {
				System.out.println("Login 1-> Exceucted test case from Test class "+ automationID);
				asserterror.printStackTrace();
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				try {
					new TestResultUtility(customAssert,automationID, sro,baseClassName);
					ScenarioResultCollection.getInstance().addListResultCollection(sro);
				} catch (IOException e) {
					e.printStackTrace();
				}	
			}
		}
	}




			@AfterMethod()
			public void closeBrowser(){
				driver.close();
			}

			/*@BeforeSuite(alwaysRun=true)
	public void beforeSuite() throws SQLException{
		new DBConnectClass();
		System.out.println("I am in beforeSuite");

	}*/
			@AfterSuite(alwaysRun=true)
			public void aftersuite(){

				System.out.println("I am in AfterSuite");
				TestDataHibernateUtil hibernateinst= new TestDataHibernateUtil();
				hibernateinst.closeSession(ApplicationDataBin.getSession());
				System.out.println("closed hibernate session");
				ExcelReportGenerator Rgenerator= new ExcelReportGenerator();
				Rgenerator.excelReportGen();
				String fileName=Rgenerator.FileNameExcel;
				String folderName=Rgenerator.folderLocation;
				new WriteScenarioResultInExcel("ResultSummary",folderName,ScenarioResultStringGen.ResultSetInStringBuilder(ScenarioResultCollection.getListOfAllScenarioResult()));

			}
			@BeforeSuite(alwaysRun=true)
			public void GenReport(ITestContext ctx) throws SQLException{
				new DBConnectClass();
				System.out.println("In before suite");
				TestRunner runner = (TestRunner) ctx;
				runner.setOutputDirectory("C:\\TestNGReport\\");


			}


		}





