<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>java</title>
    <style type="text/css">
    		nav{text-align:center;background-color:aqua;}
    		nav ul{display:inline-flex;}
    		nav ul li{list-style:none;padding:20px;}
    		.home, nav ul li:hover{background-color:white;border-radius:5px;cursor:pointer;}
    </style>
</head>
<body>

<h1 style="color: white;text-align:center;background-color:blue;">WELCOME TO JAVA EE WEBSITE</h1>
<nav>
     <ul>
     	<li class="home"> HOME </li>
     	<li> SERVICES </li>
     	<li> CONTACT </li>
     	<li> ABOUT </li>
     </ul>
</nav>
 
Time on the Server is <%= new java.util.Date() %>

</body>
</html>