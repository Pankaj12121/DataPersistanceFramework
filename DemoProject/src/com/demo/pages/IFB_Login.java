package com.demo.pages;

public interface IFB_Login {

	int getSrNo();

	void setSrNo(int srNo);

	String getAutomationID();

	void setAutomationID(String automationID);

	String getExecutionFlag();

	void setExecutionFlag(String executionFlag);

	String getTestCaseDescription();

	void setTestCaseDescription(String testCaseDescription);

	String getStepsToExecute();

	void setStepsToExecute(String stepsToExecute);

	String getTesterName();

	void setTesterName(String testerName);

	String getExpectedResult();

	void setExpectedResult(String expectedResult);

	String getActualResult();

	void setActualResult(String actualResult);

	String getStatus();

	void setStatus(String status);

}