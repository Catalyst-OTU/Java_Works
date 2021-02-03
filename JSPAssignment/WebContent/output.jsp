<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="bootstrap.css">
</head>
<body>


<br/><br/>

<h1 class="text-center text-danger">WELCOME TO THE ADMIN PAGE</h1>

<table class="table table-stripped table-bordered table-hover">


<tr class="bg-primary text-light">
<th> USERNAME </th>
<th> EMAIL </th>
<th> PHONE </th>
<th> ADDRESS </th>
<th> GENDER </th>
<th> EDUCATION </th>
<th> PASSWORD </th>
<th> CONFIRM PASSWORD </th>
</tr>


<tr>

<td> ${param.username} </td>
<td> ${param.email} </td>
<td> ${param.phone} </td>
<td> ${param.address} </td>
<td> <%= request.getParameter("gender") %> </td>
<td> <%= request.getParameter("education") %> </td>
<td> ${param.password} </td>
<td> ${param.conpassword} </td>
</tr>



</table>


</body>
</html>