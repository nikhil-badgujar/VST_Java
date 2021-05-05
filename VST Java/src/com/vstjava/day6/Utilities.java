package com.vstjava.day6;

import java.text.DecimalFormat;
import java.util.Random;

public class Utilities {
		
	private static final String strAllCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
			+ "qwertyuiopasdfghjklzxcvbnm";
	
	Random random = new Random();
	
	StringBuilder sb = new StringBuilder();
	
	/***
	 * to generate Random String
	 * @param count
	 * @return
	*/
	public String getRandomString(int intCount) {
		StringBuilder sb = new StringBuilder();
		while (intCount-- != 0) {
				int intCharacter = (int)(Math.random()*strAllCharacters.length());
				sb.append(strAllCharacters.charAt(intCharacter));
		}
	return sb.toString();
	} 	
	
	/***
	 * to generate Email ID
	 * @return
	 */
	public String getRandomEmailId() {
		// TODO Auto-generated method stub
		return getRandomString(5) + getRandomNumber(0, 9) + "@gmail.com";
	}
	
	/***
	 * to generate random number in given range
	 * @param intFrom
	 * @param intTo
	 * @return
	 */
	public int getRandomNumber(int intFrom, int intTo) {		
		int intRandomNumber;
		do {
			intRandomNumber= (int)(Math.random()*(intTo - intFrom))
						+ intFrom;
		}while(intRandomNumber == 0);
		return intRandomNumber;
	}
	
	/***
	 * to generate Mobile Number
	 * @return
	 */
	public String getMobileNumber(){
		int intNum = random.nextInt(1000000000);
		DecimalFormat df = new DecimalFormat("000000000"); //remaining 9 digits
		String strPhoneNumber = getRandomNumber(7,9) + df.format(intNum);
		return strPhoneNumber;
	}
	
}
