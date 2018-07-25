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
@Table(name="EmpList")

public class EmpList implements GenericEntitybin, Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	
	@Column(name="TestCaseID")
	private String TestcaseID;

	@Column(name="employeeList")
	private String employeeList;

	@Column(name="id")
	private String id;

	@Column(name="empStatus")
	private String empStatus;

	@Column(name="includes")
	private String includes;

	@Column(name="supervisorName")
	private String supervisorName;

	@Column(name="jobTitle")
	private String jobTitle;

	@Column(name="subUnit")
	private String subUnit;

	

	public String getTestcaseID() {
		return TestcaseID;
	}

	public void setTestcaseID(String testcaseID) {
		TestcaseID = testcaseID;
	}

	public String getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(String employeeList) {
		this.employeeList = employeeList;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmpStatus() {
		return empStatus;
	}

	public void setEmpStatus(String empStatus) {
		this.empStatus = empStatus;
	}

	public String getIncludes() {
		return includes;
	}

	public void setIncludes(String includes) {
		this.includes = includes;
	}

	public String getSupervisorName() {
		return supervisorName;
	}

	public void setSupervisorName(String supervisorName) {
		this.supervisorName = supervisorName;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
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
