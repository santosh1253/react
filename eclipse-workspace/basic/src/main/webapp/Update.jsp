<Html>  
<head>   
<title>  Update your details 
</title>  
</head>  
<body bgcolor="Lightskyblue">  
<br>  
<br>  
<form action="Connect.jsp" method="post">
    <label> Enter Username: </label>         
	<input type="text" name="uname" size="15"/> <br> <br>   
	<label> Enter Password: </label>         
	<input type="text" name="password" size="15"/> <br> <br> 
	<label> Firstname: </label>         
	<input type="text" name="firstname" size="15"/> <br> <br>   
	<label> Lastname: </label>         
	<input type="text" name="lastname" size="15"/> <br> <br> 
	<label> Age: </label>         
	<input type="text" name="age" size="15"/> <br> <br><br>
    Enter Weight:<input type="text" name="w" size="15"/> <br> <br>  
	<label>   
	Blood Group :  
	</label>   
	<select name="bloodgroup">  
	<option value="o+">o+</option>  
	<option value="o-">o-</option>  
	<option value="A+">A+</option>  
	<option value="A-">A-</option>  
	<option value="B+">B+</option>  
	<option value="B-">B-</option>  
	<option value="AB-">AB-</option>  
	<option value="AB+">AB+</option>  
	</select>  
	<br>  
	<br>  
	<label>   
	Gender :  
	</label><br>  
	<input type="radio" name="gender" value="male"/> Male <br>  
	<input type="radio" name="gender" value="female"/> Female <br>  
	<input type="radio" name="gender" value="other"/> Other  
	<br>  
	<br>  
	  
	<label>   
	Phone :  
	</label>  
	<input type="text" name="country code"  value="+91" size="2"/>   
	<input type="text" name="phone" size="10"/> <br> <br>  
	Address  
	<input type="text" name="address"><br>
	<br>
	Email:  
	<input type="email" id="email" name="email"/> <br>    
	</br>
	Donated Blood Recently(Below 7 months span):<br>
	<input type="radio" name="blood" value="YES"/> YES<br>  
	<input type="radio" name="blood" value="NO"/> NO <br> <br>
	</br>
	<input type="submit" value="Submit">  
</form>  
</body>  
</html>  