package com.main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.pro.A;
import com.pro.B;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JInternalFrame;
import java.awt.Panel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OpScreen extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPanel panel;
	
	private String name;
	private double balance;
	

	/**
	 * Create the frame.
	 * @param c 
	 */
	public OpScreen(Customer c) {
		
		name=c.getName();
		System.out.println(name);
		balance=c.getBalance();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcome = new JLabel("Welcome");
		lblWelcome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblWelcome.setBounds(46, 25, 86, 22);
		contentPane.add(lblWelcome);
		
		JLabel lblYourBalance = new JLabel("Your Balance");
		lblYourBalance.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblYourBalance.setBounds(46, 58, 86, 22);
		contentPane.add(lblYourBalance);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setText(name);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(183, 27, 125, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		String bal=String.valueOf(balance);
		lblNewLabel_1.setText(bal);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(183, 60, 125, 21);
		contentPane.add(lblNewLabel_1);
		
		 ButtonGroup bg=new ButtonGroup();
		
		JRadioButton rdbtnDeposit = new JRadioButton("Deposit");
		rdbtnDeposit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel.setVisible(true);
			}
		});
		rdbtnDeposit.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnDeposit.setBounds(46, 104, 109, 23);
		contentPane.add(rdbtnDeposit);
		
		JRadioButton rdbtnWithdraw = new JRadioButton("Withdraw");
		rdbtnWithdraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(true);
			}
		});
		rdbtnWithdraw.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnWithdraw.setBounds(46, 130, 109, 23);
		contentPane.add(rdbtnWithdraw);
		bg.add(rdbtnDeposit);
		bg.add(rdbtnWithdraw);
		
	    panel= new JPanel();
		panel.setBounds(46, 180, 318, 44);
		contentPane.add(panel);
		panel.setVisible(false);
		
		JLabel lblNewLabel_2 = new JLabel("Enter Amount");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setVerticalAlignment(SwingConstants.BOTTOM);
		panel.add(lblNewLabel_2);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		
		
		JButton btnNewButton = new JButton("Process");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnDeposit.isSelected()) {
					String b=textField.getText().toString();
					double amount=Double.parseDouble(b);
					 A a=new A();
					 a.deposit(c, amount);
					 double bal=c.getBalance();
					 String cnbal=String.valueOf(bal);
					 lblNewLabel_1.setText(cnbal);
					 
					 JDialog  jd=new JDialog();
					 jd.setVisible(true);
					 jd.setLocationRelativeTo(null);
						jd.setTitle("Deposit");
						jd.setSize(300,100);
						JLabel lb=new JLabel("Your new balance is :"+cnbal);
						jd.add(lb);
				}
				else {
					B b=new B();
					String b1=textField.getText().toString();
					double amount=Double.parseDouble(b1);
					b.withdraw(c, amount);
					double bal=c.getBalance();
					 String cnbal=String.valueOf(bal);
					 lblNewLabel_1.setText(cnbal);
					
					 JDialog  jd=new JDialog();
					 jd.setVisible(true);
						jd.setTitle("Withdraw");
						jd.setSize(300,100);
						JLabel lb=new JLabel("Your new balance is :"+cnbal);
						jd.add(lb);
				}
			}
		});
		panel.add(btnNewButton);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 92, 427, 5);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 160, 414, 9);
		contentPane.add(separator_1);
	}
}
