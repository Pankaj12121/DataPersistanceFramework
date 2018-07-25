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
@Table(name="FB_TestSteps")

public class TestSteps implements GenericEntitybin,Cloneable, Serializable, ITestSteps{
	 @ManyToMany(cascade = CascadeType.ALL)
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	
	@Column(name="srNo")
	private int srNo;
	
	@Column(name="AutomationID")
	private String automationID;
	
	@Column(name="ExecutionFlag")
	private String ExecutionFlag;
	
	@Column(name="StepName")
	private String StepName;

	/* (non-Javadoc)
	 * @see com.demo.pages.ITestSteps#getSrNo()
	 */
	@Override
	public int getSrNo() {
		return srNo;
	}

	/* (non-Javadoc)
	 * @see com.demo.pages.ITestSteps#setSrNo(java.lang.String)
	 */
	@Override
	public void setSrNo(int srNo) {
		this.srNo = srNo;
	}

	/* (non-Javadoc)
	 * @see com.demo.pages.ITestSteps#getAutomationID()
	 */
	@Override
	public String getAutomationID() {
		return automationID;
	}

	/* (non-Javadoc)
	 * @see com.demo.pages.ITestSteps#setAutomationID(java.lang.String)
	 */
	@Override
	public void setAutomationID(String automationID) {
		this.automationID = automationID;
	}

	/* (non-Javadoc)
	 * @see com.demo.pages.ITestSteps#getStepName()
	 */
	@Override
	public String getStepName() {
		return StepName;
	}

	/* (non-Javadoc)
	 * @see com.demo.pages.ITestSteps#setStepName(java.lang.String)
	 */
	@Override
	public void setStepName(String stepName) {
		StepName = stepName;
	}

	/* (non-Javadoc)
	 * @see com.demo.pages.ITestSteps#getExecutionFlag()
	 */
	@Override
	public String getExecutionFlag() {
		return ExecutionFlag;
	}

	/* (non-Javadoc)
	 * @see com.demo.pages.ITestSteps#setExecutionFlag(java.lang.String)
	 */
	@Override
	public void setExecutionFlag(String executionFlag) {
		ExecutionFlag = executionFlag;
	}


}
