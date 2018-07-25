package com.demo.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.demo.framework.core.WebPage;
import com.demo.pages.Login;

public class CreateLoginPOM extends WebPage{
	
		protected WebDriver driver;
		private WebElement userName;
		private WebElement password;
		private WebElement submit;
		
		public CreateLoginPOM(WebDriver driver) {
			this.driver = driver;
			userName= driver.findElement(By.name("userName"));//By id 
			password= driver.findElement(By.name("password"));//By name 
			submit= driver.findElement(By.name("login"));//By name 
		}
		
		public void fillLoginDetails(Login login){
			verifyConfigTrue(login.getConfigUserName());
			userName.sendKeys(login.getUserName());
			verifyConfigTrue(login.getConfigPassword());
			password.sendKeys(login.getPassword());
			verifyConfigTrue(login.getConfigSubmit());
			submit.click();
			
		}
		
		public void EditLoginDetails(Login login){
			userName.sendKeys(login.getUserName());
			password.sendKeys(login.getPassword());
			submit.click();
			
		}
		
		public void verifyLoginDetails(Login login){
			login.setUserName(userName.getText());
			login.setPassword(password.getText());
			
		}
	
		public String getPageTitle(){
			String title = driver.getTitle();
			return title;
		}
		
		public boolean verifyBasePageTitle() {
			String expectedPageTitle="Google";
			return getPageTitle().contains(expectedPageTitle);
		}
}
