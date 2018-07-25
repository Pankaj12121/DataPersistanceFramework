package com.demo.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.demo.framework.core.WebPage;
import com.demo.frameworkcore.PageElement;
import com.demo.frameworkcore.WaitType;
import com.demo.pages.IFB_TicketBookingCreate;

public class FB_TicketBookingPOM extends WebPage{

	protected WebDriver driver;

	private PageElement Passengers;
	private PageElement DepartingFrom;
	private PageElement DonMonth;
	private PageElement DonDay;
	private PageElement ArrivingIn;
	private PageElement RonMonth;
	private PageElement RonDay;
	private PageElement ServiceClass;
	private PageElement Airline;
	private PageElement Continue;
	private PageElement EconomyClass;
	private PageElement BusinessClass;
	private PageElement FirstClass;
	public FB_TicketBookingPOM (WebDriver driver){
		super(driver,"TicketBooking");
		this.driver=driver;
		Passengers= new PageElement(By.name("passCount"), "passengerList", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		DepartingFrom=new PageElement(By.name("fromPort"), "fromDepartingList", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		DonMonth=new PageElement(By.name("fromMonth"), "fromMonthList", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		DonDay=new PageElement(By.name("fromDay"), "frmDayList", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		ArrivingIn=new PageElement(By.name("toPort"), "ArrivingToList", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		RonMonth=new PageElement(By.name("toMonth"), "RetToMonthList", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		RonDay=new PageElement(By.name("toDay"), "RetOnDayList", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		ServiceClass=new PageElement(By.name("passCount"), "passengerList", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		Airline=new PageElement(By.name("airline"), "AirlineList", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		Continue=new PageElement(By.name("findFlights"), "Continue", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		EconomyClass=new PageElement(By.xpath("//div//input[@value='Coach']"), "Economy Class", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		BusinessClass=new PageElement(By.xpath("//div//input[@value='Business']"), "Business Class", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		FirstClass=new PageElement(By.xpath("//div//input[@value='First']"), "First Class", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
	}

	public void fbTicketbooking(IFB_TicketBookingCreate bookings){
		if(verifyConfigTrue(bookings.getConfigPassenger()))
			selectValueFromList(Passengers, bookings.getPassenger());

		if(verifyConfigTrue(bookings.getConfigDepartingFrom()))
			selectValueFromList(DepartingFrom, bookings.getDepartingFrom());

		if(verifyConfigTrue(bookings.getConfigDepartingOnMonth()))
			selectValueFromList(DonMonth, bookings.getDepartingFromOnMonth());

		if(verifyConfigTrue(bookings.getConfigDepartingOnDay()))
			selectValueFromList(DonDay, bookings.getOnDay());

		if(verifyConfigTrue(bookings.getConfigArrivingIn()))
			selectValueFromList(ArrivingIn, bookings.getArrivingIn());

		if(verifyConfigTrue(bookings.getConfigReturningMonth()))
			selectValueFromList(RonMonth, bookings.getReturningMonth());

		if(verifyConfigTrue(bookings.getConfingReturningDay()))
			selectValueFromList(RonDay, bookings.getReturningDay());

		if(verifyConfigTrue(bookings.getConfigserviceClass())){
			if( bookings.getServiceClass().equalsIgnoreCase("Economy class ")){
				click(EconomyClass);

			}else if(bookings.getServiceClass().equalsIgnoreCase("Business class")){
				click(BusinessClass);
			}else if(bookings.getServiceClass().equalsIgnoreCase("First class")){
				click(FirstClass);

			}
			if(verifyConfigTrue(bookings.getConfigAirlines()))
				selectValueFromList(Airline, bookings.getAirlines());

			if(verifyConfigTrue(bookings.getConfigContinue()))
				click(Continue);

		}
	}
	public void verifyFbTicketbooking(IFB_TicketBookingCreate bookings){
		if(verifyConfigTrue(bookings.getConfigPassenger()))
			bookings.setPassenger(getText(Passengers));

		if(verifyConfigTrue(bookings.getConfigDepartingFrom()))
			bookings.setDepartingFrom(getText(DepartingFrom));

		if(verifyConfigTrue(bookings.getConfigDepartingOnMonth()))

			bookings.setDepartingFromOnMonth(getText(DonMonth));

		if(verifyConfigTrue(bookings.getConfigDepartingOnDay()))
			bookings.setConfigDepartingOnDay(getText(DonDay));

		if(verifyConfigTrue(bookings.getConfigArrivingIn()))
			bookings.setArrivingIn(getText(ArrivingIn));

		if(verifyConfigTrue(bookings.getConfigReturningMonth()))
			bookings.setReturningMonth(getText(RonMonth));

		if(verifyConfigTrue(bookings.getConfingReturningDay()))
			bookings.setReturningDay(getText(RonDay));

		if(verifyConfigTrue(bookings.getConfigserviceClass())){
			if( bookings.getServiceClass().equalsIgnoreCase("Economy class ")){
				bookings.setServiceClass(getText(ServiceClass));

			}else if(bookings.getServiceClass().equalsIgnoreCase("Business class")){
				bookings.setServiceClass(getText(BusinessClass));
			}else if(bookings.getServiceClass().equalsIgnoreCase("First class")){
				bookings.setServiceClass(getText(FirstClass));

			}
			if(verifyConfigTrue(bookings.getConfigAirlines()))
				bookings.setAirlines(getText(Airline));

			if(verifyConfigTrue(bookings.getConfigContinue()))
				click(Continue);;

		}

	}

}
