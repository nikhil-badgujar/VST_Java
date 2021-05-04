package com.vstjava.day6;

public class VerifyMethods extends FacebookPage {

	public VerifyMethods() {		
	}
		
	public void verifyWithoutUrl(String strBrowser) {
		
		this.initializeWebBrowser(strBrowser);
		
		System.out.println("Fail to find URL");
		
		this.closeBrowser();
	}
	
	public void verifyBrowserAndUrl(String strBrowser, String strFacebookURL) {
		
		this.initializeWebBrowser(strBrowser);
		
		this.openFacebookURL(strFacebookURL);
		
		this.closeBrowser();		
	}
	
	public void verifySignUpButton(String strFirstName, String strSurname, 
			long longMobileNumber,String strPassword, int intBirthDate,
			int intBirthMonth, int intBirthYear, String strGender) {
		this.setStrFirstName(strFirstName);
		this.setStrSurname(strSurname);
		this.setLongMobileNumber(longMobileNumber);
		this.setStrPassword(strPassword);
		this.setIntBirthDate(intBirthDate);
		this.setIntBirthMonth(intBirthMonth);
		this.setIntBirthYear(intBirthYear);
		this.setStrGender(strGender);
		
		System.out.println("All details in SignUp are Verified!");		
	}
	
	public void verifySignUpButton(String strFirstName, String strSurname, 
			long longMobileNumber, int intBirthDate,
			int intBirthMonth, int intBirthYear, String strGender) {
		this.setStrFirstName(strFirstName);
		this.setStrSurname(strSurname);
		this.setLongMobileNumber(longMobileNumber);
		this.setIntBirthDate(intBirthDate);
		this.setIntBirthMonth(intBirthMonth);
		this.setIntBirthYear(intBirthYear);
		this.setStrGender(strGender);
		
		System.out.println("Fail to create Account! \n "
				+ "Please enter Password to proceeed further.");
	}

	
}
