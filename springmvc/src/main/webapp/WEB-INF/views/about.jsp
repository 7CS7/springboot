<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>About page</title>
</head>
<body>
<h1>Hello welcome to the about page</h1>
<% String city=(String)request.getAttribute("city");
List<String> marks=(List<String>)request.getAttribute("mark");
%>
<h1>city is <%=city %></h1>
<h1><% for (String i:marks)
out.println(i);%></h1>
</body>
</html>