package com.demo.pages;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.demo.databin.GenericEntitybin;

@Entity
@Table(name="Login")

public class Login implements GenericEntitybin, Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	
	@Column(name="srNo")
	private String srNo;
	@Column(name="AutomationID")
	private String AutomationID;
	@Column(name="Action")
	private String Action;
	@Column(name="ExecutionFlag")
	private String ExecutionFlag;
	@Column(name="ConfigUserName")
	private String ConfigUserName;
	@Column(name="UserName")
	private String UserName;
	@Column(name="ConfigPassword")
	private String ConfigPassword;
	@Column(name="Password")
	private String Password;
	@Column(name="ConfigSubmit")
	private String ConfigSubmit;
	public String getSrNo() {
		return srNo;
	}
	public void setSrNo(String srNo) {
		this.srNo = srNo;
	}
	public String getAutomationID() {
		return AutomationID;
	}
	public void setAutomationID(String automationID) {
		AutomationID = automationID;
	}
	public String getAction() {
		return Action;
	}
	public void setAction(String action) {
		Action = action;
	}
	public String getExecutionFlag() {
		return ExecutionFlag;
	}
	public void setExecutionFlag(String executionFlag) {
		ExecutionFlag = executionFlag;
	}
	public String getConfigUserName() {
		return ConfigUserName;
	}
	public void setConfigUserName(String configUserName) {
		ConfigUserName = configUserName;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getConfigPassword() {
		return ConfigPassword;
	}
	public void setConfigPassword(String configPassword) {
		ConfigPassword = configPassword;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getConfigSubmit() {
		return ConfigSubmit;
	}
	public void setConfigSubmit(String configSubmit) {
		ConfigSubmit = configSubmit;
	}
	
	
	
	

}
