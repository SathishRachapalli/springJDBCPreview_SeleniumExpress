
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  


<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Student</title>
</head>
<body>

<div align="center">
<h3>Add Student</h3>
<!--  creating html form to fill up the new student details -->

<form:form action="save-student" modelAttribute="student" method="POST">

			<label>Name : </label>
			<form:input path="name"/>
			<br/>

			<label>Mobile : </label>
			<form:input path="mobile"/>
			<br/>

			<label>Country : </label>
			<form:input path="country"/>
			<br/>

			<input type="submit" value="Submit">

</form:form>

</div>


</body>
</html>