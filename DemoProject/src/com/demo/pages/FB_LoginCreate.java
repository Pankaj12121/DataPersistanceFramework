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
import com.demo.databin.PojoPagesBin;
import com.demo.databin.Resultbin;

@Entity
@Table(name="FB_LoginCreate")

public class FB_LoginCreate implements Cloneable,Serializable,PojoPagesBin, IFB_LoginCreate{
	 @ManyToMany(cascade = CascadeType.ALL)
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	
	@Column(name="srNo")
	private int srNo;
	@Column(name="AutomationID")
	private String automationID;
	@Column(name="Action")
	private String Action;
	@Column(name="Iteration")
	private int iteration;
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
	@Column(name="ConfigFooter")
	private String ConfigFooter;
	@Column(name="Footer")
	private String Footer;
	
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_Login#getSrNo()
	 */
	@Override
	public int getSrNo() {
		return srNo;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_Login#setSrNo(int)
	 */
	@Override
	public void setSrNo(int srNo) {
		this.srNo = srNo;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_Login#getAutomationID()
	 */
	@Override
	public String getAutomationID() {
		return automationID;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_Login#setAutomationID(java.lang.String)
	 */
	@Override
	public void setAutomationID(String automationID) {
		this.automationID = automationID;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_Login#getAction()
	 */
	@Override
	public String getAction() {
		return Action;
	}
	
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_Login#getIteration()
	 */
	@Override
	public int getIteration() {
		return iteration;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_Login#setIteration(int)
	 */
	@Override
	public void setIteration(int iteration) {
		this.iteration = iteration;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_Login#setAction(java.lang.String)
	 */
	@Override
	public void setAction(String action) {
		Action = action;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_Login#getExecutionFlag()
	 */
	@Override
	public String getExecutionFlag() {
		return ExecutionFlag;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_Login#setExecutionFlag(java.lang.String)
	 */
	@Override
	public void setExecutionFlag(String executionFlag) {
		ExecutionFlag = executionFlag;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_Login#getConfigUserNameExecutionFlag()
	 */
	@Override
	public String getConfigUserNameExecutionFlag() {
		return ConfigUserName;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_Login#setConfigUserNameExecutionFlag(java.lang.String)
	 */
	@Override
	public void setConfigUserNameExecutionFlag(String configUserName) {
		ConfigUserName = configUserName;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_Login#getConfigUserName()
	 */
	@Override
	public String getConfigUserName() {
		return ConfigUserName;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_Login#setConfigUserName(java.lang.String)
	 */
	@Override
	public void setConfigUserName(String configUserName) {
		ConfigUserName = configUserName;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_Login#getUserName()
	 */
	@Override
	public String getUserName() {
		return UserName;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_Login#setUserName(java.lang.String)
	 */
	@Override
	public void setUserName(String userName) {
		UserName = userName;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_Login#getConfigPassword()
	 */
	@Override
	public String getConfigPassword() {
		return ConfigPassword;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_Login#setConfigPassword(java.lang.String)
	 */
	@Override
	public void setConfigPassword(String configPassword) {
		ConfigPassword = configPassword;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_Login#getPassword()
	 */
	@Override
	public String getPassword() {
		return Password;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_Login#setPassword(java.lang.String)
	 */
	@Override
	public void setPassword(String password) {
		Password = password;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_Login#getConfigSubmit()
	 */
	@Override
	public String getConfigSubmit() {
		return ConfigSubmit;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_Login#setConfigSubmit(java.lang.String)
	 */
	@Override
	public void setConfigSubmit(String configSubmit) {
		ConfigSubmit = configSubmit;
	}
	public String getConfigFooter() {
		return ConfigFooter;
	}
	public void setConfigFooter(String configFooter) {
		ConfigFooter = configFooter;
	}
	public String getFooter() {
		return Footer;
	}
	public void setFooter(String footer) {
		Footer = footer;
	}
	


}
