<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Profile</title>
</head>
<body>

<%

try{
	
	//String id = (String)session.getAttribute("empid");
	
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "catalyst1006");
	
	PreparedStatement ps = conn.prepareStatement("select ems_details.empid, ems_details.address, ems_details.education, ems_details.mobile, ems_details.deptno, ems_details.manager_id, ems_login.user, ems_login.pass, ems_login.email, leave_table.leaveid, leave_table.applydate, leave_table.reasons, leave_table.resumedate FROM ems_details, ems_login, leave_table WHERE ems_details.empid = leave_table.empid ORDER BY ems_details.empid");

	
	//ps.setString(1,);
	ResultSet rs = ps.executeQuery();
	
	while(rs.next()) {
		
		
		out.println("<h2> EMPLOYEE PROFILE </h2>");
		
//out.println("<table> <tr><th> EMPLOYEE ID </th><th> ADDRESS </th><th> ADDRESS </th><th> EDUCATION </th><th> MOBILE </th><th> DEPT ID </th><th> MANAGER ID </th><th> LEAVE ID </th><th> APPLY DATE </th><th> RESUME DATE </th></tr> <tr><td>  </td></tr>  </table>");
		
		out.println("EMPLOYEE ID : " + " " + rs.getString("empid") + "<br/>" + "<br/>");
		
		out.println("ADDRESS : " + " " + rs.getString("address") + "<br/>" + "<br/>");
		
		out.println("EDUCATION : " + " " + rs.getString("education") + "<br/>" + "<br/>");
		
		out.println("MOBILE : " + " " + rs.getString("mobile") + "<br/>" + "<br/>");
		
		out.println("DEPT ID : " + " " + rs.getString("deptno") + "<br/>" + "<br/>");
		
		out.println("MANAGER ID : " + " " + rs.getString("manager_id") + "<br/>" + "<br/>");
		
		out.println("USER NAME : " + " " + rs.getString("user") + "<br/>" + "<br/>");
		
		out.println("PASSWORD : " + " " + rs.getString("pass") + "<br/>" + "<br/>");
		
		out.println("EMAIL : " + " " + rs.getString("email") + "<br/>" + "<br/>");
		
		out.println("LEAVE ID : " + " " + rs.getString("leaveid") + "<br/>" + "<br/>");
		
		out.println("APPLY DATE : " + " " + rs.getString("applydate") + "<br/>" + "<br/>");
		
		out.println("REASONS : " + " " + rs.getString("reasons") + "<br/>" + "<br/>");
		
		out.println("RESUME DATE : " + " " + rs.getString("resumedate"));
		
		
	}
	

}

catch (Exception e) {

	out.println(e.getMessage());
}

%>

<br/> <br/>
<a href="userpage1.jsp"> Return to UserPage </a>

</body>
</html>