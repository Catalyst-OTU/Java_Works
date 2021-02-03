<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>confirmation</title>
</head>
<body>

	<%
	
	String u = request.getParameter("user");
	String p = request.getParameter("pass");
	
	if (u.equals("admin") && p.equals("admin")) {
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("userpage.jsp");
		dispatcher.forward(request, response);
	}
	else
	{
		
		response.sendRedirect("logonform.jsp");
	}
	
	
	
	
	%>

</body>
</html>