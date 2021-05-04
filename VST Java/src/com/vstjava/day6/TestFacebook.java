package com.vstjava.day6;

public class TestFacebook {

	public static void main(String[] args) {
		
		VerifyMethods objVerifyMethods = new VerifyMethods();
		
		FacebookPage objFacebookPage = new FacebookPage();
		
		Utilities objUtilities = new Utilities();
		
		System.out.println("\n<--------------------Testing with Browser & URL-------------------->\n");
		
		objVerifyMethods.verifyBrowserAndUrl("Safari", "https://en-gb.facebook.com/");
		
		System.out.println("\n<--------------------Testing with Browser only-------------------->\n");
		
		objVerifyMethods.verifyWithoutUrl("Safari");
		
		System.out.println("\n<--------------------Creating New Account-------------------->\n");
		
		objFacebookPage.createNewAccount(objUtilities.generateFirstNameSurname(),
				objUtilities.generateFirstNameSurname(),
				objUtilities.generateBirthDate(),
				objUtilities.generateBirthMonth(),
				objUtilities.generateBirthYear(), 
				objUtilities.generateMobileNumber(),
				"Male",
				"******");
		
		System.out.println("\n<--------------------Verifying details with or w/o Password-------------------->\n");
		
		objVerifyMethods.verifySignUpButton(objUtilities.generateFirstNameSurname(),
				objUtilities.generateFirstNameSurname(),
				(long)objUtilities.generateMobileNumber(),
				(int)objUtilities.generateBirthDate(),
				(int)objUtilities.generateBirthMonth(),
				(int)objUtilities.generateBirthYear(),				
				"Male");	
		
	}
}
