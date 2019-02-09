<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL</title>
</head>
<body>
<c:set var="name" value ="C=Pavan"></c:set>
<c:out value="name"></c:out>
<c:remove var="name"/>
</body>
</html>