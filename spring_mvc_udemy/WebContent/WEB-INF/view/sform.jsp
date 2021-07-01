<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>student</title>
</head>
<body>

<form:form action="process" modelAttribute="student">

First name: <form:input path="firstName"/>
<br><br>
Last Name: <form:input path="lastName"/>
<br><br>

 Country:
<form:select path="country">
<form:option value="USA" label="USA"/>
<form:option value="India" label="India" />
<form:option value="UK" label="UK" />
<form:option value="Canada" label="Canada" />
</form:select>
<br><br>
Favorite Language:
Java<form:radiobutton path="favlanguage" value="java"/>
C<form:radiobutton path="favlanguage" value="C"/>
Python<form:radiobutton path="favlanguage" value="Python"/>
<br><br>
<br><br>
Operating System:
Windows<form:checkbox path="os" value="windows"/>
Linux<form:checkbox path="os" value="Linux"/>
Mac<form:checkbox path="os" value="Mac"/>
<br><br>

<input type="submit" value="submit"/>
</form:form>
</body>
</html>