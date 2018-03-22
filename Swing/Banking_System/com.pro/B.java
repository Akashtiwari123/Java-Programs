package com.pro;
/*
@author:Akash Tiwari
*/

import com.main.Customer;
import com.main.Withdraw;

public class B implements Withdraw{
	double balance;
	double amount;
	

	@Override
	public void withdraw(Customer c,double amount) {
		this.balance=c.getBalance();
		c.setBalance(this.balance=this.balance-amount);
	}

}
