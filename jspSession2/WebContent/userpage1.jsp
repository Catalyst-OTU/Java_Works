<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Page</title>
			<style>
				a{text-decoration: none;}
			</style>
</head>
<body>


<%

String id = (String)session.getAttribute("empid");

if (id != null) {
	
	%>
	<h2>USER PROFILE</h2>
	
	<a href="viewprofile.jsp"> View Profile </a> <br/> <br/>
	<a href="change.html"> Change Password </a> <br/> <br/>
	<a href="applyleave.html"> Apply Leave </a> <br/> <br/>
	<a href="index.html"> Log Out </a>
	
	<%
}

else

response.sendRedirect("index.html");


%>


</body>
</html>