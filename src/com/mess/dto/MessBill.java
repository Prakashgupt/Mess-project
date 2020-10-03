package com.mess.dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.text.DateFormatter;

public class MessBill {

	public static void saveBill(String reg,int amt )
	{
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");  
  	   LocalDateTime now = LocalDateTime.now();
		String date=now.toString();
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			Statement stmt = con.createStatement();
			stmt = con.createStatement();

			String sql ="INSERT INTO test.Mess(reg_id, total_amt, `Date`)VALUES('"+reg+"', "+amt+", '"+date+"');";
			stmt.executeUpdate(sql); 
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public static String tatolBill(String reg)
	{
		String total=null;
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			Statement stmt = con.createStatement();
			
			String sql = "SELECT sum(total_amt) FROM test.mess where reg_id ='"+reg+"';";
			ResultSet rs=stmt.executeQuery(sql);  
			if(rs.next())  
			{
				total=rs.getString(1);
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
        return total;
	}
	}

