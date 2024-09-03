<%@page import="java.sql.*" %>
<html>
<head>
<meta charset="UTF-8">
<title>Search</title>
</head>
<body>
<form action=search.jsp>
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
	<input type=submit value="Search">
</form>
<h1>For Home click here</h1>
<a href="home.html">Home</a>
</body>
</html>

<%
    	String group=request.getParameter("bloodgroup");
        Class.forName("com.mysql.jdbc.Driver"); 
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","Guru@1253");
        PreparedStatement st = con.prepareStatement("select * from users where bloodgroup=? and Donated_recently='NO'");
        st.setString(1,group);
       ResultSet rs=st.executeQuery();%>
       <TABLE BORDER="1">
            <TR>
                <TH>UserID</TH>
                <TH>FirstName</TH>
                <TH>LastName</TH>
                <TH>Age</TH>
                <TH>weight</TH>
                <TH>BloodGroup</TH>
                <TH>Gender</TH>
                <TH>Contact</TH>
                <TH>Address</TH>
                <TH>Email</TH>
                <TH>Donated_Recently</TH>
            </TR>
            <% while(rs.next()){ %>
            <TR>
                <TD> <%= rs.getString("uid") %></td>
                <TD> <%= rs.getString("firstname") %></TD>
                <TD> <%= rs.getString("lastname") %></TD>
                <TD> <%= rs.getInt("age") %></TD>
                <TD> <%= rs.getInt("weight") %></TD>
                <TD> <%= rs.getString("bloodgroup") %></TD>
                <TD> <%= rs.getString("gender") %></TD>
                <TD> <%= rs.getString("contact") %></TD>
                <TD> <%= rs.getString("address") %></TD>
                <TD> <%= rs.getString("email") %></TD>
                <TD> <%= rs.getString("Donated_recently") %></TD>
            </TR>
            <% } %>
        </TABLE>