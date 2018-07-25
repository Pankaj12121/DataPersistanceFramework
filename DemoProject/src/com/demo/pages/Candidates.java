package com.demo.pages;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.demo.databin.GenericEntitybin;

@Entity
@Table(name="Candidates")

public class Candidates implements GenericEntitybin, Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	
	@Column(name="TestCaseID")
	private String TestcaseID;
	
	@Column(name="jobTitle")
	private String jobTitle;

	@Column(name="vacancy")
	private String vacancy;

	@Column(name="hiringManager")
	private String hiringManager;

	@Column(name="candidateName")
	private String candidateName;





	public String getTestcaseID() {
		return TestcaseID;
	}



	public void setTestcaseID(String testcaseID) {
		TestcaseID = testcaseID;
	}



	public String getJobTitle() {
		return jobTitle;
	}



	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}



	public String getVacancy() {
		return vacancy;
	}



	public void setVacancy(String vacancy) {
		this.vacancy = vacancy;
	}



	public String getHiringManager() {
		return hiringManager;
	}



	public void setHiringManager(String hiringManager) {
		this.hiringManager = hiringManager;
	}



	public String getCandidateName() {
		return candidateName;
	}



	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
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
