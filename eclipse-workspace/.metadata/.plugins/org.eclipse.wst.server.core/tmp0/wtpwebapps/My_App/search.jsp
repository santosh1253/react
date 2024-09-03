<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ page import="java.util.*" %>
<%@ page import="java.sql.*" %>
<%
String blood=request.getParameter("bgroup");
String location=request.getParameter("location");
String weight=request.getParameter("weight");
String age=request.getParameter("age");
Class.forName("com.mysql.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/seneca";
Connection c=DriverManager.getConnection(url,"root","Guru@1253");
String query="select * from employee where  Blood_Group=? and Age>=?";
PreparedStatement s=c.prepareStatement(query);
s.setString(1,blood);
s.setString(2,age);
ResultSet rs=s.executeQuery();
%>
<TABLE BORDER="1">
            <TR>
                <TH>Name</TH>
                <TH>Email</TH>
                <TH>Id</TH>
                <TH>Blood Group</TH>
                <TH>Donated In Last 6 Months</TH>
                <TH>Age</TH>
                <TH>Weight</TH>
                <TH>Location</TH>
                <TH>Mobile Number</TH>
            </TR>
            <% while(rs.next()){ %>
            <TR>
                <TD> <%= rs.getString("Name") %></td>
                <TD> <%= rs.getString("Email") %></TD>
                <TD> <%= rs.getString("Id") %></TD>
                <TD> <%= rs.getString("Blood_Group") %></TD>
                <TD> <%= rs.getString("Donated_in_last_6_months") %></TD>
                <TD> <%= rs.getInt("Age") %></TD>
                <TD> <%= rs.getInt("Weight") %></TD>
                <TD> <%= rs.getString("Location") %></TD>
                <TD> <%= rs.getLong("Phone_Number") %></TD>
            </TR>
            <% } %>
        </TABLE>
</body>
</html>