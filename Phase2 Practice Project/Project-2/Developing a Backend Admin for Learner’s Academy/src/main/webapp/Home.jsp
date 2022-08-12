<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<h1><center>Home Page</center></h1>
<hr>
<br/>
<h3>Assign Data into Tables</h3>
<a href="storeTeacher.jsp">Add Teacher Details</a><br/>
<a href="storeStudent.jsp">Add Student Details</a><br/>
<a href="storeSubject.jsp">Add Subject Details</a><br/>
<a href="storeClass.jsp">Add Class Details</a><br/>


<h3>Master List of all Tables [CLASS REPORT]</h3>
<a href="TeacherController">Teacher List</a><br/>
<a href="StudentController">Student List</a><br/>
<a href="ClassController">Class List</a><br/>
<a href="SubjectController">Subject List</a><br/>
<br/>
<h3> Check Assign teachers to a class for a subject</h3>
<a href="teacher-subject.jsp">Click Here</a>
<br/>
<h3> Check Assign students to a class for a teacher</h3>
<a href="teacher-student.jsp">Click Here</a>
</body>
</html>