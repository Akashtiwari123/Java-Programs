package com.admin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class bookapt extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bookapt frame = new bookapt();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public bookapt() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Item1", "Item2", "Item3", "Item4"}));
		comboBox.setBounds(165, 212, 86, 20);
		contentPane.add(comboBox);
		
		JLabel lblSelectDate = new JLabel("Select Date");
		lblSelectDate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSelectDate.setBounds(32, 241, 86, 20);
		contentPane.add(lblSelectDate);
		
		JLabel lblSelectTime = new JLabel("Select Time");
		lblSelectTime.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSelectTime.setBounds(32, 273, 86, 20);
		contentPane.add(lblSelectTime);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Item1", "Item2", "Item3", "Item4"}));
		comboBox_1.setBounds(165, 243, 86, 20);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Item1", "Item2", "Item3", "Item4"}));
		comboBox_2.setBounds(165, 275, 86, 20);
		contentPane.add(comboBox_2);
		
		JButton btnNewButton = new JButton("Book Appointment");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(210, 328, 147, 31);
		contentPane.add(btnNewButton);
	}
}
