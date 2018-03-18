package com.admin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class AdminScreen extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminScreen frame = new AdminScreen();
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
	public AdminScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 591, 358);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFiles = new JMenu("Files");
		menuBar.add(mnFiles);
		
		JMenuItem mntmBookAppointment = new JMenuItem("Book Appointment");
		mnFiles.add(mntmBookAppointment);
		
		JMenuItem mntmCancelAppointment = new JMenuItem("Cancel Appointment");
		mnFiles.add(mntmCancelAppointment);
		
		JMenuItem mntmSearchPatientInfo = new JMenuItem("Search Patient Info");
		mnFiles.add(mntmSearchPatientInfo);
		
		JMenu mnReports = new JMenu("Reports");
		menuBar.add(mnReports);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Today's Appointment");
		mnReports.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Tomorrow's Appointment");
		mnReports.add(mntmNewMenuItem_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 476, 214);
		contentPane.add(scrollPane);
		
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
}
