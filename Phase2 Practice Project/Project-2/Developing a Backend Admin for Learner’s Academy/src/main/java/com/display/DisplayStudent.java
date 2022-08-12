package com.display;
import com.service.StudentService;
import com.dao.StudentDao;
import com.bean.Student;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class viewStud
 */
public class DisplayStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		StudentService ps = new StudentService();
		StudentDao pd = new StudentDao();
		List<Student> listOfStudent = ps.findAllStudent();
		HttpSession hs  = request.getSession();
		
						hs.setAttribute("obj", listOfStudent);
		
		pw.println("<h2><center>Student List</center></h2>");
		pw.println("<table border=1>");
		
		pw.println("<tr> <th>Student Id</th>  <th>Student Name</th>  <th>Age</th>  </tr>");
		
		Iterator<Student> li = listOfStudent.iterator();
		while(li.hasNext()) {
			Student p = li.next();
			pw.println("<tr><td>"+p.getStudentId()+"</td><td>"+p.getStudentName()+"</td><td>"+p.getAge()+"</td></tr>");
		}
		
		pw.println("</table>");
		pw.println("<br/>");
		pw.println("<a href='Home.jsp'><h2>Back to Main Page</h2> </a>"); 
	 
	} 
 

	}


