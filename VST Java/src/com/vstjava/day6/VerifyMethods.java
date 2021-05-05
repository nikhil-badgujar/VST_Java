package com.vstjava.day6;

public class VerifyMethods extends FacebookPage {
	
	BaseTest objBaseTest = new BaseTest();
	
	public VerifyMethods() {		
	}
		
	/***
	 * Verify Browser without URL
	 * @param strBrowser
	 */
	public void verifyWithoutUrl(String strBrowser) {
		
		objBaseTest.initializeWebBrowser(strBrowser);
		
		System.out.println("Fail to find URL");
		
		objBaseTest.closeBrowser();
	}
	
	/***
	 * Verify Browser and URL
	 * @param strBrowser
	 * @param strFacebookURL
	 */
	public void verifyBrowserAndUrl(String strBrowser, String strFacebookURL) {
		
		objBaseTest.initializeWebBrowser(strBrowser);
		
		objBaseTest.openFacebookURL(strFacebookURL);
		
		objBaseTest.closeBrowser();		
	}
	
	/***
	 * Verify SignUp with Mobile Number & Password
	 * @param strFirstName
	 * @param strSurname
	 * @param longMobileNumber
	 * @param strPassword
	 * @param intBirthDate
	 * @param intBirthMonth
	 * @param intBirthYear
	 * @param strGender
	 */
	public void verifySignUpButtonWithMobileNumber(String strFirstName, String strSurname, 
			String longMobileNumber, int intBirthDate, int intBirthMonth, 
			int intBirthYear, String strGender, String strPassword) {
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
	
	/***
	 * Verify Sign Up with Email ID & Password
	 * @param strFirstName
	 * @param strSurname
	 * @param strEmail
	 * @param strPassword
	 * @param intBirthDate
	 * @param intBirthMonth
	 * @param intBirthYear
	 * @param strGender
	 */
	public void verifySignUpButtonWithEmail(String strFirstName, String strSurname, 
			String strEmail, int intBirthDate, int intBirthMonth, 
			int intBirthYear, String strGender, String strPassword) {
		this.setStrFirstName(strFirstName);
		this.setStrSurname(strSurname);
		this.setEmailId(strEmail);		
		this.setIntBirthDate(intBirthDate);
		this.setIntBirthMonth(intBirthMonth);
		this.setIntBirthYear(intBirthYear);
		this.setStrGender(strGender);
		this.setStrPassword(strPassword);
		
		System.out.println("\t All details in SignUp are Verified!");		
	}
	
	
	/***
	 * Verify SignUp with Mobile Number & without Password
	 * @param strFirstName
	 * @param strSurname
	 * @param longMobileNumber
	 * @param intBirthDate
	 * @param intBirthMonth
	 * @param intBirthYear
	 * @param strGender
	 */
	public void verifySignUpButtonWithMobileNumberWithoutPassword(String strFirstName, String strSurname, 
			String longMobileNumber, int intBirthDate,
			int intBirthMonth, int intBirthYear, String strGender) {
		this.setStrFirstName(strFirstName);
		this.setStrSurname(strSurname);
		this.setLongMobileNumber(longMobileNumber);
		this.setIntBirthDate(intBirthDate);
		this.setIntBirthMonth(intBirthMonth);
		this.setIntBirthYear(intBirthYear);
		this.setStrGender(strGender);
		
		System.out.println("Fail to create Account with Mobile Number! \n"
				+ "\t Please Enter Password to proceeed further.");
	}
	
	/***
	 * Verify SignUp with Email Id & without Password
	 * @param strFirstName
	 * @param strSurname
	 * @param longMobileNumber
	 * @param intBirthDate
	 * @param intBirthMonth
	 * @param intBirthYear
	 * @param strGender
	 */
	public void verifySignUpButtonWithEmailIdWithoutPassword(String strFirstName, String strSurname, 
			String strEmail, int intBirthDate,
			int intBirthMonth, int intBirthYear, String strGender) {
		this.setStrFirstName(strFirstName);
		this.setStrSurname(strSurname);
		this.setEmailId(strEmail);
		this.setIntBirthDate(intBirthDate);
		this.setIntBirthMonth(intBirthMonth);
		this.setIntBirthYear(intBirthYear);
		this.setStrGender(strGender);
		
		System.out.println("Fail to create Account with Email Id! \n"
				+ "\t Please Enter Password to proceeed further.");
	}
	
}
