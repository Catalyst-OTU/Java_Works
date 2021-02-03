<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



	<%
	
	String pass = request.getParameter("password");
	
	String con_pass = request.getParameter("conpassword");
	
	String email = request.getParameter("email");
	
	if (email.equals("admin@aiti-kace.com.gh")) {
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("output.jsp");
		dispatcher.forward(request, response);
	}
	
	else if(pass != con_pass) {
		
		out.println("Your Password does match!");
	}
	else
	{
		
		out.println("Wrong Data");
	}
	
	
	
	
	%>

</body>
</html>