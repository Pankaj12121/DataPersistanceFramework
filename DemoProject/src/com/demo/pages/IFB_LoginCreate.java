package com.demo.pages;

public interface IFB_LoginCreate {

	int getSrNo();

	void setSrNo(int srNo);

	String getAutomationID();

	void setAutomationID(String automationID);

	String getAction();

	int getIteration();

	void setIteration(int iteration);

	void setAction(String action);

	String getExecutionFlag();

	void setExecutionFlag(String executionFlag);

	String getConfigUserNameExecutionFlag();

	void setConfigUserNameExecutionFlag(String configUserName);

	String getConfigUserName();

	void setConfigUserName(String configUserName);

	String getUserName();

	void setUserName(String userName);

	String getConfigPassword();

	void setConfigPassword(String configPassword);

	String getPassword();

	void setPassword(String password);

	String getConfigSubmit();

	void setConfigSubmit(String configSubmit);
	
	String getConfigFooter();

	void setConfigFooter(String configFooter);
	
	String getFooter();

	void setFooter(String footer);


}