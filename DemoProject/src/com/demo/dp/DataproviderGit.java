package com.demo.dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderGit {
	
	
	 @Test(dataProvider = "dp001")
	  public void myData(List<Object> test2) {
	    System.out.println(test2.get(0).toString());
	    System.out.println(test2.get(1).toString());
	    System.out.println(test2.get(2).toString());
	  }

	  @DataProvider(name = "dp001")
	  public Iterator<Object[]> dp001() {
	    ArrayList<Object[]> test1 = new ArrayList<>();
	    List<String> items = Arrays.asList("WebDriver", "TestNG", "Framework");
	    test1.add(new Object[] {items});
	    return test1.iterator();
	  }

}
