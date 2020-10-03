package com.mess.dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mess.bean.Student;


public class DBCon {

	public static void insertStudent(Student s) {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			Statement stmt = con.createStatement();
			stmt = con.createStatement();

			String sql = "INSERT INTO test.students (reg_id, std_name, roll_no, email_add, Mess_nm, Password, gender, `Date`) VALUES('"
					+ s.getRegId() + "', '"+s.getStdNm() +"','"+s.getRollNo()+"', '"+s.getEmail()+"', '"+s.getMessName()+"', '"+s.getPassword()+"', '"+s.getGender()+"', '"+s.getdate()+"');";

			stmt.executeUpdate(sql);
          
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static boolean varifyLogin(StudentDTO s) {
		Connection con = null;
		boolean flag=false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			Statement stmt = con.createStatement();
			stmt = con.createStatement();
			String sql = "select reg_id from test.students where reg_id='"+s.getRegId()+"'and password='"+s.getPassword()+"';";
			ResultSet rs=stmt.executeQuery(sql);  
			if(rs.next())  
			{
				flag=true;
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
     return flag;
	}
	
	

}
