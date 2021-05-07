package com.vstjava.day6;


public class TestFacebook {

	public static void main(String[] args) {		
				
		VerifyMethods objVerifyMethods = new VerifyMethods();
		
		FacebookPage objFacebookPage = new FacebookPage();		
		
		BaseTest objBaseTest = new BaseTest();			
		
		System.out.println("\n<--------------------Testing with Browser & URL-------------------->\n");
		
		objVerifyMethods.verifyBrowserAndUrl(
				objBaseTest.getObjHashTable().get("Browser"),
				objBaseTest.getObjHashTable().get("Url"));
		
		System.out.println("\n<--------------------Testing with Browser only-------------------->\n");
		
		objVerifyMethods.verifyWithoutUrl(
				objBaseTest.getObjHashTable().get("Browser"));
		
		System.out.println("\n<--------------------Creating New Account with Mobile Number -------------------->\n");
			
		objFacebookPage.signUpAccountWithMobileNumber(
				objBaseTest.getObjHashTable().get("FirstName"),
				objBaseTest.getObjHashTable().get("Surname"),
				objBaseTest.getObjHashTable().get("BirthDate"),
				objBaseTest.getObjHashTable().get("BirthMonth"),
				objBaseTest.getObjHashTable().get("BirthYear"),
				objBaseTest.getObjHashTable().get("MobileNumber"),
				objBaseTest.getObjHashTable().get("Gender"),
				objBaseTest.getObjHashTable().get("Password"));
		
				
		System.out.println("\n<--------------------Creating New Account with Email Id-------------------->\n");
		
		objFacebookPage.signUpAccountWithEmailId(
				objBaseTest.getObjHashTable().get("FirstName"),
				objBaseTest.getObjHashTable().get("Surname"),
				objBaseTest.getObjHashTable().get("BirthDate"),
				objBaseTest.getObjHashTable().get("BirthMonth"),
				objBaseTest.getObjHashTable().get("BirthYear"),
				objBaseTest.getObjHashTable().get("EmailId"),
				objBaseTest.getObjHashTable().get("Gender"),
				objBaseTest.getObjHashTable().get("Password"));
		
		
		System.out.println("\n<--------------------Verifying details with Mobile Number & Password-------------------->\n");
		
		objVerifyMethods.verifySignUpButtonWithMobileNumber(
				objBaseTest.getObjHashTable().get("FirstName"),
				objBaseTest.getObjHashTable().get("Surname"),
				objBaseTest.getObjHashTable().get("MobileNumber"),
				objBaseTest.getObjHashTable().get("BirthDate"),
				objBaseTest.getObjHashTable().get("BirthMonth"),
				objBaseTest.getObjHashTable().get("BirthYear"),
				objBaseTest.getObjHashTable().get("Gender"),
				objBaseTest.getObjHashTable().get("Password"));
		
		
		System.out.println("\n<--------------------Verifying details with Email ID & Password-------------------->\n");
		
		objVerifyMethods.verifySignUpButtonWithEmail(
				objBaseTest.getObjHashTable().get("FirstName"),
				objBaseTest.getObjHashTable().get("Surname"),
				objBaseTest.getObjHashTable().get("EmailId"),
				objBaseTest.getObjHashTable().get("BirthDate"),
				objBaseTest.getObjHashTable().get("BirthMonth"),
				objBaseTest.getObjHashTable().get("BirthYear"),
				objBaseTest.getObjHashTable().get("Gender"),
				objBaseTest.getObjHashTable().get("Password"));	
		
		
		System.out.println("\n<--------------------Verifying details with Mobile, W/o Password-------------------->\n");
		
		objVerifyMethods.verifySignUpButtonWithMobileNumberWithoutPassword(
				objBaseTest.getObjHashTable().get("FirstName"),
				objBaseTest.getObjHashTable().get("Surname"),
				objBaseTest.getObjHashTable().get("MobileNumber"),
				objBaseTest.getObjHashTable().get("BirthDate"),
				objBaseTest.getObjHashTable().get("BirthMonth"),
				objBaseTest.getObjHashTable().get("BirthYear"),
				objBaseTest.getObjHashTable().get("Gender"));	
		
		
		System.out.println("\n<--------------------Verifying details with Email Id, W/o Password-------------------->\n");
		
		objVerifyMethods.verifySignUpButtonWithEmailIdWithoutPassword(
				objBaseTest.getObjHashTable().get("FirstName"),
				objBaseTest.getObjHashTable().get("Surname"),
				objBaseTest.getObjHashTable().get("EmailId"),
				objBaseTest.getObjHashTable().get("BirthDate"),
				objBaseTest.getObjHashTable().get("BirthMonth"),
				objBaseTest.getObjHashTable().get("BirthYear"),
				objBaseTest.getObjHashTable().get("Gender"));
	}
}
