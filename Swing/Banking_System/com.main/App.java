package com.main;

import java.awt.EventQueue;
import java.util.Scanner;

import com.pro.A;
import com.pro.B;

/*
@author:Akash Tiwari
*/

public class App {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new MainScreen();
			
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		

//System.out.println("The initial balance is :"+c.getBalance());
 /* A a=new A();
  B b=new B();
  System.out.print("Enter the amount :");
  Scanner sc=new Scanner(System.in);
  int amount=sc.nextInt();
  a.deposit(c, amount);


System.out.println("The final balance is :"+c.getBalance());
*/
	}

}
