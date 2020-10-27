package com.training.examples;

public class Bank {

	double balance;
	
	public Bank(double balance) {
		super();
		this.balance = balance;
	}

	public double withdraw(double amount) throws ExceedingException {
		if(amount>4000 || amount==balance) {
			throw new ExceedingException("amount beyond limit");
		}
		if(amount<=0) {
			throw new NegValueException("amount less than 0");
		}
		balance=balance-amount;
		return balance;
	}
	public double deposite(double amount) throws ExceedingException {
		if(amount>49999|| amount==0) {
			throw new ExceedingException("amount beyond Limit");
		}
		return balance+=amount;
	}
	
}
