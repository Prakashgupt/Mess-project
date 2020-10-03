package com.ser;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mess.dto.MessBill;
import com.mess.dto.StudentDTO;

/**
 * Servlet implementation class Calc
 */
@WebServlet("/Calc")
public class Calc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
		StudentDTO sd=(StudentDTO) request.getSession().getAttribute("studentdto");
		
		response.setContentType("text/html");
		int eggQuntity=Integer.parseInt(request.getParameter("egg_quntity"));
		int chickenQuntity=Integer.parseInt(request.getParameter("chicken_quntity"));
		 System.out.println("hello"+sd.getRegId());
		int total= ((6*eggQuntity)+(30*chickenQuntity)+100);
		
		MessBill.saveBill(sd.getRegId(), total);
		
		String bill=MessBill.tatolBill(sd.getRegId());
		response.getWriter().println("<HTML><HEAD><TITLE>Total bill</TITLE></HEAD><BODY>");
		response.getWriter().write("<h2>your order of ammount "+total+"has been placed<h2>");
		response.getWriter().println("</BODY></HTML>");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
