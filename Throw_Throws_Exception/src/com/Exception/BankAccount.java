package com.Exception;

import java.util.List;
import java.util.Scanner;
import javax.naming.InsufficientResourcesException;
import java.util.ArrayList;



public class BankAccount {

	private String accountNumber;
	private double balance;
	private List<String> transactionHistory;
	
	
	public BankAccount(String accountNumber , double initialBalance) {
		this.accountNumber = accountNumber;
		this.balance = initialBalance;
		this.transactionHistory = new ArrayList<>();
	}
	
public void deposit(double amount) {
	
	if(amount <= 0) {
		throw new IllegalArgumentException("Deposite amount must be positive.");
		
	}
	
	balance += amount;
	transactionHistory.add("Deposit: +" + amount);
	
}

public void withdraw(double amount) throws InsufficientResourcesException{
	if(amount <= 0) {
		throw new IllegalArgumentException("Withdrawal amount must be positive.");
	}
	
	if(amount > balance) {
		throw new InsufficientResourcesException("Insufficient Balance.");
	}
	balance -= amount;
	transactionHistory.add("Withdrawal: -" + amount);
	
}

public double getBalance() {
return balance;
}

public List<String> getTransactionHistory(){
	return transactionHistory;
}

public static void main(String[] args) {
	BankAccount account = new BankAccount("12345" , 1000);
	
	Scanner sc = new Scanner(System.in);
	
	try {
		System.out.println("Enter diposit amount");
	   double dipositAmount = Double.parseDouble(sc.nextLine());
	account.deposit(dipositAmount);
	
	System.out.println("Enter withdrawal amount: ");
	double withdrawalAmount = Double.parseDouble(sc.nextLine());
	account.withdraw(withdrawalAmount);
	
	System.out.println("Transaction History: ");
	for(String transaction : account.getTransactionHistory()) {
		System.out.println(transaction);
	}
	}
	catch(NumberFormatException e) {
		System.out.println("Error: Invalid input. Please enter a valid number.");
	}catch(IllegalArgumentException | InsufficientResourcesException e) {
		System.out.println("Error: " + e.getMessage());
		
	
	}finally {
		sc.close();
	}
}
	
}

