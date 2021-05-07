package com.vstjava.day6;

public class FacebookPage {	
	
	public void setStrFirstName(String strFirstName) {
		System.out.println("First Name : " + strFirstName);
	}
	
	public void setStrSurname(String strSurname) {
		System.out.println("Surname : " + strSurname);
	}
	
	public void setIntBirthDate(String intBirthDate) {
		System.out.println("Birth Date : "+ intBirthDate);
	}
	
	public void setIntBirthMonth(String intBirthMonth) {
		System.out.println("Birth Month : "+ intBirthMonth);
	}
	
	public void setIntBirthYear(String intBirthYear) {
		System.out.println("Birth Year : "+ intBirthYear);
	}
	
	public void setLongMobileNumber(String longMobileNumber) {
		System.out.println("Mobile Number : "+ longMobileNumber);
	}
	
	public void setEmailId(String strEmail) {
		System.out.println("Email Id : "+ strEmail);
	}
	
	public void setStrGender(String strGender) {
		if(strGender.toLowerCase().equals("male")){
			System.out.println("Gender of user Male");
   	 	}else if(strGender.toLowerCase().equals("female")){
   	 		System.out.println("Gender of user Female");
   	 	}else{
   	 		System.out.println("user dont want disclose");
   	 	}
	}
	
	public void setStrPassword(String strPassword) {
		System.out.println("Password set successfully! ");
	}
	
	/***
	 * Create New Account with Mobile Number
	 * @param strFirstName
	 * @param strSurname
	 * @param string
	 * @param string2
	 * @param string3
	 * @param longPhoneNumber
	 * @param strGender
	 * @param strPassword
	 */
	public void signUpAccountWithMobileNumber(String strFirstName,String strSurname,
			String strBirthDate,String strBirthMonth,String strBirthYear,
			String longPhoneNumber,String strGender,String strPassword){   	 
   	 this.setStrFirstName(strFirstName);
   	 this.setStrSurname(strSurname);
   	 this.setIntBirthDate(strBirthDate);
   	 this.setIntBirthMonth(strBirthMonth);
   	 this.setIntBirthYear(strBirthYear);
   	 this.setLongMobileNumber(longPhoneNumber);
   	 this.setStrGender(strGender);
   	 this.setStrPassword(strPassword);
   	 // Click on sign up button
   	 System.out.println("Hi, "+strFirstName+" your Facebook Account with Mobile Number : "
   	 		+ longPhoneNumber + " is Created Successfully.");
    }
	
	/***
	 * Create new Account with Email id
	 * @param strFirstName
	 * @param strSurname
	 * @param string
	 * @param string2
	 * @param string3
	 * @param strEmail
	 * @param strGender
	 * @param strPassword
	 */
	public void signUpAccountWithEmailId(String strFirstName,String strSurname,
			String strBirthDate,String strBirthMonth,String strBirthYear,
			String strEmail,String strGender,String strPassword){   	 
   	 this.setStrFirstName(strFirstName);
   	 this.setStrSurname(strSurname);
   	 this.setIntBirthDate(strBirthDate);
   	 this.setIntBirthMonth(strBirthMonth);
   	 this.setIntBirthYear(strBirthYear);
   	 this.setEmailId(strEmail);
   	 this.setStrGender(strGender);
   	 this.setStrPassword(strPassword);
   	 // Click on sign up button
   	 System.out.println("Hi, "+strFirstName+" your Facebook Account with Email Id : "
   	 		+ strEmail + " is Created Successfully.");
    }
	
}
