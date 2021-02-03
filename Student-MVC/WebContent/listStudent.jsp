<%@page import="com.aiti.entities.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Student</title>
<link type="text/css" rel="stylesheet" href="css/main.css">
</head>

<%
List<Student> theStudent = (List<Student>)request.getAttribute("list_student");

%>


<body>

<div>

<h2>STUDENT LIST</h2>

<br/> <br/>


<input type="button" value="Add Student" onclick="window.location.href='addStudent-form.jsp'; return false "/>



<table class="table table-stripped table-bordered table-hover">
	<thead class="bg-primary">
		<tr>
			<th>STUDENT ID</th>
			<th>FIRST NAME</th>
			<th>LAST NAME</th>
			<th>EMAIL</th>
			<th> ACTION </th>
		</tr>
	</thead>
	
	<tbody>
	
	
	<c:forEach items="${ list_student }" var="list">
	<c:url value="home" var="updateURL">
	<c:param name="page" value="editStudent"></c:param>
	<c:param name="student_id" value="${list.student_id }"></c:param>
	<c:param name="firstName" value="${list.firstName }"></c:param>
	<c:param name="lastName" value="${list.lastName }"></c:param>
	<c:param name="email" value="${list.email }"></c:param>
	
	
	</c:url>
	
	<tr>
		<td> ${list.student_id } </td>
		<td> ${list.firstName } </td>
		<td> ${list.lastName } </td>
		<td> ${list.email } </td>
		<td><a href="${updateURL }">Edit</a></td>
	
	</tr>
	
	</c:forEach>
	
	</tbody>



</table>

<a href="index.jsp"> Return Home </a>


</div>

</body>
</html>