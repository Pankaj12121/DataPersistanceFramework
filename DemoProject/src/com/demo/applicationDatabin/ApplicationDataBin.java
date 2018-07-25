package com.demo.applicationDatabin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.apache.poi.ss.formula.functions.T;
import org.hibernate.Criteria;
import org.hibernate.FlushMode;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.testng.annotations.AfterSuite;

import com.demo.core.hibernate.TestDataHibernateUtil;
import com.demo.databin.Databin;
import com.demo.databin.GenericEntitybin;
import com.demo.frameworkcore.ScenarioUnderExecution;
import com.demo.pages.FB_LoginCreate;
import com.demo.pom.FB_LoginPOM;

@SuppressWarnings("serial")
public class ApplicationDataBin implements Cloneable,Serializable{
	private static Session sessionTestManager;
	public FileInputStream input;
	public Properties prop;
	public Class persistanceClass;
	List<? extends GenericEntitybin> baseClassScenarioListIDs;
	ArrayList<String> configurationFileScenarioListIDs;
	public ApplicationDataBin(Class dataClass,String className){
		loadConfig();
		ScenarioUnderExecution scenarioList= new ScenarioUnderExecution();
		sessionTestManager=null;
		sessionTestManager=TestDataHibernateUtil.getInstance().getCurrentSession();
		this.persistanceClass=dataClass;
		baseClassScenarioListIDs=getAllExecutionTestStepsByExecutionTestScenarioReference(className);
		configurationFileScenarioListIDs=scenarioList.listOfTestScenariosUnderExecution;
	}


	@SuppressWarnings("unchecked")
	public Iterator<Object[]> getDataByiterator(){
		
		ArrayList<Object[]>singleScenarioData= new ArrayList<Object[]>();
		ArrayList<Object[]>multipleScenarioData= new ArrayList<Object[]>();

		try{

			for (int i=0;i<=baseClassScenarioListIDs.size()-1;i++){
				String automationID= baseClassScenarioListIDs.get(i).getAutomationID();

				if (configurationFileScenarioListIDs.contains(automationID)||
						configurationFileScenarioListIDs.contains("none")){
					Databin databin= new Databin(sessionTestManager, automationID);
					singleScenarioData.add(new Object[] {Arrays.asList(databin)});
					//scenarioData= (ArrayList<Object[]>) new ArrayList<Object>(test1).clone();
					System.out.println("In Application bin "+ "' "+automationID +" '"+ " added for execution");

				}

			}
			multipleScenarioData.addAll(singleScenarioData);

		}catch(Exception e){

			e.printStackTrace();
			return null;
		}finally{
			System.out.println("in application databin");

		}
		return multipleScenarioData.iterator();

	}
	
	@SuppressWarnings("unchecked")
	public List<? extends GenericEntitybin> getAllExecutionTestStepsByExecutionTestScenarioReference(String className) {
		List<? extends GenericEntitybin>returnObject=null;
		Transaction t=sessionTestManager.beginTransaction();
		try {
			Criteria criteria = sessionTestManager.createCriteria(persistanceClass).setFlushMode(FlushMode.COMMIT);
			criteria.add(Restrictions.like("automationID", className+"%"));
			criteria.add(Restrictions.eq("ExecutionFlag", "yes"));
			criteria.addOrder(Order.asc("srNo"));
			returnObject = criteria.list();
			t.commit();
		}
		catch(Exception e) {
			t.rollback();
		}
		return returnObject;
	}
	
	public void addUpdateRecord(Class persistanceClass){
		
		
		
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
	public static Session getSession(){
		
		return sessionTestManager;
	}
}
