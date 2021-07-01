<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>customer page</title>

<style>
.error{color:red}
</style>
</head>
<body>
<i>Fill out form Astrick(*) means required.</i>
<form:form action="processForm" modelAttribute="customer">
First Name: <form:input path="firstName" />
<br><br>
Last Name (*): <form:input path="lastName"/>
<form:errors path="lastname" cssClass="error"/>
<br><br>
<input type="submit" value="submit" />

</form:form>
</body>
</html>