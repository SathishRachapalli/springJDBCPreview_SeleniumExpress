

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>



<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Info</title>
</head>
<body>

<h1 align="center"> SELENIUM EXPRESS</h1>

<c:forEach var ="student" items="${students}"> 

	${student}
	<br/>
	
</c:forEach>

</body>
</html>