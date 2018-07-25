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
@Table(name="FB_TicketBookingCreate")

public class FB_TicketBookingCreate implements PojoPagesBin,Cloneable, Serializable, IFB_TicketBookingCreate{
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
	@Column(name="ConfigType")
	private String ConfigType;
	@Column(name="type")
	private String type;
	@Column(name="ConfigPassenger")
	private String ConfigPassenger;
	@Column(name="passenger")
	private String passenger;
	@Column(name="ConfigDepartingFrom")
	private String ConfigDepartingFrom;
	@Column(name="DepartingFrom")
	private String DepartingFrom;
	@Column(name="ConfigDepartingOnMonth")
	private String ConfigDepartingOnMonth;
	@Column(name="DepartingFromOnMonth")
	private String DepartingFromOnMonth;
	@Column(name="ConfigDepartingOnDay")
	private String ConfigDepartingOnDay;
	@Column(name="OnDay")
	private String OnDay;
	@Column(name="ConfigArrivingIn")
	private String ConfigArrivingIn;
	@Column(name="ArrivingIn")
	private String ArrivingIn;
	@Column(name="ConfigReturningMonth")
	private String ConfigReturningMonth;
	@Column(name="ReturningMonth")
	private String ReturningMonth;
	@Column(name="ConfingReturningDay")
	private String ConfingReturningDay;
	@Column(name="ReturningDay")
	private String ReturningDay;
	@Column(name="ConfigserviceClass")
	private String ConfigserviceClass;
	@Column(name="ServiceClass")
	private String ServiceClass;
	@Column(name="ConfigAirlines")
	private String ConfigAirlines;
	@Column(name="Airlines")
	private String Airlines;
	@Column(name="ConfigContinue")
	private String ConfigContinue;
	
	
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_TicketBooking#getSrNo()
	 */
	@Override
	public int getSrNo() {
		return srNo;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_TicketBooking#setSrNo(int)
	 */
	@Override
	public void setSrNo(int srNo) {
		this.srNo = srNo;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_TicketBooking#getAutomationID()
	 */
	@Override
	public String getAutomationID() {
		return automationID;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_TicketBooking#setAutomationID(java.lang.String)
	 */
	@Override
	public void setAutomationID(String automationID) {
		this.automationID = automationID;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_TicketBooking#getAction()
	 */
	@Override
	public String getAction() {
		return Action;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_TicketBooking#setAction(java.lang.String)
	 */
	@Override
	public void setAction(String action) {
		Action = action;
	}
	
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_TicketBooking#getIteration()
	 */
	@Override
	public int getIteration() {
		return iteration;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_TicketBooking#setIteration(int)
	 */
	@Override
	public void setIteration(int iteration) {
		this.iteration = iteration;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_TicketBooking#getExecutionFlag()
	 */
	@Override
	public String getExecutionFlag() {
		return ExecutionFlag;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_TicketBooking#setExecutionFlag(java.lang.String)
	 */
	@Override
	public void setExecutionFlag(String executionFlag) {
		ExecutionFlag = executionFlag;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_TicketBooking#getConfigType()
	 */
	@Override
	public String getConfigType() {
		return ConfigType;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_TicketBooking#setConfigType(java.lang.String)
	 */
	@Override
	public void setConfigType(String configType) {
		ConfigType = configType;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_TicketBooking#getType()
	 */
	@Override
	public String getType() {
		return type;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_TicketBooking#setType(java.lang.String)
	 */
	@Override
	public void setType(String type) {
		this.type = type;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_TicketBooking#getConfigPassenger()
	 */
	@Override
	public String getConfigPassenger() {
		return ConfigPassenger;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_TicketBooking#setConfigPassenger(java.lang.String)
	 */
	@Override
	public void setConfigPassenger(String configPassenger) {
		ConfigPassenger = configPassenger;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_TicketBooking#getPassenger()
	 */
	@Override
	public String getPassenger() {
		return passenger;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_TicketBooking#setPassenger(java.lang.String)
	 */
	@Override
	public void setPassenger(String passenger) {
		this.passenger = passenger;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_TicketBooking#getConfigDepartingFrom()
	 */
	@Override
	public String getConfigDepartingFrom() {
		return ConfigDepartingFrom;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_TicketBooking#setConfigDepartingFrom(java.lang.String)
	 */
	@Override
	public void setConfigDepartingFrom(String configDepartingFrom) {
		ConfigDepartingFrom = configDepartingFrom;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_TicketBooking#getDepartingFrom()
	 */
	@Override
	public String getDepartingFrom() {
		return DepartingFrom;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_TicketBooking#setDepartingFrom(java.lang.String)
	 */
	@Override
	public void setDepartingFrom(String departingFrom) {
		DepartingFrom = departingFrom;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_TicketBooking#getConfigDepartingOnMonth()
	 */
	@Override
	public String getConfigDepartingOnMonth() {
		return ConfigDepartingOnMonth;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_TicketBooking#setConfigDepartingOnMonth(java.lang.String)
	 */
	@Override
	public void setConfigDepartingOnMonth(String configDepartingOnMonth) {
		ConfigDepartingOnMonth = configDepartingOnMonth;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_TicketBooking#getDepartingFromOnMonth()
	 */
	@Override
	public String getDepartingFromOnMonth() {
		return DepartingFromOnMonth;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_TicketBooking#setDepartingFromOnMonth(java.lang.String)
	 */
	@Override
	public void setDepartingFromOnMonth(String departingFromOnMonth) {
		DepartingFromOnMonth = departingFromOnMonth;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_TicketBooking#getConfigDepartingOnDay()
	 */
	@Override
	public String getConfigDepartingOnDay() {
		return ConfigDepartingOnDay;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_TicketBooking#setConfigDepartingOnDay(java.lang.String)
	 */
	@Override
	public void setConfigDepartingOnDay(String configDepartingOnDay) {
		ConfigDepartingOnDay = configDepartingOnDay;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_TicketBooking#getOnDay()
	 */
	@Override
	public String getOnDay() {
		return OnDay;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_TicketBooking#setOnDay(java.lang.String)
	 */
	@Override
	public void setOnDay(String onDay) {
		OnDay = onDay;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_TicketBooking#getConfigArrivingIn()
	 */
	@Override
	public String getConfigArrivingIn() {
		return ConfigArrivingIn;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_TicketBooking#setConfigArrivingIn(java.lang.String)
	 */
	@Override
	public void setConfigArrivingIn(String configArrivingIn) {
		ConfigArrivingIn = configArrivingIn;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_TicketBooking#getArrivingIn()
	 */
	@Override
	public String getArrivingIn() {
		return ArrivingIn;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_TicketBooking#setArrivingIn(java.lang.String)
	 */
	@Override
	public void setArrivingIn(String arrivingIn) {
		ArrivingIn = arrivingIn;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_TicketBooking#getConfigReturningMonth()
	 */
	@Override
	public String getConfigReturningMonth() {
		return ConfigReturningMonth;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_TicketBooking#setConfigReturningMonth(java.lang.String)
	 */
	@Override
	public void setConfigReturningMonth(String configReturningMonth) {
		ConfigReturningMonth = configReturningMonth;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_TicketBooking#getReturningMonth()
	 */
	@Override
	public String getReturningMonth() {
		return ReturningMonth;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_TicketBooking#setReturningMonth(java.lang.String)
	 */
	@Override
	public void setReturningMonth(String returningMonth) {
		ReturningMonth = returningMonth;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_TicketBooking#getConfingReturningDay()
	 */
	@Override
	public String getConfingReturningDay() {
		return ConfingReturningDay;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_TicketBooking#setConfingReturningDay(java.lang.String)
	 */
	@Override
	public void setConfingReturningDay(String confingReturningDay) {
		ConfingReturningDay = confingReturningDay;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_TicketBooking#getReturningDay()
	 */
	@Override
	public String getReturningDay() {
		return ReturningDay;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_TicketBooking#setReturningDay(java.lang.String)
	 */
	@Override
	public void setReturningDay(String returningDay) {
		ReturningDay = returningDay;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_TicketBooking#getConfigserviceClass()
	 */
	@Override
	public String getConfigserviceClass() {
		return ConfigserviceClass;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_TicketBooking#setConfigserviceClass(java.lang.String)
	 */
	@Override
	public void setConfigserviceClass(String configserviceClass) {
		ConfigserviceClass = configserviceClass;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_TicketBooking#getServiceClass()
	 */
	@Override
	public String getServiceClass() {
		return ServiceClass;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_TicketBooking#setServiceClass(java.lang.String)
	 */
	@Override
	public void setServiceClass(String serviceClass) {
		ServiceClass = serviceClass;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_TicketBooking#getConfigAirlines()
	 */
	@Override
	public String getConfigAirlines() {
		return ConfigAirlines;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_TicketBooking#setConfigAirlines(java.lang.String)
	 */
	@Override
	public void setConfigAirlines(String configAirlines) {
		ConfigAirlines = configAirlines;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_TicketBooking#getAirlines()
	 */
	@Override
	public String getAirlines() {
		return Airlines;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_TicketBooking#setAirlines(java.lang.String)
	 */
	@Override
	public void setAirlines(String airlines) {
		Airlines = airlines;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_TicketBooking#getConfigContinue()
	 */
	@Override
	public String getConfigContinue() {
		return ConfigContinue;
	}
	/* (non-Javadoc)
	 * @see com.demo.pages.IFB_TicketBooking#setConfigContinue(java.lang.String)
	 */
	@Override
	public void setConfigContinue(String configContinue) {
		ConfigContinue = configContinue;
	}

}
