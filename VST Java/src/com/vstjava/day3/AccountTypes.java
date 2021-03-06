package com.vstjava.day3;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public abstract class AccountTypes {
	
	double doubleBalance;
	private static final float floatInterest = 6.00f;
	
	public AccountTypes(double doubleBalance) {
		this.doubleBalance = doubleBalance;
	}
	
	public double deposit(double doubleAmount) {
		return this.doubleBalance += doubleAmount;
	}
	
	public void getInterest() {
		double intInterestAmount = doubleBalance;
		intInterestAmount *= floatInterest/100;
		this.doubleBalance += intInterestAmount;
		System.out.println("Interest Amount : "+ getBalance(this.doubleBalance));
	}
	
	public static String getBalance(double doubleAmount) {
		DecimalFormat df = new DecimalFormat("#.####");
		df.setRoundingMode(RoundingMode.FLOOR);
		return df.format(doubleAmount);
	}
	
	public void closeAccount() {
		System.out.println("Closing acc from Abstract Class");	
	}
	
	abstract void savingAccountWithdraw(double doubleWithdrawAmount);
	abstract void currentAccountWithdraw(double doubleWithdrawAmount);

}
