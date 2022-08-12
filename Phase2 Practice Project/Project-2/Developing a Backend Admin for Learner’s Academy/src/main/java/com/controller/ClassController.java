package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.Class;
import com.service.ClassService;
import com.service.TeacherService;


/**
 * Servlet implementation class StudentController
 */
public class ClassController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClassController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		ClassService ss = new ClassService();
		List<Class> listOfClass= ss.findAllClass();
		HttpSession hs = request.getSession();
		hs.setAttribute("listOfClass", listOfClass);
		response.setContentType("text/html");
		response.sendRedirect("DisplayClass");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		int cid = Integer.parseInt(request.getParameter("cid"));
		String section = request.getParameter("section");
		String subject = request.getParameter("subject");
		String teacher = request.getParameter("teacher");
		
		Class s = new Class();
		s.setClassId(cid);
		s.setSection(section);
		s.setSubject(subject);
		s.setTeacher(teacher);
		ClassService ss = new ClassService();
		String result = ss.storeClassDetails(s);
		pw.print(result);
		RequestDispatcher rd = request.getRequestDispatcher("storeClass.jsp");
		rd.include(request, response);
	}

}