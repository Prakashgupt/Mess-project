package com.ser;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetStudent
 */
@WebServlet("/GetStudent")
public class GetStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	response.setContentType("text/html");
	
	String reg_id=request.getParameter("reg");
	
	Connection con = null;
	boolean flag=false;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		Statement stmt = con.createStatement();
		stmt = con.createStatement();
		String sql = "select * from test.mess where reg_id='"+reg_id+"';";
		ResultSet rs=stmt.executeQuery(sql); 
		
		
		response.getWriter().println("<HTML><HEAD><TITLE>Total bill</TITLE></HEAD><BODY>");
		response.getWriter().println("<h1> Registration id : "+reg_id+"</h1>");
		response.getWriter().println("<center><table  > <th><td>Ammount</td><td>Date</td></th>");
		while(rs.next())  
		{
			response.getWriter().println("<tr><td> "+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td></tr>");
		}
		String sql1 = "SELECT sum(total_amt) FROM test.mess where reg_id ='"+reg_id+"';";
		 rs=stmt.executeQuery(sql1);
			response.getWriter().println("</table></center>");
		if(rs.next())  
		{
			response.getWriter().println("<h2>Total ammount : "+rs.getString(1)+"</h2>");
		}
		
		response.getWriter().println("</BODY></HTML>");
		con.close();
	} catch (Exception e) {
		e.printStackTrace();
	}

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
