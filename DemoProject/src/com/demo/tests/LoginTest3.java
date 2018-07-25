package com.demo.tests;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest3 {
	
	@Test(groups={"Testgrp"})
	public void test3(){
		System.setProperty("webdriver.chrome.driver","\\Grid\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		System.out.println("I am in Test3");
	}
public ArrayList<Object> list2(ArrayList <Object>xyz){
	
	xyz.add("pankaj");
	
	
	
	return xyz;
	
}
}
