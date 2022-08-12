package com.display;
import com.service.SubjectService;
import com.dao.SubjectDao;
import com.bean.Subject;
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
public class DisplaySubject extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplaySubject() {
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
		SubjectService ps = new SubjectService();
		SubjectDao pd = new SubjectDao();
		List<Subject> listOfSubject = ps.findAllSubject();
		HttpSession hs  = request.getSession();
		
						hs.setAttribute("obj", listOfSubject);
		
		pw.println("<h2><center>Subject List</center></h2>");
		pw.println("<table border=1>");
		
		pw.println("<tr> <th>Subject Id</th>  <th>Subject Name</th>  <th>Subject Code</th>  </tr>");
		
		Iterator<Subject> li = listOfSubject.iterator();
		while(li.hasNext()) {
			Subject p = li.next();
			pw.println("<tr><td>"+p.getSubjectId()+"</td><td>"+p.getSubjectName()+"</td><td>"+p.getSubjectCode()+"</td></tr>");
		}
		
		pw.println("</table>");
		pw.println("<br/>");
		pw.println("<a href='Home.jsp'><h2>Back to Main Page</h2> </a>"); 
	 
	} 
 

	}


