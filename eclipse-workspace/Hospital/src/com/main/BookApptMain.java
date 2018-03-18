package com.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.model.Account;

public class BookApptMain extends JFrame{

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JComboBox comboBox_2;
	private JComboBox comboBox_1;
	private JDialog jd;
	
	public BookApptMain() {
	     setVisible(true);
	     setSize(700,500);
		addcomponenets();
	}

	private void addcomponenets() {
		
		
		setBounds(100, 100, 622, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Book Appointment");
		
		JLabel lblBookPatientAppointment = new JLabel("Book Patient Appointment");
		lblBookPatientAppointment.setBounds(210, 10, 185, 20);
		lblBookPatientAppointment.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBookPatientAppointment.setHorizontalAlignment(SwingConstants.CENTER);
		lblBookPatientAppointment.setBackground(new Color(255, 200, 0));
		contentPane.add(lblBookPatientAppointment);
		
		JButton btn2=new JButton("OK");
		jd=new JDialog(this,"Appointment Confirm",true);
		jd.setSize(300,200);/*
		btn2.setBounds(50,50, 20, 20);
		jd.add(btn2);
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jd.setVisible(false);
				//jd.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				
			}
		});
		*/
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblName.setBounds(89, 61, 73, 14);
		contentPane.add(lblName);
		
		JLabel lblContact = new JLabel("Contact");
		lblContact.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblContact.setBounds(89, 103, 73, 14);
		contentPane.add(lblContact);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAge.setBounds(89, 146, 73, 20);
		contentPane.add(lblAge);
		
		textField = new JTextField();
		textField.setBounds(165, 60, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(165, 102, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(165, 148, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 188, 586, 11);
		contentPane.add(separator);
		
		JLabel lblNewLabel = new JLabel("Select Doctor");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(32, 210, 113, 20);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"--Select Doctor--", "Dr.Vaknally", "Dr.Amit Mishra"}));
		comboBox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String dname=(String)comboBox.getSelectedItem();
				if(dname.equals("Dr.Vaknally")) {
					comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"10.00AM-12.00PM", "5.00PM-7.00PM"}));
				}
				if(dname.equals("Dr.Amit Mishra")) {
					comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"2.00AM-4.00PM", "8.00PM-10.00PM"}));
				}
			}
			
		});
		comboBox.setBounds(165, 212, 140, 20);
		contentPane.add(comboBox);
		
		JLabel lblSelectDate = new JLabel("Select Date");
		lblSelectDate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSelectDate.setBounds(32, 241, 140, 20);
		contentPane.add(lblSelectDate);
		
		JLabel lblSelectTime = new JLabel("Select Time");
		lblSelectTime.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSelectTime.setBounds(32, 273, 140, 20);
		contentPane.add(lblSelectTime);
		
		DateFormat df=DateFormat.getDateInstance();
		String d=df.format(new Date());
		Calendar c=Calendar.getInstance();
		c.setTime(new Date());
		c.add(Calendar.DATE,1);
		Date d1=c.getTime();  //Tomorrow's date
		String d2=df.format(d1);
		
		
		
	 comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {d, d2}));
	
		comboBox_1.setBounds(165, 243, 140, 20);
		contentPane.add(comboBox_1);
		
		 comboBox_2 = new JComboBox();
		
		comboBox_2.setBounds(165, 275, 140, 20);
		contentPane.add(comboBox_2);
		
		JButton btnNewButton = new JButton("Book Appointment");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name=textField.getText();
				String contact=textField_1.getText();
				String age=textField_2.getText();
				String dname= (String) comboBox.getSelectedItem();
				String date=(String) comboBox_1.getSelectedItem();
				String time=(String) comboBox_2.getSelectedItem();
				
				Account a=new Account();
				try {
					a.insertPatientInfo(name, contact, age, dname, date, time);
					a=null;
					jd.setVisible(true);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(210, 328, 147, 31);
		contentPane.add(btnNewButton);
	}

}
