package com.vstjava.day3;

public class BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account objAccount = new Account(1000);
		objAccount.deposit(9000);
		objAccount.getInterest();
		objAccount.savingAccountWithdraw(100);
		objAccount.currentAccountWithdraw(15000);
		
		objAccount.closeAccount();
	}
}
