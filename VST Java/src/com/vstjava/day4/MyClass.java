package com.vstjava.day4;

public class MyClass {
	
	public static void add(int intNum1, int intNum2) {
		int intResult = intNum1 + intNum2;
		System.out.println("Addition of "+ intNum1 + " & " + intNum2 + " = " + intResult);
	}
	
	public static void add(double doubleNum1, double doubleNum2) {
		double doubleResult = doubleNum1 + doubleNum2;
		System.out.println("Addition of "+ doubleNum1 + " & " + doubleNum2 + " = " + doubleResult);
	}
	
	public static void perform(BaseClass ref) {
		
		if(ref instanceof SubClass)
		{
			SubClass objSubClass = (SubClass)ref;
			objSubClass.printBrowserName();
			System.out.println("----------------------------");
			objSubClass.callingFinalMethodFromSub();
		}
		System.out.println("----------------------------");
		ref.baseOverridingMethod();
	}
	
	public static void main(String[] args) {
				
		add(10,12);
		
		System.out.println("----------------------------");
		
		perform(new BaseClass());
		
		System.out.println("----------------------------");
		
		perform(new SubClass("FireFox"));
		
	}
}
