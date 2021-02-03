<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Page</title>
</head>
<body>

<%

String id = (String)session.getAttribute("empid");

if (id != null) {
	
	%>
	

	<a href="logout.jsp"> Log Out </a>
	
	<%
}

response.sendRedirect("loginform.html");


%>

</body>
</html>