package com.vstjava.day6;

import java.util.Hashtable;

public class BaseTest extends Utilities {
	
	 public Hashtable<String, String> objHashTable;
	 
	 public BaseTest() {
		 objHashTable = new Hashtable<>();
	 }	 
	 
	 public Hashtable<String, String> getObjHashTable() {		 
		objHashTable.put("Browser", "Safari");		 
		objHashTable.put("Url", "https://en-gb.facebook.com/");	
		objHashTable.put("FirstName", this.getRandomString(5));
		objHashTable.put("Surname", this.getRandomString(7));
		objHashTable.put("BirthDate", this.getRandomNumber(1,31));
		objHashTable.put("BirthMonth", this.getRandomNumber(1,12));
		objHashTable.put("BirthYear", this.getRandomNumber(1920,2020));
		objHashTable.put("MobileNumber", this.getMobileNumber());
		objHashTable.put("EmailId", this.getRandomEmailId());
		objHashTable.put("Gender", "Male");
		objHashTable.put("Password", "*******");
		return objHashTable;
	}
	
	//initialize web browser 
	public void initializeWebBrowser(String strBrowser){
		System.out.println("Your '"+ strBrowser +"' browser is initialized.");
	}
	
	//open fb url
	public void openFacebookURL(String strFacebookURL){		
		System.out.println("You'r redirected to Facebook login page : "
				+ strFacebookURL);		
	}
	
	//close the browser
	public void closeBrowser(){
		System.out.println("Browser is closing now..");
	}
	
	
	
//	objHashTable.put("Browser", "Safari");
//	objHashTable.put("Url", "https://en-gb.facebook.com/");	
	
	
	
}
