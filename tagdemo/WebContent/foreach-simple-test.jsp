<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	String[] cities = {"Accra", "Kumasi", "Wa", "Ho", "Koforidua" };
	pageContext.setAttribute("mycities", cities);
	%>
	
	<c:forEach var = "tempCities" items = "${mycities }">
	
	${tempCities }
	
	<br/>
	
	</c:forEach>

</body>
</html>