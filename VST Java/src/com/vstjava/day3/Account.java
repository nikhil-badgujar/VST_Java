package com.vstjava.day3;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Account extends AccountTypes {

	public Account(double doubleBalance) {
		super(doubleBalance);
		// TODO Auto-generated constructor stub
	}
	
	public void savingAccountWithdraw(double doubleWithdrawAmount) {
		
		if(doubleBalance - doubleWithdrawAmount < 1000)
			System.out.println("Saving Acc : Minimum Balance limit exceeds, Withdrawal Fail");
		else{
			this.doubleBalance -= doubleWithdrawAmount;
			System.out.println("Saving Account Balance : " + getBalance(this.doubleBalance));
		}
	}

	public void currentAccountWithdraw(double doubleWithdrawAmount) {

		if(doubleBalance - doubleWithdrawAmount < 0) {
			System.out.println("Current Acc : Your minimum balance limit is exceeding");			
		}			
		this.doubleBalance -= doubleWithdrawAmount;		
		System.out.println("Current Account Balance : " + getBalance(this.doubleBalance));
	}

}
