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

String leaveid = request.getParameter("leaveid");
String empid = request.getParameter("empid");
String applydate = request.getParameter("applydate");
String reason = request.getParameter("reason");
String resumedate = request.getParameter("resumedate");


try {
	
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "catalyst1006");
	
	PreparedStatement ps = conn.prepareStatement("insert into leave_table values (?,?,?,?,?)");
	ps.setString(1, leaveid);
	ps.setString(2, empid);
	ps.setString(3, applydate);
	ps.setString(4, reason);
	ps.setString(5, resumedate);
	ps.execute();


	response.sendRedirect("userpage1.jsp");

} catch (Exception e) {

	out.println(e.getMessage());
}



%>

</body>
</html>