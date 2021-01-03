<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Results</title>
</head>
<body>
<h5>Submitted Info</h5>
<br>
<p>Name: <c:out value="${name}" /></p>
<p>Dojo Location: <c:out value="${dojolocation}" /></p>
<p>Favorite Language: <c:out value="${favoritelanguage}" /></p>
<p>Comment: <c:out value="${comment}" /></p>
<br>
<a href="/"><button>Go Back</button></a>
</body>
</html>