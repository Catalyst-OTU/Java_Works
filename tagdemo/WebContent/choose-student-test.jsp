<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ page import="java.util.*,com.trainings.jsp.tagdemo.Student" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<%
List<Student> data = new ArrayList<>();
	data.add(new Student("Solomon", "Okyere", false));
	data.add(new Student("Bisamrk", "Otu", false));
	data.add(new Student("Eugene", "Asante", true));
	data.add(new Student("Akeem", "Amosu", false));
	data.add(new Student("Francis", "Annan", true));
	data.add(new Student("Oscar", "Opoku", true));

	pageContext.setAttribute("myStudent", data);
	
%>

<body >
<table border="1">
<tr>
		<th>First Name </th>
		<th>Last Name </th>
		<th>Fees Discount </th>

</tr>

<c:forEach var = "tempStudent" items = "${myStudent }">
<tr>
	<td>${tempStudent.firstName } </td>
	<td>${tempStudent.lastName } </td>
	<td>
	
<c:choose>

<c:when test="${tempStudent.feesDiscount}">
		Special Discount
</c:when>

<c:otherwise>
		No Discount
</c:otherwise>

</c:choose>
</td>

</tr>

</c:forEach>

</table>



</body>
</html>