package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserLogin
 */
@WebServlet("/UserLogin")
public class UserLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();
		
		response.setContentType("text/html");
		// TODO Auto-generated method stub

		try {

			String userId = request.getParameter("userId");

			System.out.println(userId);
			String password = request.getParameter("password");
			System.out.println(password);

			String setUserId = "user@123";
			String setPassword = "user123";
			
           if (setUserId.equals(userId) && setPassword.equals(password)) {
				
				pw.println("<h2>Successful Login</h2>");
		        RequestDispatcher rd = request.getRequestDispatcher("Welcome.jsp");
				
				rd.forward(request, response);

			}
           else {
				pw.print("<h2>incorrect username password </h2>");
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
