package com.vstjava.day2;

public class TestStrings {
			
	public static void main(String[] args) {
		
		String strData = "Testing String Data";
		
		System.out.println("Length : "+ strData.length());
		System.out.println("CharAt : "+ strData.charAt(3));
		System.out.println("Substring : "+ strData.substring(3, 7));
		System.out.println("Contains : "+ strData.contains("z"));
		System.out.println("IndexOf : "+ strData.indexOf("String"));
		System.out.println("LastIndexOf : "+ strData.lastIndexOf("ing"));
		System.out.println("Replace : "+ strData.replaceAll("ing", "New"));
		
		System.out.println("Split :");
		String []strArr = strData.split("\\s");
		for(String strValue : strArr) {
			System.out.println(strValue);
		}
		
		String strData1 = String.join("/"," 01","01","2021 ");
		System.out.println("Join : "+ strData1);
		System.out.println(strData1.trim());
		
		String str1="FirstName";  
		String str2="LastName";  
		System.out.println("CompareTo : "+ str1.compareTo(str2));
		System.out.println("Concat : "+ str1.concat(" ").concat(str2)); 
		System.out.println("Equals : "+ str1.equals(str2));
		
		String strData2 = String.format("%x",15); //hexadecimal value
		System.out.println("Format : "+ strData2);
		
	}

}
