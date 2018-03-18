package com.main;
/*       
 +@author  : Akash Tiwari
 +*/
import java.awt.EventQueue;


public class App {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				 new AdminScreenMain();
			
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
