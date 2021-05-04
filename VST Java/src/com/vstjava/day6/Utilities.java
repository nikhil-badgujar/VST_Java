package com.vstjava.day6;

import java.util.Random;

public class Utilities {
	
	Random random = new Random();
	
	StringBuilder sb = new StringBuilder();
	
	public String generateFirstNameSurname()	{
		int intLeftLimit=97;
		int intRightLimit=122;
		int intTargetLength=10;
	
		String strFirstNameSurname = (random.ints(intLeftLimit,intRightLimit+1))
				.limit(intTargetLength)
				.collect(StringBuilder::new, 
						 StringBuilder::appendCodePoint, 
						 StringBuilder::append)
				.toString();
		return strFirstNameSurname;
	}
	
	public int generateBirthDate() {
		int intBirthdate = (int)(Math.random()*31);		
		return intBirthdate;		
	}
	
	public int generateBirthMonth() {
		int intBirthMonth = (int)(Math.random()*12);
		return intBirthMonth;
	}
	
	public int generateBirthYear() {
		int intFrom = 1920;
		int intTo = 2021;
		
		int intBirthYear = (int)(Math.random()*(intTo - intFrom))
								+ intFrom;
		return intBirthYear;
	}
	
	public long generateMobileNumber(){
		long longPhoneNumber= (long)(Math.random()*Math.pow(10, 10));
		return longPhoneNumber;
	}
	
}
