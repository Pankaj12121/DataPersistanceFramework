package com.demo.pages;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import com.demo.databin.GenericEntitybin;

@Entity
@Table(name="FB_ScenarioDataFilter")

public class FB_ScenarioDataFilter implements GenericEntitybin,Cloneable,Serializable, IFB_scenarioDataFilter{
	 @ManyToMany(cascade = CascadeType.ALL)
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name="srNo")
	private int srNo;
	
	@Column(name="AutomationID")
	private String automationID;
	
	@Column(name="ExecutionFlag")
	private String ExecutionFlag;
	
	@Column(name="Login")
	private String Login;
	
	@Column(name="UserRole")
	private String UserRole;
	@Column(name="LeaveList")
	private String LeaveList;
	
	@Column(name="EmpList")
	private String EmpList;
	
	@Column(name="Candidates")
	private String Candidates;
	
	@Column(name="FBLoginList")
	private String fbLoginList;
	
	@Column(name="FBTicketbookingList")
	private String fBTicketbookingList;
	
	@Column(name="FBLoginCreateList")
	private String fbLoginCreateList;
	
	@Column(name="FBTicketBookingCreateList")
	private String fBTicketBookingCreateList;

	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_scenarioDataFilter#getSrNo()
	 */
	@Override
	public int getSrNo() {
		return srNo;
	}

	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_scenarioDataFilter#setSrNo(int)
	 */
	@Override
	public void setSrNo(int srNo) {
		this.srNo = srNo;
	}

	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_scenarioDataFilter#getAutomationID()
	 */
	@Override
	public String getAutomationID() {
		return automationID;
	}

	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_scenarioDataFilter#setAutomationID(java.lang.String)
	 */
	@Override
	public void setAutomationID(String automationID) {
		this.automationID = automationID;
	}

	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_scenarioDataFilter#getExecutionFlag()
	 */
	@Override
	public String getExecutionFlag() {
		return ExecutionFlag;
	}

	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_scenarioDataFilter#setExecutionFlag(java.lang.String)
	 */
	@Override
	public void setExecutionFlag(String executionFlag) {
		ExecutionFlag = executionFlag;
	}

	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_scenarioDataFilter#getLogin()
	 */
	@Override
	public String getLogin() {
		return Login;
	}

	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_scenarioDataFilter#setLogin(java.lang.String)
	 */
	@Override
	public void setLogin(String login) {
		Login = login;
	}

	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_scenarioDataFilter#getUserRole()
	 */
	@Override
	public String getUserRole() {
		return UserRole;
	}

	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_scenarioDataFilter#setUserRole(java.lang.String)
	 */
	@Override
	public void setUserRole(String userRole) {
		UserRole = userRole;
	}

	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_scenarioDataFilter#getLeaveList()
	 */
	@Override
	public String getLeaveList() {
		return LeaveList;
	}

	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_scenarioDataFilter#setLeaveList(java.lang.String)
	 */
	@Override
	public void setLeaveList(String leaveList) {
		LeaveList = leaveList;
	}

	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_scenarioDataFilter#getEmpList()
	 */
	@Override
	public String getEmpList() {
		return EmpList;
	}

	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_scenarioDataFilter#setEmpList(java.lang.String)
	 */
	@Override
	public void setEmpList(String empList) {
		EmpList = empList;
	}

	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_scenarioDataFilter#getCandidates()
	 */
	@Override
	public String getCandidates() {
		return Candidates;
	}

	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_scenarioDataFilter#setCandidates(java.lang.String)
	 */
	@Override
	public void setCandidates(String candidates) {
		Candidates = candidates;
	}

	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_scenarioDataFilter#getFbLoginList()
	 */
	@Override
	public String getFbLoginList() {
		return fbLoginList;
	}

	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_scenarioDataFilter#setFbLoginList(java.lang.String)
	 */
	@Override
	public void setFbLoginList(String fbLoginList) {
		this.fbLoginList = fbLoginList;
	}

	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_scenarioDataFilter#getfBTicketbookingList()
	 */
	@Override
	public String getfBTicketbookingList() {
		return fBTicketbookingList;
	}

	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_scenarioDataFilter#setfBTicketbookingList(java.lang.String)
	 */
	@Override
	public void setfBTicketbookingList(String fBTicketbookingList) {
		this.fBTicketbookingList = fBTicketbookingList;
	}

	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_scenarioDataFilter#getFbLoginCreateList()
	 */
	@Override
	public String getFbLoginCreateList() {
		return fbLoginCreateList;
	}

	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_scenarioDataFilter#setFbLoginCreateList(java.lang.String)
	 */
	@Override
	public void setFbLoginCreateList(String fbLoginCreateList) {
		this.fbLoginCreateList = fbLoginCreateList;
	}

	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_scenarioDataFilter#getfBTicketBookingCreateList()
	 */
	@Override
	public String getfBTicketBookingCreateList() {
		return fBTicketBookingCreateList;
	}

	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_scenarioDataFilter#setfBTicketBookingCreateList(java.lang.String)
	 */
	@Override
	public void setfBTicketBookingCreateList(String fBTicketBookingCreateList) {
		this.fBTicketBookingCreateList = fBTicketBookingCreateList;
	}
	
	
	

	
}
