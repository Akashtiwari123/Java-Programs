
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MainScreen extends JFrame implements ActionListener{
     JPanel panel;
     JLabel lbl1;
     JLabel lbl2,lbl3;
     JTextField txt1;
     JPasswordField txt2;
     JButton btn1;
     
   
	 public MainScreen(){
		panel=new JPanel();
		panel.setBounds(20, 20, 300, 250);
		panel.setLayout(null);
		panel.setBackground(Color.ORANGE);
		
		addcomponents();
		
		panel.add(txt1);
		panel.add(lbl1);
		panel.add(lbl2);
		panel.add(txt2);
		panel.add(btn1);
		panel.add(lbl3);
		add(panel);
		
		
	setTitle("Login Form");
	setVisible(true);
	setSize(400, 350);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
      }
	private void addcomponents() {
		lbl1=new JLabel("Enter Username:");
		lbl1.setBounds(50,50,130,30);
		
		txt1=new JTextField(20);
		txt1.setBounds(150,50,100,30);
		
		lbl2=new JLabel("Enter Password:");
		lbl2.setBounds(50,120,100,30);
		
		txt2=new JPasswordField(20);
		txt2.setBounds(150,120,100,30);
		
		btn1=new JButton("LOGIN");
		btn1.setBounds(150,190,90,30);
		
		btn1.addActionListener(this);
		
		lbl3=new JLabel("");
		lbl3.setBounds(50,250,150,30);
		
		
	}
	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent arg0) {
		  String username,password;
		username=txt1.getText();
		password=txt2.getText();
		if(username.equals("admin") && password.equals("123")) {
		
			HomeScreen hm=new HomeScreen();
			this.setVisible(false);
			hm=null;
			
		}
		else {
			lbl3.setText("Invalid Login ,Please Try again !!");
		}
	} 
	
}
