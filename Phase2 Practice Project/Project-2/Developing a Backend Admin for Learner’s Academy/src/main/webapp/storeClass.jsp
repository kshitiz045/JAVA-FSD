<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2><center>Add class Details</center></center></h2>
<form action="ClassController" method="post">
<label>Class Id</label>
<input type="number" name="cid"><br/>
<label>Section</label>
<input type="text" name="section"><br/>
<label>Subject</label>
<input type="text" name="subject"><br/>
<label>Teacher </label>
<input type="text" name="teacher"><br/>
<input type="submit" value="submit">
<input type="reset" value="reset">
</form>
<br/>
<a href="Home.jsp">Back to Main Page</a>
</body>
</html>