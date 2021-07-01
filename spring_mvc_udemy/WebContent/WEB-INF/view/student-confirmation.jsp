<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Register</title>
</head>
<body>
The Student is Confirmed: ${student.firstName} ${student.lastName}
Country:${student.country}
Operating System:
<ul>
<c:forEach var="temp" items="${student.os }">
<li>${temp }</li>
</c:forEach>
</ul>
</body>
</html>