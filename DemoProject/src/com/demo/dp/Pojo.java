package com.demo.dp;

public class Pojo {
	
	private String tool;
	private String TestFramework;
	private String FrameworkHybrid;
	public Pojo(String string1, String string2, String string3) {
		this.tool=	string1;
		this.TestFramework=string2;
		this.FrameworkHybrid=string3;
				
				
	}
	public String getTool() {
		return tool;
	}
	public void setTool(String tool) {
		this.tool = tool;
	}
	public String getTestFramework() {
		return TestFramework;
	}
	public void setTestFramework(String testFramework) {
		TestFramework = testFramework;
	}
	public String getFrameworkHybrid() {
		return FrameworkHybrid;
	}
	public void setFrameworkHybrid(String frameworkHybrid) {
		FrameworkHybrid = frameworkHybrid;
	}
	
	
	

}
