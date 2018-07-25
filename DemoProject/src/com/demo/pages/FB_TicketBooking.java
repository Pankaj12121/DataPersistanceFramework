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
import com.demo.databin.Resultbin;
@Entity
@Table(name="FB_TicketBooking")
public class FB_TicketBooking implements Serializable,Cloneable,GenericEntitybin,IFB_TicketBooking {
	
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
		@Column(name="TestCaseDescription")
		private String TestCaseDescription;
		@Column(name="StepsToExecute")
		private String StepsToExecute;
		@Column(name="TesterName")
		private String TesterName;
		@Column(name="ExpectedResult")
		private String ExpectedResult;
		@Column(name="ActualResult")
		private String ActualResult;
		@Column(name="Status")
		private String Status;
		/* (non-Javadoc)
		 * @see com.demo.pages.ITicketBooking#getSrNo()
		 */
		@Override
		public int getSrNo() {
			return srNo;
		}
		/* (non-Javadoc)
		 * @see com.demo.pages.ITicketBooking#setSrNo(int)
		 */
		@Override
		public void setSrNo(int srNo) {
			this.srNo = srNo;
		}
		/* (non-Javadoc)
		 * @see com.demo.pages.ITicketBooking#getAutomationID()
		 */
		@Override
		public String getAutomationID() {
			return automationID;
		}
		/* (non-Javadoc)
		 * @see com.demo.pages.ITicketBooking#setAutomationID(java.lang.String)
		 */
		@Override
		public void setAutomationID(String automationID) {
			this.automationID = automationID;
		}
		/* (non-Javadoc)
		 * @see com.demo.pages.ITicketBooking#getExecutionFlag()
		 */
		@Override
		public String getExecutionFlag() {
			return ExecutionFlag;
		}
		/* (non-Javadoc)
		 * @see com.demo.pages.ITicketBooking#setExecutionFlag(java.lang.String)
		 */
		@Override
		public void setExecutionFlag(String executionFlag) {
			ExecutionFlag = executionFlag;
		}
		/* (non-Javadoc)
		 * @see com.demo.pages.ITicketBooking#getTestCaseDescription()
		 */
		@Override
		public String getTestCaseDescription() {
			return TestCaseDescription;
		}
		/* (non-Javadoc)
		 * @see com.demo.pages.ITicketBooking#setTestCaseDescription(java.lang.String)
		 */
		@Override
		public void setTestCaseDescription(String testCaseDescription) {
			TestCaseDescription = testCaseDescription;
		}
		/* (non-Javadoc)
		 * @see com.demo.pages.ITicketBooking#getStepsToExecute()
		 */
		@Override
		public String getStepsToExecute() {
			return StepsToExecute;
		}
		/* (non-Javadoc)
		 * @see com.demo.pages.ITicketBooking#setStepsToExecute(java.lang.String)
		 */
		@Override
		public void setStepsToExecute(String stepsToExecute) {
			StepsToExecute = stepsToExecute;
		}
		/* (non-Javadoc)
		 * @see com.demo.pages.ITicketBooking#getTesterName()
		 */
		@Override
		public String getTesterName() {
			return TesterName;
		}
		/* (non-Javadoc)
		 * @see com.demo.pages.ITicketBooking#setTesterName(java.lang.String)
		 */
		@Override
		public void setTesterName(String testerName) {
			TesterName = testerName;
		}
		/* (non-Javadoc)
		 * @see com.demo.pages.ITicketBooking#getExpectedResult()
		 */
		@Override
		public String getExpectedResult() {
			return ExpectedResult;
		}
		/* (non-Javadoc)
		 * @see com.demo.pages.ITicketBooking#setExpectedResult(java.lang.String)
		 */
		@Override
		public void setExpectedResult(String expectedResult) {
			ExpectedResult = expectedResult;
		}
		/* (non-Javadoc)
		 * @see com.demo.pages.ITicketBooking#getActualResult()
		 */
		@Override
		public String getActualResult() {
			return ActualResult;
		}
		/* (non-Javadoc)
		 * @see com.demo.pages.ITicketBooking#setActualResult(java.lang.String)
		 */
		@Override
		public void setActualResult(String actualResult) {
			ActualResult = actualResult;
		}
		/* (non-Javadoc)
		 * @see com.demo.pages.ITicketBooking#getStatus()
		 */
		@Override
		public String getStatus() {
			return Status;
		}
		/* (non-Javadoc)
		 * @see com.demo.pages.ITicketBooking#setStatus(java.lang.String)
		 */
		@Override
		public void setStatus(String status) {
			Status = status;
		}
		
		

}
