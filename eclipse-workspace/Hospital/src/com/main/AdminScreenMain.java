package com.main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.model.Account;

import net.proteanit.sql.DbUtils;

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
	private JTable table;
	private JScrollPane scrollPane;

	
	public AdminScreenMain() {
		addcomponents();
		
	}

	private void addcomponents() {
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 400);
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
		mntmCancelAppointment.addActionListener(a->{
			 CancelApptMain cam=new  CancelApptMain();
			 cam=null;
		});
		
		 mntmSearchPatientInfo = new JMenuItem("Search Patient Info");
		mnFiles.add(mntmSearchPatientInfo);
		mntmSearchPatientInfo.addActionListener(a->{
			try {
				searchpatientInfo();
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
		 mnReports = new JMenu("Reports");
		menuBar.add(mnReports);
		
		mntmNewMenuItem = new JMenuItem("Today's Appointment");
		mnReports.add(mntmNewMenuItem);
		mntmNewMenuItem.addActionListener(a->{
			try {
				fetchPatient();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		mntmNewMenuItem_1 = new JMenuItem("Tomorrow's Appointment");
		mnReports.add(mntmNewMenuItem_1);
		mntmNewMenuItem_1.addActionListener(a->{
			try {
				fetchpatientTomorrow();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
        contentPane.setLayout(null);
		
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 750, 300);
		contentPane.add(scrollPane);
	

	
		scrollPane.setVisible(false);
		 table = new JTable();
	
		scrollPane.setViewportView(table);
		
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null,null,null,null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		
		
		
	}


	private void searchpatientInfo() throws ClassNotFoundException, SQLException {
		Account ac=new Account();
		ResultSet rst=ac.searchpatientInfo();
		scrollPane.setVisible(true);
		table.setModel(DbUtils.resultSetToTableModel(rst));
	}


	private void fetchPatient() throws ClassNotFoundException, SQLException {
	   
		Account ac=new Account();
		ResultSet rst=ac.fetchpatient();
		scrollPane.setVisible(true);
		  table.setModel(DbUtils.resultSetToTableModel(rst));
	}
	

	private void fetchpatientTomorrow() throws ClassNotFoundException, SQLException {
		 
		Account ac=new Account();
		ResultSet rst=ac.fetchpatientTomorrow();
		scrollPane.setVisible(true);
		  table.setModel(DbUtils.resultSetToTableModel(rst));
		
	}
}
