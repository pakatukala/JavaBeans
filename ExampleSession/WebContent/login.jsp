<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<form action="<%= request.getContextPath() %>/UserSession" method = "post">
UserName : <input type = "text" name = "username">
Password : <input type = "password" name = "password">
<input type = "submit" value = "submit">
</form>
</body>
</html>