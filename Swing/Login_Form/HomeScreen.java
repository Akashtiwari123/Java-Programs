
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
/*       
 +@author  : Akash Tiwari
 +*/
public class HomeScreen extends JFrame{
	 JPanel panel;
	 
	public  HomeScreen(){
		panel=new JPanel();
		panel.setBounds(20, 20, 300, 250);
		panel.setLayout(null);
		panel.setBackground(Color.ORANGE);
	
		add(panel);
		setTitle("Home Screen");
		setVisible(true);
		setSize(600, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 }
}
