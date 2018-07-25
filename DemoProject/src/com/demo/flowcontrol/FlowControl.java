package com.demo.flowcontrol;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;

import com.demo.databin.Databin;
import com.demo.databin.Resultbin;
import com.demo.pages.FB_LoginCreate;
import com.demo.pages.FB_TicketBookingCreate;
import com.demo.pages.TestSteps;
import com.demo.pom.FB_LoginPOM;
import com.demo.pom.FB_TicketBookingPOM;


public class FlowControl {
	String StepName;
	WebDriver driver;
	Databin testCaseData;
	
	public FlowControl(WebDriver driver,Databin testCaseData){
		this.driver=driver;
		this.testCaseData=testCaseData;	
	}
	public void steps(Resultbin resultBin,String AutomationID){
		List<TestSteps> teststeps= testCaseData.getTestSteps();
		int noOfSteps=teststeps.size();

		for (int i=0;i<=noOfSteps-1;i++){
			StepName=teststeps.get(i).getStepName();
			try{
			/*	if (teststeps.get(i).getStepName().equalsIgnoreCase("Login") && teststeps.get(i).getExecutionFlag().equalsIgnoreCase("Yes"))
					createLogin(testData,AutomationID);

				if (teststeps.get(i).getStepName().equalsIgnoreCase("createPolicy") && teststeps.get(i).getExecutionFlag().equalsIgnoreCase("Yes"))
					createPolicy(testData,AutomationID);

					if (teststeps.get(i).getStepName().equalsIgnoreCase("editPolicy") && teststeps.get(i).getExecutionFlag().equalsIgnoreCase("Yes"))
						editPolicy(testData,AutomationID);

					if (teststeps.get(i).getStepName().equalsIgnoreCase("verifyPolicy") && teststeps.get(i).getExecutionFlag().equalsIgnoreCase("Yes"))
						verifyPolicy(testData,AutomationID);

					if (teststeps.get(i).getStepName().equalsIgnoreCase("addRider") && teststeps.get(i).getExecutionFlag().equalsIgnoreCase("Yes"))
						addRider(testData,AutomationID);*/

					if (teststeps.get(i).getStepName().equalsIgnoreCase("FBLoginStep") && teststeps.get(i).getExecutionFlag().equalsIgnoreCase("Yes"))
						CreateFB_Login(resultBin,AutomationID);
					

					if (teststeps.get(i).getStepName().equalsIgnoreCase("verifyFBLoginStep") && teststeps.get(i).getExecutionFlag().equalsIgnoreCase("Yes"))
						VerifyFB_Login(resultBin,AutomationID);

					if (teststeps.get(i).getStepName().equalsIgnoreCase("FBTicketBookingStep") && teststeps.get(i).getExecutionFlag().equalsIgnoreCase("Yes"))
						FBTicketBookingStep(resultBin,AutomationID);
					if (teststeps.get(i).getStepName().equalsIgnoreCase("verifyFBTicketBookingStep") && teststeps.get(i).getExecutionFlag().equalsIgnoreCase("Yes"))
						FBTicketBookingStep(resultBin,AutomationID);
			}catch(ArithmeticException e1){
				e1.getMessage();

			}catch(NullPointerException e2){
				e2.getMessage();
			}catch(IndexOutOfBoundsException e3){
				e3.getMessage();
			}catch(IllegalArgumentException e4){
				e4.getMessage();
			}catch(Exception e5){
				e5.getMessage();
			}finally{

			}

		}
	}
	public void CreateFB_Login(Resultbin resultBin, String AutomationID){
		ArrayList<FB_LoginCreate>createLoginList= new ArrayList<FB_LoginCreate>();
		FB_LoginPOM createLogin= new FB_LoginPOM(driver);

		for(FB_LoginCreate login:testCaseData.getFbLoginCreate()){
			if(login.getAction().equalsIgnoreCase("Add")){
				
				createLogin.fillFBLoginDetails(login);

				createLoginList.add(login);
			}
			
		}
		resultBin.getFbLoginCreate().addAll(createLoginList);
		System.out.println("Executed step "+ StepName +" successfully for test case: "  + AutomationID);
	}
	public void VerifyFB_Login(Resultbin resultBin, String AutomationID){
		ArrayList<FB_LoginCreate>verifyLoginList= new ArrayList<FB_LoginCreate>();
		FB_LoginPOM createLogin= new FB_LoginPOM(driver);

		for(FB_LoginCreate login:testCaseData.getFbLoginCreate()){
			if(login.getAction().equalsIgnoreCase("Verify")){
				createLogin.verifyFBLoginDetails(login);

				verifyLoginList.add(login);
			}
			
		}
		resultBin.getFbLoginCreate().addAll(verifyLoginList);
		
		System.out.println("Executed step "+ StepName +" successfully for test case: "  + AutomationID);
	}
	public void FBTicketBookingStep(Resultbin resultBin, String AutomationID){
		ArrayList<FB_TicketBookingCreate>ticketBookingList= new ArrayList<FB_TicketBookingCreate>();
		FB_TicketBookingPOM booking= new FB_TicketBookingPOM(driver);

		for(FB_TicketBookingCreate bookings:testCaseData.getFbTicketbookingCreate()){
			if(bookings.getAction().equalsIgnoreCase("add")){
				booking.fbTicketbooking(bookings);

				ticketBookingList.add(bookings);
			}
			
		}
		resultBin.setFbTicketbookingCreate(ticketBookingList);
		System.out.println("Executed step "+ StepName +" successfully for test case: " + AutomationID);
	}
	
	public void verifyFBTicketBookingStep(Resultbin resultBin, String AutomationID){
		ArrayList<FB_TicketBookingCreate>ticketBookingList= new ArrayList<FB_TicketBookingCreate>();
		FB_TicketBookingPOM booking= new FB_TicketBookingPOM(driver);

		for(FB_TicketBookingCreate bookings:testCaseData.getFbTicketbookingCreate()){
			if(bookings.getAction().equalsIgnoreCase("verify")){
				booking.verifyFbTicketbooking(bookings);

				ticketBookingList.add(bookings);
			}
			
		}
		resultBin.setFbTicketbookingCreate(ticketBookingList);
		System.out.println("Executed step "+ StepName +" successfully for test case: " + AutomationID);
	}

	/*public void createLogin(ArrayList<Object> testData, String AutomationID){
		ArrayList<Login>CreateLoginList= new ArrayList<Login>();
		CreateLoginPOM createLogin= new CreateLoginPOM(driver);

		for(Login login:bin.getLogin()){

			createLogin.fillLoginDetails(login);;
			String title= createLogin.getPageTitle();
			System.out.println("Title of a web application "+title);
			CreateLoginList.add(login);
			testData.add(CreateLoginList);
		}

		System.out.println("Executed step Login successfully for test case: " + AutomationID);
	}

	public void createPolicy(ArrayList<Object> testData, String AutomationID){
		ArrayList<String>CreatePolicyList= new ArrayList<String>();
		CreatePolicyList.add("Pankaj");
		testData.add(CreatePolicyList);
		System.out.println("Executed step 'Create Policy' successfully for test case: " + AutomationID );
	}

	public void editPolicy(ArrayList<Object> testData, String AutomationID){
		ArrayList<String>EditPolicyList= new ArrayList<String>();
		EditPolicyList.add("Shrikant");
		testData.add(EditPolicyList);
		System.out.println("Executed step 'Edit Policy' successfully  for test case: " + AutomationID);
	}

	public void verifyPolicy(ArrayList<Object> testData, String AutomationID){
		ArrayList<String>VerifyPolicyList= new ArrayList<String>();

		VerifyPolicyList.add("Yogi");
		testData.add(VerifyPolicyList);
		System.out.println("Executed step 'Verify Policy' successfully for test case: " + AutomationID);
	}

	public void addRider(ArrayList<Object> testData, String AutomationID){
		ArrayList<String>AddRiderList= new ArrayList<String>();
		AddRiderList.add("Dombivali");
		testData.add(AddRiderList);
		System.out.println("Executed step 'Add Rider' successfully for test case: " + AutomationID);
	}

*/

}
