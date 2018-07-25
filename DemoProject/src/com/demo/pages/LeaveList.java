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
@Table(name="LeaveList")

public class LeaveList implements GenericEntitybin, Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	
	@Column(name="TestCaseID")
	private String TestcaseID;
	
	@Column(name="forms")
	private String forms;
	
	@Column(name="tos")
	private String tos;
	
	@Column(name="employee")
	private String employee;
	
	@Column(name="subUnit")
	private String subUnit;

	

	public String getTestcaseID() {
		return TestcaseID;
	}

	public void setTestcaseID(String testcaseID) {
		TestcaseID = testcaseID;
	}

	public String getForms() {
		return forms;
	}

	public void setForms(String forms) {
		this.forms = forms;
	}

	public String getTos() {
		return tos;
	}

	public void setTos(String tos) {
		this.tos = tos;
	}

	public String getEmployee() {
		return employee;
	}

	public void setEmployee(String employee) {
		this.employee = employee;
	}

	public String getSubUnit() {
		return subUnit;
	}

	public void setSubUnit(String subUnit) {
		this.subUnit = subUnit;
	}

	@Override
	public String getAutomationID() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String getExecutionFlag() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
