package com.demo.dp;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {

	@Test(dataProvider="dp001")

	public void myData(Pojo test2){
		System.out.println(test2.getTool());
		System.out.println(test2.getTestFramework());
		System.out.println(test2.getFrameworkHybrid());


	}


	@DataProvider(name="dp001")
	public Iterator<Pojo[]>dp001(){

		ArrayList<Pojo[]> test1= new ArrayList<>();

		Pojo[] testData= {new Pojo ("WebDriver","TestNG","Framework")};
		test1.add(testData);
		return test1.iterator();

	}

}
