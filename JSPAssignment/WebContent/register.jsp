<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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

        <h2>STUDENT REGISTRATION</h2>
        <hr>
       
    
    <form action="info.jsp" method="post">

		<table>
			<tr>
				<td>USERNAME :</td>
				<td><input type="text" name="username" class="form-control" placeholder="Enter your name" required></td>
			</tr>

			<tr>
				<td>EMAIL :</td>
				<td><input type="email" name="email" class="form-control" placeholder="Enter your email" required></td>
			</tr>

			<tr>
				<td>PHONE :</td>
				<td><input type="number" name="phone" class="form-control" placeholder="Enter your phone" required></td>
			</tr>

			<tr>
				<td>ADDRESS :</td>
				<td><input type="text" name="address" class="form-control" placeholder="Enter your address" required></td>
			</tr>

			<tr>
				<td>GENDER</td>
				<td><input type="radio" name="gender" value="Male"> Male
					 <input type="radio" name="gender" value="Female"> Female
			    </td>
			</tr>

			<tr>
				<td> EDUCATION </td>
				<td>
					<select name="education" class="form-control" required>
                    <option value="">Select One</option>
					<option value="SHS"> SHS </option>
					<option value="DIPLOMA"> DIPLOMA </option>
					<option value="DEGREE"> DEGREE </option>
					<option value="MASTERS"> MASTERS </option>
		            </select>
		        </td>
			</tr>
			
			<tr>
			
				<td> PASSWORD :</td>
				<td><input type="password" name="password" class="form-control" placeholder="Enter your password" required></td>
			</tr>

			<tr>
				<td> CONFIRM PASSWORD :</td>
				<td><input type="password" name="conpassword" class="form-control" placeholder="Confirm password" required></td>
            </tr>

            <tr>
               <th> <input type="checkbox" name="i_agree" value="i_agree" required> I Agree</th>
            </tr>
            
            <tr class="text-right">
                <td> <input type="submit" class="btn btn-primary" value="Submit"> </td>
                <td> <input type="reset" class="btn btn-danger" value="Reset"> </td>
            </tr>


            
			
		

		</table>


    </form>
    
</div>

</body>
</html>