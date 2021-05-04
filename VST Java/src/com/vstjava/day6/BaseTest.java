package com.vstjava.day6;

public class BaseTest {
	
	public void initializeWebBrowser(String strBrowser){
		System.out.println("Your '"+ strBrowser +"' browser is initialized.");
	}
	
	public void openFacebookURL(String strFacebookURL){		
		System.out.println("You'r redirected to Facebook login page : "
				+ strFacebookURL);		
	}
	
	public void closeBrowser(){
		System.out.println("Browser is closing now..");
	}
	
}
