package com.vstjava.day2;

public class TestLoops {
	
	String []strArr = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug",
						"Sep","Oct","Nov","Dec"};
	
	public void forLoop() {
		for(int intCount = 0; intCount < strArr.length; intCount++)
		{
			System.out.println("Index " + intCount + " : " + strArr[intCount]);
		}
	}
	
	public void forEachLoop() {
		for(String strValue : strArr)
		{
			System.out.println("Values " + strValue);
		}
	}
	
	public void whileLoop() {
		int intCount = 0;
		while(intCount < strArr.length) {
			System.out.println("Index " + intCount + " : " + strArr[intCount]);
			intCount++;
		}
	}
	
	public void doWhileLoop() {
		int intCount = 0; 
		do {
			System.out.println("Index " + intCount + " : " + strArr[intCount]);
			intCount++;
		}while(intCount < strArr.length);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestLoops objTestLoops = new TestLoops();
		objTestLoops.forLoop();
		objTestLoops.forEachLoop();
		objTestLoops.whileLoop();
		objTestLoops.doWhileLoop();
	}

}
