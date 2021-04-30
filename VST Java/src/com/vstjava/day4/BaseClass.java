package com.vstjava.day4;

public class BaseClass {
	
	String strBrowser = "Google Chrome";
	
	public BaseClass() {
		System.out.println("Base Class Constructor");
	}
	
	public void baseOverridingMethod() {
		System.out.println("Base class Overriding method");
	}
	
	public final void finalMethodCall() {
		System.out.println("Final Method from Base class");
	}

}
