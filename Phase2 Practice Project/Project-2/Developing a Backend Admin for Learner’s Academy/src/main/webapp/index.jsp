<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<h1><center>Developing a Backend Admin for Learner Academy</center></h1>
<br/>
<hr>
<h3><center>Login Page</center></h3>
<center><form action="LoginController" method="post">
<label>EmailId</label>
<input type="email" name="email"><br/>
<label>Password</label>
<input type="password" name="password"><br/>
<input type="submit" value="submit">
<input type="reset" value="reset">
</form></center>
</body>
</html>