package com.vstjava.day6;

import java.text.DecimalFormat;
import java.util.Random;

public class TestFacebook {

	public static void main(String[] args) {
		
				
		VerifyMethods objVerifyMethods = new VerifyMethods();
		
		FacebookPage objFacebookPage = new FacebookPage();
		
		Utilities objUtilities = new Utilities();
		
		
		System.out.println("\n<--------------------Testing with Browser & URL-------------------->\n");
		
		objVerifyMethods.verifyBrowserAndUrl("Safari", "https://en-gb.facebook.com/");
		
		System.out.println("\n<--------------------Testing with Browser only-------------------->\n");
		
		objVerifyMethods.verifyWithoutUrl("Safari");
		
		System.out.println("\n<--------------------Creating New Account with Mobile Number -------------------->\n");
		
		objFacebookPage.createNewAccountWithMobileNumber(objUtilities.getRandomString(4),
				objUtilities.getRandomString(7),
				objUtilities.getRandomNumber(1,31),
				objUtilities.getRandomNumber(1,12),
				objUtilities.getRandomNumber(1920, 2020), 
				objUtilities.getMobileNumber(),
				"Male",
				"******");
		
				
		System.out.println("\n<--------------------Creating New Account with Email Id-------------------->\n");
		
		objFacebookPage.createNewAccountWithEmailId(objUtilities.getRandomString(5),
				objUtilities.getRandomString(7),
				objUtilities.getRandomNumber(1,31),
				objUtilities.getRandomNumber(1,12),
				objUtilities.getRandomNumber(1920, 2020), 
				objUtilities.getRandomEmailId(),
				"Male",
				"******");
		
		
		System.out.println("\n<--------------------Verifying details with Mobile Number & Password-------------------->\n");
		
		objVerifyMethods.verifySignUpButtonWithMobileNumber(objUtilities.getRandomString(5),
				objUtilities.getRandomString(8),
				objUtilities.getMobileNumber(),
				objUtilities.getRandomNumber(1,31),
				objUtilities.getRandomNumber(1,12),
				objUtilities.getRandomNumber(1920, 2020), 			
				"Male",
				"******");
		
		
		System.out.println("\n<--------------------Verifying details with Email ID & Password-------------------->\n");
		
		objVerifyMethods.verifySignUpButtonWithEmail(objUtilities.getRandomString(5),
				objUtilities.getRandomString(8),
				objUtilities.getRandomEmailId(),
				objUtilities.getRandomNumber(1,31),
				objUtilities.getRandomNumber(1,12),
				objUtilities.getRandomNumber(1920, 2020), 			
				"Male",
				"******");	
		
		
		System.out.println("\n<--------------------Verifying details with Mobile, W/o Password-------------------->\n");
		
		objVerifyMethods.verifySignUpButtonWithMobileNumberWithoutPassword(objUtilities.getRandomString(5),
				objUtilities.getRandomString(8),
				objUtilities.getMobileNumber(),
				objUtilities.getRandomNumber(1,31),
				objUtilities.getRandomNumber(1,12),
				objUtilities.getRandomNumber(1920, 2020), 				
				"Male");	
		
		
		System.out.println("\n<--------------------Verifying details with Email Id, W/o Password-------------------->\n");
		
		objVerifyMethods.verifySignUpButtonWithEmailIdWithoutPassword(objUtilities.getRandomString(5),
				objUtilities.getRandomString(8),
				objUtilities.getRandomEmailId(),
				objUtilities.getRandomNumber(1,31),
				objUtilities.getRandomNumber(1,12),
				objUtilities.getRandomNumber(1920, 2020), 				
				"Male");
	}
}
