package com.demo.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.demo.framework.core.WebPage;
import com.demo.frameworkcore.PageElement;
import com.demo.frameworkcore.WaitType;
import com.demo.pages.IFB_LoginCreate;
import com.demo.pages.Login;

public class FB_LoginPOM extends WebPage {
	protected WebDriver driver;
	private PageElement userName;
	private PageElement password;
	private PageElement submit;
	private PageElement user;
	private PageElement myaccount;
	private PageElement loginMenu;
	
	public FB_LoginPOM(WebDriver driver){
		super(driver,"Login");
		this.driver = driver;
		userName=new PageElement(By.name("username"), "UserNameTextBox", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
					
		password=new PageElement(By.name("password"), "PasswordTestBox", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
				
		submit=new PageElement(By.xpath("//div/button[@class='btn btn-action btn-lg btn-block loginbtn']"), "LoginButton", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		
		user=new PageElement(By.xpath("//div//h3[@class='RTL']"), "user", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		
		myaccount= new PageElement(By.xpath("//li[@id='li_myaccount']/a/b"), "user", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		
		loginMenu= new PageElement(By.xpath("//li[@id='li_myaccount']/ul/li[1]/a"), "user", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		
		
				
		
	}
	public void fillFBLoginDetails(IFB_LoginCreate  login){
		navigateToLogin();
		if(verifyConfigTrue(login.getConfigUserName()))
		sendKeys(userName, login.getUserName());
		
		
		if(verifyConfigTrue(login.getConfigPassword()))
		sendKeys(password,login.getPassword());
		
		if(verifyConfigTrue(login.getConfigSubmit()))
		click(submit);
		
	}
	
	public void verifyFBLoginDetails(IFB_LoginCreate  login){
		if(verifyConfigTrue(login.getConfigUserName()))
			login.setUserName(getText(userName));
		
		
		if(verifyConfigTrue(login.getConfigPassword()))
			login.setUserName(getText(password));
		
		if(verifyConfigTrue(login.getConfigFooter()))
			login.setFooter(getText(user));
		
		if(verifyConfigTrue(login.getConfigSubmit()))
			click(submit);
	}
	
	public void navigateToLogin(){
		try{
			click(myaccount);
			click(loginMenu);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
