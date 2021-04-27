package com.vstjava.day1;

public class TestConditionalStatements {
	
	//to get month name
	public static void getMonth(int intMonth)
	{
		switch (intMonth) {
		case 1:
			System.out.println("It's January Month");
			break;
		case 2:
			System.out.println("It's February Month");
			break;
		case 3:
			System.out.println("It's March Month");
			break;
		case 4:
			System.out.println("It's April Month");
			break;
		case 5:
			System.out.println("It's May Month");
			break;
		case 6:
			System.out.println("It's June Month");
			break;
		case 7:
			System.out.println("It's July Month");
			break;
		case 8:
			System.out.println("It's August Month");
			break;			
		case 9:
			System.out.println("It's September Month");
			break;
		case 10:
			System.out.println("It's October Month");
			break;
		case 11:
			System.out.println("It's November Month");
			break;
		case 12:
			System.out.println("It's December Month");
			break;			
			
		default:
			System.out.println("Not a Valid Month");
			break;
		}
	}
	
	//to check the drinks
	public static void CheckDrinks(String strDrinks)
	{
		if(strDrinks.toLowerCase().equals("tea"))
			System.out.println("You choose Tea!");
		else if(strDrinks.toLowerCase().equals("coffee"))
			System.out.println("You choose Coffee!");
		else if(strDrinks.toLowerCase().equals("milk"))
			System.out.println("You choose Milk!");
		else 
			System.out.println("Drink water else!");
	}
	
	public static void main(String[] args) {
		getMonth(01);
		CheckDrinks("Tea");
	}

}
