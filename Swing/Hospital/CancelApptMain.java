package com.main;
/*
@author:Akash Tiwari
*/
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.model.Account;

import javax.swing.JLabel;
import java.awt.Font;
import java.sql.SQLException;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDialog;

public class CancelApptMain extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JDialog jd;

	/*
	 * Create the frame.
	 */
	public CancelApptMain() {
		setTitle("Cancel Appointment");
		setVisible(true);
		  setSize(500,300);
			addcomponenets();
		
	}

	private void addcomponenets() {
		
		setBounds(100, 100, 450, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterThePatient = new JLabel("Enter the patient name:");
		lblEnterThePatient.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEnterThePatient.setBounds(25, 41, 146, 29);
		contentPane.add(lblEnterThePatient);
		
		textField = new JTextField();
		textField.setBounds(184, 43, 162, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnCancelAppointment = new JButton("Cancel Appointment");
		btnCancelAppointment.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCancelAppointment.setBounds(124, 122, 146, 37);
		contentPane.add(btnCancelAppointment);
		btnCancelAppointment.addActionListener(a->{
			String name=textField.getText();
			Account ac=new Account();
		     try {
				ac.cancelpatient(name);
				ac=null;
				jd.setVisible(true);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		 jd=new JDialog(this,"Appointment Cancelled",true);
		jd.setTitle("Message");
		jd.setSize(300,100);
		JLabel lb=new JLabel("Appointment Cancelled Successfully !!");
		jd.add(lb);
	}
}
