<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>This is Help Page</title>
</head>
<body>
<h1>Welcome to the Help page</h1>
<h1> My name is ${name }</h1>
<h1> Roll No is ${rollno }</h1>
<h1>time is ${time }</h1>
<c:forEach var="item" items="${m }">
<h1>${item }</h1>
</c:forEach>
</body>
</html>