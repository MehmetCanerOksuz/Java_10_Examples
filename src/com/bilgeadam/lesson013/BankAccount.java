package com.bilgeadam.lesson013;
/*
 * bir interest rate, account number, birde balance özelliklerim var..
 * 
 * bu sınıfı soyutlamanızı istiyorum..  Bankamızın faiz oranı 0.05 olsun..
 * 
 * daha sonra faiz getirisini hesaplayan bir metod yazalım. getInterestRate ==>
 * 
 * bir de getInformation metodu yazıp hesap bilgilerimizi gösterelim..
 * 
 */

public class BankAccount {
	
	static double interestRate;
	String accountNumber;
	double balance;
	
	public BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public BankAccount(String accountNumber) {
		this();
		this.accountNumber = accountNumber;
		
	}
	
	public BankAccount() {
		balance =100;
	}
	public void getInformation() {
		
		System.out.println("Hesap numarası ==>>" + accountNumber);
		System.out.println("Hesap Bakiyesi ==>>" + balance);
		System.out.println("Faiz Oranı ==>>" + interestRate);
		System.out.println("Faiz getirisi ==>>" + getInterestRate());
		
	}
	
	public double getInterestRate() {
		
		return balance*interestRate;
	}
	


}
