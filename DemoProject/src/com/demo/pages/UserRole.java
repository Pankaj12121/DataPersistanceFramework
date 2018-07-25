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
	
	@Table(name="userRole")
	public class UserRole implements GenericEntitybin, Serializable{
		private static final long serialVersionUID = 1L;
		@Id
		@GeneratedValue(strategy =GenerationType.AUTO)
		
		
		@Column(name="TestCaseID")
		private String TestcaseID;
		@Column(name="username")
		private String userName;
		@Column(name="userRolerchar")
		private String userRolerchar;
		@Column(name="empName")
		private String empName;
		@Column(name="statuss")
		private String statuss;
		
		public String getTestcaseID() {
			return TestcaseID;
		}
		public void setTestcaseID(String testcaseID) {
			TestcaseID = testcaseID;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getUserRolerchar() {
			return userRolerchar;
		}
		public void setUserRolerchar(String userRolerchar) {
			this.userRolerchar = userRolerchar;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public String getStatuss() {
			return statuss;
		}
		public void setStatuss(String statuss) {
			this.statuss = statuss;
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
