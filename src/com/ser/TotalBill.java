package com.ser;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mess.dto.MessBill;
import com.mess.dto.StudentDTO;

/**
 * Servlet implementation class TotalBill
 */
@WebServlet("/TotalBill")
public class TotalBill extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TotalBill() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	int total=0;
	
    StudentDTO sd=(StudentDTO) request.getSession().getAttribute("studentdto");
		
		response.setContentType("text/html");
	
       MessBill.saveBill(sd.getRegId(), total);
		
		String bill=MessBill.tatolBill(sd.getRegId());
		
		response.getWriter().write("<h2>your total bill is "+bill+"Rs <h2>");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
