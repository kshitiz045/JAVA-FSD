<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Add teacher Details</h2>
<form action="TeacherController" method="post">
<label>Teacher Id</label>
<input type="number" name="tid"><br/>
<label>Teacher Name</label>
<input type="text" name="tname"><br/>
<label>Age</label>
<input type="number" name="age"><br/>
<input type="submit" value="submit">
<input type="reset" value="reset">
</form>
<br/>
<a href="Home.jsp">Back to Main Page</a>
</body>
</html>