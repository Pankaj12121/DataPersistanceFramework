package com.demo.databin;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ManyToMany;

import org.hibernate.Criteria;
import org.hibernate.FlushMode;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.demo.pages.Candidates;
import com.demo.pages.EmpList;
import com.demo.pages.FB_Login;
import com.demo.pages.FB_LoginCreate;
import com.demo.pages.FB_TicketBooking;
import com.demo.pages.FB_TicketBookingCreate;
import com.demo.pages.FB_ScenarioDataFilter;
import com.demo.pages.LeaveList;
import com.demo.pages.Login;
import com.demo.pages.TestSteps;
import com.demo.pages.UserRole;



public class Databin implements GenericEntitybin,Cloneable,Serializable{
	 @ManyToMany(cascade = CascadeType.ALL)
	private static final long serialVersionUID = 1L;
	Session sessionTestData;
	String AutomationID;
	String ExecutionFlag;
	//scenarioDataFilter sfilter;
	List<Login> login;
	List<Candidates>candidates;
	List<EmpList>emplist;
	List<LeaveList>leavelist;
	List<UserRole>userrole;
	List<FB_ScenarioDataFilter>scenariodatafilter;
	List<TestSteps>testSteps;
	List<FB_Login>fbLogin;
	List<FB_TicketBooking>fbTicketbooking;
	List<FB_LoginCreate>fbLoginCreate;
	List<FB_TicketBookingCreate>fbTicketbookingCreate;


	public <T> Databin(Session hiberSession, String AutomationID){
		this.sessionTestData=hiberSession;
		this.AutomationID=AutomationID;
		scenariodatafilter=getScenariodatafilter();	
		login= getLogin();
		candidates= getCandidates();
		emplist= getEmplist();
		leavelist= getLeavelist();
		userrole= getUserrole();
		testSteps=getTestSteps();
		fbLogin=getFbLogin();
		fbTicketbooking=getFbTicketbooking();
		fbLoginCreate=getFbLoginCreate();
		fbTicketbookingCreate=getFbTicketbookingCreate();
	
	}



	public String getAutomationID() {
		return AutomationID;
	}



	public void setAutomationID(String automationID) {
		AutomationID = automationID;
	}



	public String getExecutionFlag() {
		return ExecutionFlag;
	}



	public void setExecutionFlag(String executionFlag) {
		ExecutionFlag = executionFlag;
	}



	public List<TestSteps> getTestSteps() {
		testSteps=getAllRecordsForTestSteps(AutomationID);

		return testSteps;
	}



	public void setTestSteps(List<TestSteps> testSteps) {
		this.testSteps = testSteps;
	}



	public  List<FB_ScenarioDataFilter> getScenariodatafilter() {
		scenariodatafilter=getAllRecordsForCriteria(AutomationID);
		return scenariodatafilter;
	}


	public void setScenariodatafilter(List<FB_ScenarioDataFilter> scenariodatafilter) {
		this.scenariodatafilter = scenariodatafilter;
	}


	public List<Login> getLogin() {

		if(scenariodatafilter.get(0).getLogin().equalsIgnoreCase("yes"))
			login=getAllExecutionTestStepsByExecutionTestScenarioReference(Login.class,AutomationID);
		return login;
	}

	public void setLogin(List<Login> login) {
		this.login = login;
	}



	public List<Candidates> getCandidates() {

		if(scenariodatafilter.get(0).getCandidates().equalsIgnoreCase("yes"))
			candidates=getAllExecutionTestStepsByExecutionTestScenarioReference(Candidates.class,AutomationID);
		return candidates;
	}


	public void setCandidates(List<Candidates> candidates) {
		this.candidates = candidates;
	}


	public List<EmpList> getEmplist() {
		if(scenariodatafilter.get(0).getEmpList().equalsIgnoreCase("yes"))
			emplist=getAllExecutionTestStepsByExecutionTestScenarioReference(EmpList.class,AutomationID);
		return emplist;
	}


	public void setEmplist(List<EmpList> emplist) {
		this.emplist = emplist;
	}


	public List<LeaveList> getLeavelist() {
		if(scenariodatafilter.get(0).getLeaveList().equalsIgnoreCase("yes"))
			leavelist=getAllExecutionTestStepsByExecutionTestScenarioReference(LeaveList.class,AutomationID);
		return leavelist;
	}


	public void setLeavelist(List<LeaveList> leavelist) {
		this.leavelist = leavelist;
	}


	public List<UserRole> getUserrole() {
		if(scenariodatafilter.get(0).getUserRole().equalsIgnoreCase("yes"))
			userrole=getAllExecutionTestStepsByExecutionTestScenarioReference(UserRole.class,AutomationID);
		return userrole;
	}


	public void setUserrole(List<UserRole> userrole) {
		this.userrole = userrole;
	}


	public List<FB_Login> getFbLogin() {
		if(scenariodatafilter.get(0).getFbLoginList().equalsIgnoreCase("yes"))
			fbLogin=getAllExecutionTestStepsByExecutionTestScenarioReference(FB_Login.class,AutomationID);
		return fbLogin;
	}



	public void setFbLogin(List<FB_Login> fbLogin) {
		this.fbLogin = fbLogin;
	}



	public List<FB_TicketBooking> getFbTicketbooking() {
		if(scenariodatafilter.get(0).getfBTicketbookingList().equalsIgnoreCase("yes"))
			fbTicketbooking=getAllExecutionTestStepsByExecutionTestScenarioReference(FB_TicketBooking.class,AutomationID);
		return fbTicketbooking;
	}



	public void setFbTicketbooking(List<FB_TicketBooking> fbTicketbooking) {
		
		
		this.fbTicketbooking = fbTicketbooking;
	}

	


	public List<FB_LoginCreate> getFbLoginCreate() {
		if(scenariodatafilter.get(0).getFbLoginCreateList().equalsIgnoreCase("yes"))
			fbLoginCreate=getAllExecutionTestStepsByExecutionTestScenarioReference(FB_LoginCreate.class,AutomationID);
		
		return fbLoginCreate;
	}



	public void setFbLoginCreate(List<FB_LoginCreate> fbLoginCreate) {
		this.fbLoginCreate = fbLoginCreate;
	}



	public List<FB_TicketBookingCreate> getFbTicketbookingCreate() {
		if(scenariodatafilter.get(0).getfBTicketBookingCreateList().equalsIgnoreCase("yes"))
			fbTicketbookingCreate=getAllExecutionTestStepsByExecutionTestScenarioReference(FB_TicketBookingCreate.class,AutomationID);
		
		return fbTicketbookingCreate;
	}



	public void setFbTicketbookingCreate(List<FB_TicketBookingCreate> fbTicketbookingCreate) {
		this.fbTicketbookingCreate = fbTicketbookingCreate;
	}



	@SuppressWarnings("unchecked")
	public <T> List<T> getAllExecutionTestStepsByExecutionTestScenarioReference(Class persistanceClass,String TestcaseID) {
		List<T> returnObject = null;
		Transaction t=sessionTestData.beginTransaction();

		try {
			Criteria criteria = sessionTestData.createCriteria(persistanceClass).setFlushMode(FlushMode.COMMIT);
			criteria.add(Restrictions.eq("automationID", TestcaseID));
			criteria.addOrder(Order.asc("srNo"));
			returnObject = criteria.list();
			t.commit();
		}
		catch(Exception e) {
			t.rollback();
		}
		return returnObject;
	}
	@SuppressWarnings("unchecked")
	public <T> List<T> getAllRecordsForCriteria ( String TestcaseID) {
		List<T> returnObject = null;
		Transaction t=sessionTestData.beginTransaction();
		try {
			Criteria criteria = sessionTestData.createCriteria(FB_ScenarioDataFilter.class).setFlushMode(FlushMode.COMMIT);
			criteria.add(Restrictions.eq("automationID", TestcaseID));
			criteria.addOrder(Order.asc("srNo"));
			returnObject = criteria.list();
			t.commit();

		}
		catch(Exception e) {
			t.rollback();
			e.printStackTrace();
		}
		return returnObject;
	}
	@SuppressWarnings("unchecked")
	public <T> List<T> getAllRecordsForTestSteps ( String TestcaseID) {
		List<T> returnObject = null;
		Transaction t=sessionTestData.beginTransaction();
		try {
			Criteria criteria = sessionTestData.createCriteria(TestSteps.class).setFlushMode(FlushMode.COMMIT);
			criteria.add(Restrictions.eq("automationID", TestcaseID));
			criteria.add(Restrictions.eq("ExecutionFlag", "yes"));
			criteria.addOrder(Order.asc("srNo"));
			returnObject = criteria.list();
			t.commit();

		}
		catch(Exception e) {
			t.rollback();
			e.printStackTrace();
		}
		return returnObject;
	}

	/*public static <T> ArrayList<T> getObjectByReference(List<T> list,String keys){
		ArrayList<T> filteredDataList=new ArrayList<T>();
		if (keys.equalsIgnoreCase("")){
			return filteredDataList;
		}
		String[] key=keys.split(",");
		for(int i=0;i<key.length;i++){
			for(T t:list){
				if(((GenericEntity)t).getReference().trim().equalsIgnoreCase(key[i].trim())){
					filteredDataList.add(t);
				}
			}
		}
		return filteredDataList;
	}*/

	public void updateRecordsForCriteria(Object object){
		Transaction t=sessionTestData.beginTransaction();
		try {
			sessionTestData.update(object);
			sessionTestData.persist(object);
			t.commit();
		}
		catch(Exception e) {
			t.rollback();
			e.printStackTrace();
			System.out.println("Entity Updation Error => "+e.getClass().getSimpleName());
		}
	}
}









