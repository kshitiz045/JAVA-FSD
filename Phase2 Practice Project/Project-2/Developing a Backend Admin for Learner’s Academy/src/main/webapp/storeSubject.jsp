<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Add Subject Details</h2>
<form action="SubjectController" method="post">
<label>Subject Id</label>
<input type="number" name="suid"><br/>
<label>Subject Name</label>
<input type="text" name="suname"><br/>
<label>Subject Code</label>
<input type="text" name="code"><br/>
<input type="submit" value="submit">
<input type="reset" value="reset">
</form>
<br/>
<a href="Home.jsp">Back to Main Page</a>
</body>
</html>