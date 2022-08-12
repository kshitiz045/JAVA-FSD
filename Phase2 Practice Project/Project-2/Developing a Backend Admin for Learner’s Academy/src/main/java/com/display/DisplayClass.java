package com.display;
import com.service.ClassService;
//import com.dao.ClassDao;

import com.bean.Class;
import java.io.IOException;
import java.io.PrintWriter;

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
public class DisplayClass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayClass() {
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
		ClassService ps = new ClassService();
//		ClassDao pd = new ClassDao();
		List<Class> listOfClass = ps.findAllClass();
		HttpSession hs  = request.getSession();
		
						hs.setAttribute("obj", listOfClass);
		
		pw.println("<h2><center>Class List</center></h2>");
		pw.println("<br/>");
		
		pw.println("<table border=1>");
	
		pw.println("<tr> <th>Class Id</th>  <th>Section</th>  <th>Subject</th>  <th>Teacher</th>  </tr>");
		
		Iterator<Class> li = listOfClass.iterator();
		while(li.hasNext()) {
			Class p = li.next();
			pw.println("<tr><td>"+p.getClassId()+"</td><td>"+p.getSection()+"</td><td>"+p.getSubject()+"</td><td>"+p.getTeacher()+"</td></tr>");
		}
		
		pw.println("</table>");
		pw.println("<br/>");
		
		pw.println("<a href='Home.jsp'><h2>Back to Main Page </h2></a>"); 
	 
	} 
 

	}


