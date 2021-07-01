<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.time.LocalDateTime" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>About page</title>
</head>
<body>
<%Integer age=(Integer)request.getAttribute("age");
LocalDateTime now=(LocalDateTime)request.getAttribute("time");
%>
<h1>Age of the Student is <%=age %></h1>
<h1> time is <%=now.toString() %></h1>
</body>
</html>