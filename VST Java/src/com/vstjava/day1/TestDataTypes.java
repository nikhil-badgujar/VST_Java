package com.vstjava.day1;

public class TestDataTypes {

	//Global Variables
	int intBasic = 10000;
	int intOther = 5000;
	String strBonous = "1111";
	int intTotalSalary;
	
	//Static variable
	static int intCount = 0;
	
	//Constructor
	public TestDataTypes() {
		intCount++;
	}
	
	//to get total salary
	public void getTotalSalary()
	{
		intTotalSalary = intBasic + intOther;
		System.out.println("Total Salary : "+ intTotalSalary);
	}
	
	//to get total salary with bonous 
	public void getTotalSalaryWithBonous()
	{
		int intTotalSalaryWithBonous = Integer.parseInt(strBonous) + intTotalSalary;
		System.out.println("Total Salary With Bonous : "+ intTotalSalaryWithBonous);
	}
	
	public static void main(String[] args) {		
		TestDataTypes objTestDataTypes = new TestDataTypes();
		objTestDataTypes.getTotalSalary();		
		objTestDataTypes.getTotalSalaryWithBonous();
		TestDataTypes objTestDataTypes1 = new TestDataTypes();
		System.out.println("Total Objects Created : "+ intCount);
	}
}
