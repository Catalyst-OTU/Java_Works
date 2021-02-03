<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.formtable{
		padding: 10px;
		border: 1px solid black;
		width: 300px
	}
input[type=text]{
width: 250px;
}
.label{
	text-align:right;
	vertical-align:top;
}
.control-form{
	margin-left: 10px;
}
h2{text-align: center;}
</style>

<meta charset="ISO-8859-1">
<title>Add New Student</title>
</head>
<body>
<h2>ADD NEW STUDENT</h2> <br/> <br/>

<form action="home" method="post">
	
<input type="hidden" name="from" value="addRecord" />

<table class="formtable">
	
<tbody>
	<tr>
		<td class="label"> <label> FIRST NAME </label> </td>
		<td> <input class="control-form" type="text" name="firstName" placeholder="Enter FirstName" required/> </td>
	</tr>
	
	<tr>
		<td class="label"> <label> LAST NAME </label> </td>
		<td> <input class="control-form" type="text" name="lastName" placeholder="Enter LastName" required/> </td>
	</tr>
	
	<tr>
		<td class="label"> <label> EMAIL </label> </td>
		<td> <input class="control-form" type="email" name="email" placeholder="Enter Email" required/> </td>
	</tr>
	
	<tr>
		<td> <label></label> </td>
		<td> <input type="submit" value="Submit" /> </td>
	</tr>

</tbody>	
</table>

</form>

<a href="index.jsp"> Return Home </a>

</body>
</html>