package com.pro;
/*
@author:Akash Tiwari
*/
import com.main.Customer;
import com.main.Withdraw;

public class B implements Withdraw{
	int balance;
	double amount;
	
	@Override
	public void withdraw(Customer c, double amount) {
		c.setBalance(balance=(int) (c.getBalance()-amount));
		
	}

}
