<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



Name: ${param.name} <br/>

Gender: <%= request.getParameter("gender") %> <br/>

Language Known: 

<ul>
<%

		

	String [] lang = request.getParameterValues("language");

			if(lang != null){
				
				// FOR LOOP
				//for(int i = 0; i < lang.length; i++)
					
				//FOR EACH LOOP
				for(String temp:lang)
				{
					
					//out.println("<br/>");
					out.println("<li>" + temp + "</li>");
					//out.println(lang[i]);
				}
			}
			else{
				out.println("No Language selected");
			}
	
	  %> 
	  
	  </ul>
	  <br>

Country: ${param.country}








</body>
</html>