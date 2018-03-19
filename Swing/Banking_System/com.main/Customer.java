package com.main;
/*
@author:Akash Tiwari
*/
import java.util.Scanner;

import com.pro.A;
import com.pro.B;

public class Customer {
  A a=new A();
	private String name;
	private int balance;
	B b=new B();
	public Customer(String name, int balance) {
		super();
		this.name = name;
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
  void deposit() {
	  System.out.println("Enter the amount to deposit");
	  Scanner sc=new Scanner(System.in);
			  int amount=sc.nextInt();
			  a.deposit( amount);
  }
  void withdraw() {
	  System.out.println("Enter the amount to withdraw");
	  Scanner sc=new Scanner(System.in);
			  int amount=sc.nextInt();
			 b.withdraw(amount);
  }
}
