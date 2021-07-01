<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmation</title>
</head>
<body>
The Customer is confirmed:${customer.firstName} ${customer.lastName} 
<br><br>
Free Pass:${customer.freePass} 
<br><br>
Postal code:${custemer.postalCode}
</body>
</html>