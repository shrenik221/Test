<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
	<form action="/add" method="post" modelAttribute="Student">
		<table>
			<tr>
				<td><input type="text" name="id" placeholder="Enter your ID"/></td>
			</tr>
			<tr>
				<td><input type="text" name="name" placeholder="Name"/></td>
			</tr>
			<tr>
				<td><input type="text" name="password" placeholder="password"/></td>
			</tr>
			<tr>
				<td><input type="submit" id="submit" value="Register"/></td>
			</tr>
		</table>
		</form>
</body>
</html>