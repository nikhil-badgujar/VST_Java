package com.vstjava.day6;

public class BaseTest {
	
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
	
}
