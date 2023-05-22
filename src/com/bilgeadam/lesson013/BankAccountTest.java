package com.bilgeadam.lesson013;

public class BankAccountTest {
	
	public static void main(String[] args) {
		BankAccount.interestRate =0.05;
		
		BankAccount bankAccount1 = new BankAccount();
		bankAccount1.accountNumber = "123";
		//bankAccount1.balance = 1258.50;
		bankAccount1.getInformation();
		
		BankAccount bankAccount2 = new BankAccount("1456",548845.5);
		bankAccount2.accountNumber = "456";      //değiştirdik..
		bankAccount2.balance = 341258.50;        // değiştirmiş olduk.
		bankAccount2.getInformation();
		
		BankAccount bankAccount3 = new BankAccount("789", 4586.25);
		bankAccount3.getInformation();
		
		BankAccount bankAccount4 = new BankAccount("5789");
		bankAccount4.getInformation();
	}

}
