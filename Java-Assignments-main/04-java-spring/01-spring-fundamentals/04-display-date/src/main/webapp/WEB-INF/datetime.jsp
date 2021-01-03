<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Date and Time</title>
<link rel="stylesheet" href="css/main.css" />
</head>
<body onload="alertPage('<c:out value="${dt}"/>')">
<h1 class = <c:out value="${ dt }"/>></h1>
<h1 id = <c:out value="${ dt }"/>><c:out value="${ dtFormat }"/></h1>
<script defer type="text/javascript" src="js/main.js"></script>
</body>
</html>