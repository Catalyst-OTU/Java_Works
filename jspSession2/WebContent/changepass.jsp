<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
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
	String empid = (String) session.getAttribute("empid");
	String pass = request.getParameter("pass");
	String cpass = request.getParameter("cpass");

	try {

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "catalyst1006");
		if (pass.equals(cpass)) {
			PreparedStatement ps = conn.prepareStatement("update ems_login set pass = ? where empid = ?");
			ps.setString(1, pass);
			ps.setString(2, empid);
			ps.execute();

			response.sendRedirect("userpage1.jsp");

		} else {

			out.println("New Password and Confirm Password does match!");
		}

	} catch (Exception e) {

		out.println(e.getMessage());
	}
	%>

</body>
</html>