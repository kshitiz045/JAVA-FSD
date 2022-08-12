package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentClassController
 */
public class teacherstudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public teacherstudent() {
        super();
        // TODO Auto-generPrintated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		RequestDispatcher rd = request.getRequestDispatcher("teacher-student.jsp");
		String prod = request.getParameter("teacherstudent");
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "kilogram45");
			PreparedStatement stmt = con.prepareStatement("SELECT studentName from student");
//			stmt.setString(1, prod);
			ResultSet rs = stmt.executeQuery();
			out.println("<h1><center>Student's List<center></h1>");
			out.println("<hr>");
			
			while(rs.next()) {
				
				out.println(rs.getString("studentName")+"<br/>");
				
			}
			
		}
		catch(Exception e) {
			rd.include(request, response);
			out.println("<h3><center><span style = 'color:red;'>Invalid  ,Please Try Again !!!</span></center></h3>");
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
