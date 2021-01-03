<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Secret Code</title>
</head>
<body>
<h4><c:out value="${errors}" /></h4>
<h1>What is The Code?</h1>
<form action="/code" method="POST">
	<input type="text" name="guess" placeholder="Enter the code."/>
	<button>Submit Code</button>
</form>
</body>
</html>