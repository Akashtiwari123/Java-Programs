package com.pro;
/*
@author:Akash Tiwari
*/



import com.main.Customer;
import com.main.Deposit;

public class A implements Deposit{
	double balance;
	double amount;
	Customer c;
	

	@Override
	public void deposit(Customer c, double amount) {
	//this.c=c;
		this.balance=c.getBalance();
		this.balance=this.balance+amount;
	    c.setBalance(balance);
	}
	
}
