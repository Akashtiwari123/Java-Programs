package com.main;

import java.util.Scanner;

import com.pro.A;

/*
@author:Akash Tiwari
*/

public class App {

	public static void main(String[] args) {

		
Customer c=new Customer("Akash",5000.00);
System.out.println("The initial balance is :"+c.getBalance());
  A a=new A();
  Scanner sc=new Scanner(System.in);
  int amount=sc.nextInt();
  a.deposit(c, amount);


System.out.println("The final balance is :"+c.getBalance());
	}

}
