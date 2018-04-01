package com.main;
/*
@author:Akash Tiwari
*/
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainScreen extends JFrame {

	private JPanel contentPane;
	private JTextField txtname;
	private JTextField txtbalance;
	private String name;
	private double balance;

	
	
	/**
	 * Create the frame.
	 */
	public MainScreen() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel lblWelcomeBankSystem = new JLabel("Welcome  Bank System");
		lblWelcomeBankSystem.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblWelcomeBankSystem.setBounds(99, 28, 223, 26);
		contentPane.add(lblWelcomeBankSystem);
		
		JLabel lblCustomreName = new JLabel("Customer Name");
		lblCustomreName.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblCustomreName.setBounds(40, 88, 113, 26);
		contentPane.add(lblCustomreName);
		
		JLabel lblInitialBalance = new JLabel("Initial Balance");
		lblInitialBalance.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblInitialBalance.setBounds(40, 142, 113, 26);
		contentPane.add(lblInitialBalance);
		
		txtname = new JTextField();
		txtname.setBounds(184, 93, 138, 20);
		contentPane.add(txtname);
		txtname.setColumns(10);
		
		txtbalance = new JTextField();
		txtbalance.setBounds(184, 147, 138, 20);
		contentPane.add(txtbalance);
		txtbalance.setColumns(10);
		
		 
		 JButton btnProcess = new JButton("Process");
		btnProcess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				name=txtname.getText().toString();
				 balance=Double.parseDouble(txtbalance.getText().toString());
				 
				 Customer c=new Customer(name,balance);
				 OpScreen op=new OpScreen(c);

				 op=null;
				 
			}
		});
		btnProcess.setFont(new Font("Verdana", Font.PLAIN, 14));
		btnProcess.setBounds(139, 199, 99, 27);
		contentPane.add(btnProcess);
		
		
	}

	
	
}
