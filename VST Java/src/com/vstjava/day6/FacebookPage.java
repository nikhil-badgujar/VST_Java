package com.vstjava.day6;

public class FacebookPage extends BaseTest {
	
	String strFirstName;
	String strSurname;
	int intBirthDate;
	int intBirthMonth;
	int intBirthYear;
	long longMobileNumber;
	String strGender;
	String strPassword;	
	
	public void setStrFirstName(String strFirstName) {
		this.strFirstName = strFirstName;
		System.out.println("First Name : " + strFirstName);
	}
	
	public void setStrSurname(String strSurname) {
		this.strSurname = strSurname;
		System.out.println("Surname : " + strSurname);
	}
	
	public void setIntBirthDate(int intBirthDate) {
		this.intBirthDate = intBirthDate;
		System.out.println("Birth Date : "+ intBirthDate);
	}
	
	public void setIntBirthMonth(int intBirthMonth) {
		this.intBirthMonth = intBirthMonth;
		System.out.println("Birth Month : "+ intBirthMonth);
	}
	
	public void setIntBirthYear(int intBirthYear) {
		this.intBirthYear = intBirthYear;
		System.out.println("Birth Year : "+ intBirthYear);
	}
	
	public void setLongMobileNumber(long longMobileNumber) {
		this.longMobileNumber = longMobileNumber;
		System.out.println("Mobile Number : "+ longMobileNumber);
	}
	
	public void setStrGender(String strGender) {
		this.strGender = strGender;
		if(strGender.toLowerCase().equals("male")){
			System.out.println("Gender of user Male");
   	 	}else if(strGender.toLowerCase().equals("female")){
   	 		System.out.println("Gender of user Female");
   	 	}else{
   	 		System.out.println("user dont want disclose");
   	 	}
	}
	
	public void setStrPassword(String strPassword) {
		this.strPassword = strPassword;
		System.out.println("Password set successfully! ");
	}
	
	public void createNewAccount(String strFirstName,String strSurname,
			int intBirthDate,int intBirthMonth,int intBirthYear,
			long longPhoneNumber,String strGender,String strPassword){
   	 
   	 this.setStrFirstName(strFirstName);
   	 this.setStrSurname(strSurname);
   	 this.setIntBirthDate(intBirthDate);
   	 this.setIntBirthMonth(intBirthMonth);
   	 this.setIntBirthYear(intBirthYear);
   	 this.setLongMobileNumber(longPhoneNumber);
   	 this.setStrGender(strGender);
   	 this.setStrPassword(strPassword);
   	 // Click on sign up button
   	 System.out.println("Hi, "+strFirstName+" your Facebook Account "
   	 		+ "is Created Successfully.");
    }
	
	
	
}
