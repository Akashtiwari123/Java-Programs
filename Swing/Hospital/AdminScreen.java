package com.main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class AdminScreenMain extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnFiles ;
	private JMenuItem mntmBookAppointment ;
	private JMenuItem mntmCancelAppointment;
	private JMenuItem mntmSearchPatientInfo ;
	private JMenu mnReports;
	private JMenuItem mntmNewMenuItem ;
	private JMenuItem mntmNewMenuItem_1;

	
	public AdminScreenMain() {
		addcomponents();
		
	}

	private void addcomponents() {
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setVisible(true);
		setTitle("Admin");
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
	
		mnFiles = new JMenu("Files");
		menuBar.add(mnFiles);
		
		 mntmBookAppointment = new JMenuItem("Book Appointment");
		mnFiles.add(mntmBookAppointment);
		 mntmBookAppointment.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				BookApptMain bam=new BookApptMain();
				bam=null;
				
			}
			 
		 });
		 mntmCancelAppointment = new JMenuItem("Cancel Appointment");
		mnFiles.add(mntmCancelAppointment);
		
		 mntmSearchPatientInfo = new JMenuItem("Search Patient Info");
		mnFiles.add(mntmSearchPatientInfo);
		
		 mnReports = new JMenu("Reports");
		menuBar.add(mnReports);
		
		mntmNewMenuItem = new JMenuItem("Today's Appointment");
		mnReports.add(mntmNewMenuItem);
		
		mntmNewMenuItem_1 = new JMenuItem("Tomorrow's Appointment");
		mnReports.add(mntmNewMenuItem_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}
	
	
}
