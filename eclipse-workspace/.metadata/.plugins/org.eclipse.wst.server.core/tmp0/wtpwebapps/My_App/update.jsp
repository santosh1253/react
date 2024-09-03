<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@page import="java.sql.*" %>
<%
String donate=request.getParameter("donated");
String id=request.getParameter("id");
Class.forName("com.mysql.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/seneca";
Connection c=DriverManager.getConnection(url,"root","Guru@1253");
String query="update employee  set Donated_in_last_6_months=? where id=?";
PreparedStatement s=c.prepareStatement(query);
s.setString(1,donate);
s.setString(2,id);
if(s.executeUpdate()>0)
{
	response.sendRedirect("display.html");
}
%>
</body>
</html>