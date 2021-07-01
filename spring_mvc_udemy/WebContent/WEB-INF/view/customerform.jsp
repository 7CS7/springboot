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
<form:form action="process" modelAttribute="customer">
First Name: <form:input path="firstName" />
<br><br>
Last Name (*): <form:input path="lastName"/>
<form:errors path="lastName" cssClass="error"/>
<br><br>
Free Passes: <form:input path="freePass"/>
<form:errors path="freePass" cssError="error"/>
<br><br>
Postal Code:<form:input path="postalCode"/>
<form:errors path="postalCode" cssError="error"/>
<br><br>
<input type="submit" value="submit" />

</form:form>
</body>
</html>