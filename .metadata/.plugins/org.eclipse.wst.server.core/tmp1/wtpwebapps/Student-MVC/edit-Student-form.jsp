<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>


	    <style>
        .conatiners{
                  margin-left: 500px; 
                  margin-top: 10x;
                  background-color: aqua;
                  border-radius: 20px;
                  width: 300px;
                  padding: 30px;
                }
                h2{color: blue; text-align: center; cursor: pointer;}
                h2:hover{color: black;}
    </style>

<meta charset="ISO-8859-1">
<title>Edit Student</title>
</head>
<body>

<div class="conatiners">

<h2>EDIT STUDENT</h2>
 <hr>
 <br/> <br/>

<form action="home" method="post">
	
<input type="hidden" name="from" value="editStudent" />
<input type="hidden" name="student_id" value="${param.student_id}" />

<table class="formtable">
	
<tbody>
	<tr>
		<td class="label"> <label> FIRST NAME </label> </td>
		<td> <input class="control-form" type="text" name="firstName" value="${param.firstName}" placeholder="Enter FirstName" required/> </td>
	</tr>
	
	<tr>
		<td class="label"> <label> LAST NAME </label> </td>
		<td> <input class="control-form" type="text" name="lastName" value="${param.lastName}" placeholder="Enter LastName" required/> </td>
	</tr>
	
	<tr>
		<td class="label"> <label> EMAIL </label> </td>
		<td> <input class="control-form" type="email" name="email" value="${param.email}" placeholder="Enter Email" required/> </td>
	</tr>
	
	<tr>
		<td> <label></label> </td>
		<td> <input type="submit" value="Submit" /> </td>
	</tr>

</tbody>	
</table>

</form>

<a href="index.jsp"> Return Home </a>

</div>
</body>
</html>