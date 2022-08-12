package com.display;
import com.service.TeacherService;
import com.dao.TeacherDao;
import com.bean.Teacher;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

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
public class DisplayTeacher extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayTeacher() {
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
		TeacherService ps = new TeacherService();
		TeacherDao pd = new TeacherDao();
		List<Teacher> listOfTeacher = ps.findAllTeacher();
		HttpSession hs  = request.getSession();
		
						hs.setAttribute("obj", listOfTeacher);
		
		pw.println("<h2><center>Teacher List</center></h2>");
		pw.println("<table border=1>");
		
		pw.println("<tr> <th>Teacher Id</th>  <th>Teacher Name</th>  <th>Age</th>  </tr>");
		
		Iterator<Teacher> li = listOfTeacher.iterator();
		while(li.hasNext()) {
			Teacher p = li.next();
			pw.println("<tr><td>"+p.getTeacherId()+"</td><td>"+p.getTeacherName()+"</td><td>"+p.getAge()+"</td></tr>");
		}
		
		pw.println("</table>");
		pw.println("<br/>");
		pw.println("<a href='Home.jsp'><h2>Back to Main Page</h2> </a>"); 
	 
	} 
 

	}


