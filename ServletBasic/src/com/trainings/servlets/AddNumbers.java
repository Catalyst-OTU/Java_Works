package com.trainings.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddNumbers
 */
@WebServlet("/AddNumbers")
public class AddNumbers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddNumbers() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		out.println("<html> <body>");
		
	
		if(request.getParameter("firstNumber") != null && request.getParameter("secondNumber") != null) {
			
		int firstNumber = Integer.parseInt(request.getParameter("firstNumber"));
		
		int secondNumber = Integer.parseInt(request.getParameter("secondNumber"));
		

		out.println("Your Results is :" + (firstNumber + secondNumber));
		
		out.println("</body> </html>");
		
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
