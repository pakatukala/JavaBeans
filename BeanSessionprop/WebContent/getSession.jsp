<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Get Session</title>
</head>
<body>
<jsp:useBean id="app" class = "org.study.com.User" scope = "session"></jsp:useBean>
<jsp:setProperty property="*" name="app"/>
FirstName : <jsp:getProperty property="firstName" name="app"/><br/>
LastName : <jsp:getProperty property="lastName" name="app"/>
</body>
</html>