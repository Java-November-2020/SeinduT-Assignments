<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo Survey</title>
</head>
<body>
<form action="/results" method="POST">
	Your Name: <input type="text" name="name">
	<br>
	Dojo Location:
	<select name="dojoLocation">
		<option value=""> </option>
		<option value="San Jose">San Jose, CA</option>
		<option value="Seattle">Seattle, WA</option>
		<option value="online">Online</option>
	</select>
	<br>
	Favorite Language:
	<select name="favoriteLanguage">
		<option value=""> </option>
		<option value="Java">Java</option>
		<option value="Python">Python</option>
		<option value="HTML">HTML</option>
	</select>
	<br>
	Comment (optional):
	<br>
	<textarea name="comment" id="comment"></textarea>
	<a href="/results"><button>Submit</button></a>
</form>
</body>
</html>