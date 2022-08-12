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

import com.bean.Subject;
import com.service.SubjectService;
//import com.service.TeacherService;


/**
 * Servlet implementation class StudentController
 */
public class SubjectController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubjectController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		SubjectService ss = new SubjectService();
		List<Subject> listOfSubject= ss.findAllSubject();
		HttpSession hs = request.getSession();
		hs.setAttribute("listOfSubject", listOfSubject);
		response.setContentType("text/html");
		response.sendRedirect("DisplaySubject");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		int suid = Integer.parseInt(request.getParameter("suid"));
		String suname = request.getParameter("suname");
		String code = request.getParameter("code");
		
		Subject s = new Subject();
		s.setSubjectId(suid);
		s.setSubjectName(suname);
		s.setSubjectCode(code);
		SubjectService ss = new SubjectService();
		String result = ss.storeSubjectDetails(s);
		pw.print(result);
		RequestDispatcher rd = request.getRequestDispatcher("storeSubject.jsp");
		rd.include(request, response);
	}

}