<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<link rel="stylesheet" href="bootstrap.css">
	    <style>
        .conatiners{
                  margin-left: 420px; 
                  margin-top: 10x;
                  background-color: aqua;
                  border-radius: 20px;
                  width: 470px;
                  padding: 30px;
                }
                h1:hover{color: red; cursor: pointer;}
                h1{color: orange; background-color: }
                h2{color: blue; text-align: center; cursor: pointer;}
                h2:hover{color: black;}
    </style>
    
</head>
<body>

		<h1 class="text-center">WELCOME TO AITI-KACE JAVA ENTERPRISE REGISTRATION WEBSITE</h1>

    <div class="conatiners">

        <h2>USER REGISTRATION</h2>
        <hr>
       
    
    <form action="register.jsp" method="post">

		<table>
			<tr>
				<td> EMPLOYEE ID :</td>
				<td><input type="text" name="empid" class="form-control" placeholder="Enter employee id" required></td>
			</tr>
			
			<tr>
				<td> MANAGER ID :</td>
				<td><input type="text" name="managerid" class="form-control" placeholder="Enter manager id" required></td>
			</tr>
			
			<tr>
				<td>DEPT NO :</td>
				<td><input type="text" name="deptid" class="form-control" placeholder="Enter dept no" required></td>
			</tr>
			
			<tr>
				<td> USERNAME :</td>
				<td><input type="text" name="user" class="form-control" placeholder="Enter username" required></td>
			</tr>

			<tr>
				<td> EMAIL :</td>
				<td><input type="email" name="email" class="form-control" placeholder="Enter email" required></td>
			</tr>

			<tr>
				<td>MOBILE :</td>
				<td><input type="number" name="mobile" class="form-control" placeholder="Enter your phone" required></td>
			</tr>

			<tr>
				<td> ADDRESS :</td>
				<td><input type="text" name="address" class="form-control" placeholder="Enter address" required></td>
			</tr>
			
			<tr>
				<td> EDUCATION :</td>
				<td><input type="text" name="education" class="form-control" placeholder="Enter your education" required></td>
			</tr>
			
			<tr>
				<td>PASSWORD :</td>
				<td><input type="password" name="pass" class="form-control" placeholder="Enter password" required></td>
			</tr>

            <tr>
               <th> <input type="checkbox" name="i_agree" value="i_agree" required> I Agree</th>
            </tr>
            
            <tr class="text-right">
                <td> <input type="submit" class="btn btn-primary" value="Submit"> </td>
                <td> <input type="reset" class="btn btn-danger" value="Reset"> </td>
            </tr>
            
            
            
            <tr>
            	
              <td> <p class="text-center">Already have an Account? <a href="loginform.html">Login</a></p> </td>
            </tr>


            

		

		</table>


    </form>
    
</div>

</body>
</html>