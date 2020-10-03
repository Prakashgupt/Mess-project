package com.ser;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mess.dto.DBCon;
import com.mess.dto.StudentDTO;
import com.mysql.cj.Session;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());

		response.setContentType("text/html");

		PrintWriter pw = null;
		pw = response.getWriter();
		StudentDTO sd = new StudentDTO();
		sd.setRegId(request.getParameter("Registration"));
		sd.setPassword(request.getParameter("password"));
		String selection = request.getParameter("op");
		// sd.setRegId("hariii");
		// sd.setPassword("pass");

		HttpSession session = request.getSession();
		session.setAttribute("studentdto", sd);

		if (selection.equalsIgnoreCase("vendor")) {

			if (sd.getRegId().equals("vendor001") && sd.getPassword().equals("vendor001")) {
				response.sendRedirect("vender.html");
			} else {
				response.sendRedirect("error.html");
			}

		} else {
			if (DBCon.varifyLogin(sd)) {
				response.sendRedirect("dash.html");
			} else {
				response.sendRedirect("error.html");
			}

		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
