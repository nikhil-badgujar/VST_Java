package com.vstjava.day2;

import java.util.Scanner;

public class TestWeekDays {
	
	
	
	public void checkString()
	{
		String []strArr = {"mon","tue","wed","thu","fri","sat","sun"};
		System.out.print("Actual Day : ");
		Scanner sc = new Scanner(System.in);
		String strInput = sc.next().toLowerCase();
				
		for(int intIndex = 0; intIndex < strArr.length; intIndex++)
		{			
			if(strArr[intIndex].equals(strInput)) 
			{				
				if(strInput.equals("mon"))
					System.out.println("First Day");
				else if(strInput.equals("tue"))
					System.out.println("Week started");
				else if(strInput.equals("wed"))
					System.out.println("Work in progress");
				else if(strInput.equals("thu"))
					System.out.println("Break..!");
				else if(strInput.equals("fri"))
					System.out.println("Weekend coming");
				else if(strInput.equals("sat"))
					System.out.println("Weekend started");
				else if(strInput.equals("sun"))
					System.out.println("Continue..!");	
			}			
		}		
	}
	
	public static void main(String[] args) {
		TestWeekDays objTestMonths = new TestWeekDays();
		objTestMonths.checkString();
	}
}
