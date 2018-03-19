package com.pro;
/*
@author:Akash Tiwari
*/
import com.main.Customer;
import com.main.Deposit;

public class A implements Deposit{
	int balance;
	double amount;
	
	@Override
	public void deposit(Customer c, double amount) {
		System.out.println(c.getBalance());
		System.out.println(amount);
		c.setBalance(balance=(int) (c.getBalance()+amount));
	}
	
}
