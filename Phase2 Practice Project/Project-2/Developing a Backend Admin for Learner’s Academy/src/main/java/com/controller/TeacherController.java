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

import com.bean.Teacher;
import com.service.TeacherService;


/**
 * Servlet implementation class StudentController
 */
public class TeacherController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TeacherController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		TeacherService ss = new TeacherService();
		List<Teacher> listOfTeacher= ss.findAllTeacher();
		HttpSession hs = request.getSession();
		hs.setAttribute("listOfTeacher", listOfTeacher);
		response.setContentType("text/html");
		response.sendRedirect("DisplayTeacher");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		int tid = Integer.parseInt(request.getParameter("tid"));
		String tname = request.getParameter("tname");
		int age = Integer.parseInt(request.getParameter("age"));
		Teacher s = new Teacher();
		s.setTeacherId(tid);
		s.setTeacherName(tname);
		s.setAge(age);
		TeacherService ss = new TeacherService();
		String result = ss.storeTeacherDetails(s);
		pw.print(result);
		RequestDispatcher rd = request.getRequestDispatcher("storeTeacher.jsp");
		rd.include(request, response);
	}

}