package com.model;
/*
@author:Akash Tiwari
*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;

public class Account {
	//step1
    String user="root";      //username of DB
    String pass="";           //Password of DB
    String url="jdbc:mysql://localhost:3306/hospital";     //Url of DB
    String driver="com.mysql.jdbc.Driver";                //DB Driver jar file
    
    
    Connection con;
    
    void dbconnect() throws ClassNotFoundException, SQLException {
    	
    	//step2-Load the driver
    	Class.forName(driver);    
    	
    	//step3-  Create connection
    	con=DriverManager.getConnection(url, user, pass);
  
    }
    
    void dbclose() throws SQLException {
    	con.close();
    }
    
    public void insertPatientInfo(String name,String contact,String age,String doctor_name, String date,String time) throws ClassNotFoundException, SQLException {
    	dbconnect();    //connect to database
    	
    	String sql="Insert into patient(name,contact,age,dname,date,time)values(?,?,?,?,?,?)";
    	PreparedStatement pstmt=con.prepareStatement(sql);
    	pstmt.setString(1, name);
    	pstmt.setString(2, contact);
    	pstmt.setString(3, age);
    	pstmt.setString(4, doctor_name);
    	pstmt.setString(5, date);
    	pstmt.setString(6, time);
    	
    	pstmt.executeUpdate();
    	dbclose();      //close the database
    }
    
    public ResultSet searchpatientInfo() throws ClassNotFoundException, SQLException {
        dbconnect();    //connect to database
  	
  	String sql="select * from patient";
  	PreparedStatement pstmt=con.prepareStatement(sql);
  	ResultSet rst=pstmt.executeQuery();
  	return rst;
     }
    
    
        public ResultSet fetchpatient() throws ClassNotFoundException, SQLException {
          dbconnect();    //connect to database
    	
    	String sql="select * from patient where date=?";
    	PreparedStatement pstmt=con.prepareStatement(sql);

    	DateFormat df=DateFormat.getDateInstance();
    	String d=df.format(new Date());
    	pstmt.setString(1, d);
    	ResultSet rst=pstmt.executeQuery();
    	return rst;
       }
        
        public ResultSet fetchpatientTomorrow() throws ClassNotFoundException, SQLException {
            dbconnect();    //connect to database
      	
      	String sql="select * from patient where date=?";
      	PreparedStatement pstmt=con.prepareStatement(sql);

      	DateFormat df=DateFormat.getDateInstance();
      	Calendar c=Calendar.getInstance();
      	c.setTime(new Date());
		c.add(Calendar.DATE,1);
		Date d1=c.getTime();  //Tomorrow's date
		String d2=df.format(d1);
      	pstmt.setString(1, d2);
      	ResultSet rst=pstmt.executeQuery();
      	return rst;
         }
        
        public void  cancelpatient(String name) throws ClassNotFoundException, SQLException {
            dbconnect();    //connect to database
      	
      	String sql="delete from patient where name=?";
      	PreparedStatement pstmt=con.prepareStatement(sql);
      	pstmt.setString(1, name);
      	pstmt.executeUpdate();
    	dbclose();      //close the database
      	
         }
}
