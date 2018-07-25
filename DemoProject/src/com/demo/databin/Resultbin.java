package com.demo.databin;

import java.util.ArrayList;
import java.util.List;

import com.demo.pages.Candidates;
import com.demo.pages.EmpList;
import com.demo.pages.FB_Login;
import com.demo.pages.FB_LoginCreate;
import com.demo.pages.FB_ScenarioDataFilter;
import com.demo.pages.FB_TicketBooking;
import com.demo.pages.FB_TicketBookingCreate;
import com.demo.pages.LeaveList;
import com.demo.pages.Login;
import com.demo.pages.TestSteps;
import com.demo.pages.UserRole;

public class Resultbin {
	
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
	
	public Resultbin(){
	
	login= new ArrayList<>();
	candidates= new ArrayList<>();
	emplist= new ArrayList<>();
	leavelist= new ArrayList<>();
	userrole= new ArrayList<>();
	scenariodatafilter= new ArrayList<>();
	testSteps= new ArrayList<>();
	fbLogin= new ArrayList<>();
	fbTicketbooking= new ArrayList<>();
	fbLoginCreate= new ArrayList<>();
	fbTicketbookingCreate= new ArrayList<>();
	
	
	}

	public List<Login> getLogin() {
		return login;
	}

	public void setLogin(List<Login> login) {
		this.login = login;
	}

	public List<Candidates> getCandidates() {
		return candidates;
	}

	public void setCandidates(List<Candidates> candidates) {
		this.candidates = candidates;
	}

	public List<EmpList> getEmplist() {
		return emplist;
	}

	public void setEmplist(List<EmpList> emplist) {
		this.emplist = emplist;
	}

	public List<LeaveList> getLeavelist() {
		return leavelist;
	}

	public void setLeavelist(List<LeaveList> leavelist) {
		this.leavelist = leavelist;
	}

	public List<UserRole> getUserrole() {
		return userrole;
	}

	public void setUserrole(List<UserRole> userrole) {
		this.userrole = userrole;
	}

	public List<FB_ScenarioDataFilter> getScenariodatafilter() {
		return scenariodatafilter;
	}

	public void setScenariodatafilter(List<FB_ScenarioDataFilter> scenariodatafilter) {
		this.scenariodatafilter = scenariodatafilter;
	}

	public List<TestSteps> getTestSteps() {
		return testSteps;
	}

	public void setTestSteps(List<TestSteps> testSteps) {
		this.testSteps = testSteps;
	}

	public List<FB_Login> getFbLogin() {
		return fbLogin;
	}

	public void setFbLogin(List<FB_Login> fbLogin) {
		this.fbLogin = fbLogin;
	}

	public List<FB_TicketBooking> getFbTicketbooking() {
		return fbTicketbooking;
	}

	public void setFbTicketbooking(List<FB_TicketBooking> fbTicketbooking) {
		this.fbTicketbooking = fbTicketbooking;
	}

	public List<FB_LoginCreate> getFbLoginCreate() {
		return fbLoginCreate;
	}

	public void setFbLoginCreate(List<FB_LoginCreate> fbLoginCreate) {
		this.fbLoginCreate = fbLoginCreate;
	}

	public List<FB_TicketBookingCreate> getFbTicketbookingCreate() {
		return fbTicketbookingCreate;
	}

	public void setFbTicketbookingCreate(List<FB_TicketBookingCreate> fbTicketbookingCreate) {
		this.fbTicketbookingCreate = fbTicketbookingCreate;
	}
	
	

}
