package com.ser;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mess.bean.Student;
import com.mess.dto.DBCon;
import com.mess.dto.StudentDTO;

/**
 * Servlet implementation class Signup
 */
@WebServlet("/mySign")
public class Signup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Signup() {
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
		
		Student s= new Student();
		
		s.setRegId(request.getParameter("regid"));
	    s.setStdNm(request.getParameter("fname"));
		s.setRollNo(Integer.parseInt(request.getParameter("rollno")));
		s.setEmail(request.getParameter("email"));
		s.setMessName(request.getParameter("messname"));
		s.setPassword(request.getParameter("password"));
		s.setGender(request.getParameter("gender"));
		
		
		
		
		
		
		
		
	    PrintWriter pw = response.getWriter(); 
	   
	    if(!s.getStdNm().isEmpty() && !s.getRegId().isEmpty()) {
	    	 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
	    	   LocalDateTime now = LocalDateTime.now();  
	    	   s.setDate(now.toString());
	    	   
	     	DBCon.insertStudent(s);
	     	response.sendRedirect("/Mess/index.jsp");
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
