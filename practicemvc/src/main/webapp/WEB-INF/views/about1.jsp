<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.time.LocalDateTime" %>
    <%@ page import ="java.util.List" %>
    <%@page isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>About1 page</title>
</head>
<body>
<h1>Name is <%-- <%=name %> --%>${name }</h1>
<h1>id is <%-- <%=id %> --%>${id}</h1>
<h1>time is <%-- <%=id %> --%>${time}</h1>
<c:forEach var="item" items="${mark }">
<h1>${item}</h1>
</c:forEach>
</body>
</html>