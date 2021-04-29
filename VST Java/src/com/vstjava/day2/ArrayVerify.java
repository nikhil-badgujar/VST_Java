package com.vstjava.day2;

public class ArrayVerify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []intArr1 = {1, 2, 3, 4, 5};
		int []intArr2 = {1, 2, 3, 4, 44};
		int flag = 0;
		
		if(intArr1.length == intArr2.length) {				
			for(int intIndex = 0; intIndex < intArr1.length; intIndex++) {
				if(intArr1[intIndex] != intArr2[intIndex])
				{
					flag = 1;
					break;
				}
				else
					continue;
			}		
		}
		
		if(flag != 1) {
			System.out.println("Array elements are equal");
		}else 
			System.out.println("Array elements are Not equal");

	}

}
