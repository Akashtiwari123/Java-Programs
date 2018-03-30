package com.main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JSeparator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainScreen extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField;
	private JButton button_0,button_1,button_2,button_3,button_4,button_5,button_6,button_7,button_8,button_9,button_10,button_equals,button_add,button_min,button_mul,button_div,btnDelete,btnClear;
	private static double a,b,result;
	static int task;
	
	
	/**
	 * Create the frame.
	 */
	public MainScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setBounds(24, 22, 237, 41);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 74, 264, 9);
		contentPane.add(separator);
		
		 button_7 = new JButton("7");
		button_7.addActionListener(this);
		button_7.setFont(new Font("Arial", Font.BOLD, 18));
		button_7.setBounds(25, 92, 45, 29);
		contentPane.add(button_7);
		
		 button_8 = new JButton("8");
		button_8.addActionListener(this);
		button_8.setFont(new Font("Arial", Font.BOLD, 18));
		button_8.setBounds(87, 92, 45, 29);
		contentPane.add(button_8);
		
		 button_9 = new JButton("9");
		button_8.addActionListener(this);
		button_9.setFont(new Font("Arial", Font.BOLD, 18));
		button_9.setBounds(149, 92, 45, 29);
		contentPane.add(button_9);
		
		button_4 = new JButton("4");
		button_4.addActionListener(this);
		button_4.setFont(new Font("Arial", Font.BOLD, 18));
		button_4.setBounds(24, 146, 45, 29);
		contentPane.add(button_4);
		
		button_5 = new JButton("5");
		button_5.addActionListener(this);
		button_5.setFont(new Font("Arial", Font.BOLD, 18));
		button_5.setBounds(87, 146, 45, 29);
		contentPane.add(button_5);
		
		button_6 = new JButton("6");
		button_6.addActionListener(this);
		button_6.setFont(new Font("Arial", Font.BOLD, 18));
		button_6.setBounds(149, 146, 45, 29);
		contentPane.add(button_6);
		
		button_1 = new JButton("1");
		button_1.addActionListener(this);
		button_1.setFont(new Font("Arial", Font.BOLD, 18));
		button_1.setBounds(25, 199, 45, 29);
		contentPane.add(button_1);
		
		 button_2 = new JButton("2");
		button_2.addActionListener(this);
		button_2.setFont(new Font("Arial", Font.BOLD, 18));
		button_2.setBounds(87, 199, 45, 29);
		contentPane.add(button_2);
		
		button_3 = new JButton("3");
		button_3.addActionListener(this);
		button_3.setFont(new Font("Arial", Font.BOLD, 18));
		button_3.setBounds(149, 199, 45, 29);
		contentPane.add(button_3);
		
		button_10 = new JButton(".");
		button_10.addActionListener(this);
		button_10.setFont(new Font("Arial", Font.BOLD, 18));
		button_10.setBounds(24, 249, 45, 29);
		contentPane.add(button_10);
		
		button_0 = new JButton("0");
		button_0.addActionListener(this);
		button_0.setFont(new Font("Arial", Font.BOLD, 18));
		button_0.setBounds(87, 249, 45, 29);
		contentPane.add(button_0);
		
		button_equals = new JButton("=");
		button_equals.addActionListener(this);
		button_equals.setFont(new Font("Arial", Font.BOLD, 18));
		button_equals.setBounds(149, 249, 45, 29);
		contentPane.add(button_equals);
		
		button_div = new JButton("/");
		button_div.addActionListener(this);
		button_div.setFont(new Font("Arial", Font.BOLD, 18));
		button_div.setBounds(216, 92, 45, 29);
		contentPane.add(button_div);
		
		button_mul = new JButton("*");
		button_mul.addActionListener(this);
		button_mul.setFont(new Font("Arial", Font.BOLD, 18));
		button_mul.setBounds(216, 146, 45, 29);
		contentPane.add(button_mul);
		
		button_min = new JButton("-");
		button_min.addActionListener(this);
		button_min.setFont(new Font("Arial", Font.BOLD, 18));
		button_min.setBounds(216, 199, 45, 29);
		contentPane.add(button_min);
		
		button_add = new JButton("+");
		button_add.addActionListener(this);
		button_add.setFont(new Font("Arial", Font.BOLD, 18));
		button_add.setBounds(216, 249, 45, 29);
		contentPane.add(button_add);
		
		btnDelete = new JButton("Delete");
		btnDelete.addActionListener(this);
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnDelete.setBounds(24, 304, 89, 29);
		contentPane.add(btnDelete);
		
		btnClear = new JButton("Clear");
		btnClear.addActionListener(this);
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnClear.setBounds(149, 304, 89, 29);
		contentPane.add(btnClear);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button_0) {
			
			textField.setText(textField.getText().concat("0"));
			
		}
		if(e.getSource()==button_1) {
			textField.setText(textField.getText().concat("1"));
		}
		if(e.getSource()==button_2) {
			textField.setText(textField.getText().concat("2"));
		}
		if(e.getSource()==button_3) {
			textField.setText(textField.getText().concat("3"));
		}
		if(e.getSource()==button_4) {
			textField.setText(textField.getText().concat("4"));
		}
		if(e.getSource()==button_5) {
			textField.setText(textField.getText().concat("5"));
		}
		if(e.getSource()==button_6) {
			textField.setText(textField.getText().concat("6"));
		}
		if(e.getSource()==button_7) {
			textField.setText(textField.getText().concat("7"));
		}
		if(e.getSource()==button_8) {
			textField.setText(textField.getText().concat("8"));
		}
	 
	   if(e.getSource()==button_9) {
		textField.setText(textField.getText().concat("9"));
	   }
		if(e.getSource()==button_10) {
			textField.setText(textField.getText().concat("."));
		}
		
		
		if(e.getSource()==button_add) {
			a=Double.parseDouble(textField.getText());
			textField.setText("");
			task=1;
		}
		if(e.getSource()==button_min) {
			a=Double.parseDouble(textField.getText());
			textField.setText("");
			task=2;
		}
		if(e.getSource()==button_mul) {
			a=Double.parseDouble(textField.getText());
			textField.setText("");
			task=3;
		}
		if(e.getSource()==button_div) {
			a=Double.parseDouble(textField.getText());
			textField.setText("");
			task=4;
		}
		if(e.getSource()==btnClear) {
			textField.setText("");
		}
		if(e.getSource()==btnDelete) {
			 String s=textField.getText();
	            textField.setText("");
	            for(int i=0;i<s.length()-1;i++)
	            textField.setText(textField.getText()+s.charAt(i));
		}
		
		if(e.getSource()==button_equals) {
			b=Double.parseDouble(textField.getText());
			switch(task) {
			case 1:
				result=a+b;
				break;
			case 2:
				result=a-b;
				break;
			case 3:
				result=a*b;
				break;
			case 4:
				result=a/b;
				break;
			default :
					result=0;
			}
			textField.setText(String.valueOf(" "+result));
		}
		
		
	}


	
}

