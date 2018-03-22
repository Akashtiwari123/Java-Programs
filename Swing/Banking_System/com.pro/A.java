package com.pro;
/*
@author:Akash Tiwari
*/

import com.main.Customer;
import com.main.Deposit;

public class A implements Deposit{
	double balance;
	double amount;
	
	
	@Override
	public void deposit(Customer c, double amount) {
		System.out.println(c.getBalance());
		this.balance=c.getBalance();
		this.amount=amount;
		
		c.setBalance(update());
	}
	public double update() {
	this.balance=this.balance+amount;
	return balance;
	}
}
