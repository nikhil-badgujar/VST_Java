package com.vstjava.day4;

public class SubClass extends BaseClass {
	
	String strBrowser;
	public SubClass(String strBrowserName) {
		super();
		this.strBrowser = strBrowserName; 
		System.out.println("Sub Class Constructor");
	}
		
	public void baseOverridingMethod() {
		super.baseOverridingMethod();
		System.out.println("Overriden method from Sub class");
	}
	
	public void callingFinalMethodFromSub() {
		System.out.println("Calling final method from Sub Class");
		super.finalMethodCall();
	}
	
	public void printBrowserName() {
		System.out.println("Browser Name from BaseClass : " + super.strBrowser);
		System.out.println("Browser Name from SubClass : " + this.strBrowser);
	}
		
}
