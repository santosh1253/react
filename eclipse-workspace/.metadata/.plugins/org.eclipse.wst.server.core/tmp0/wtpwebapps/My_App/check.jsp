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
<%@ page import="java.sql.*" %>h
<%
String n=request.getParameter("email");
String p=request.getParameter("pwd");
Class.forName("com.mysql.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/seneca";
Connection c=DriverManager.getConnection(url,"root","Guru@1253");
Statement s=c.createStatement();
String q ="SELECT * FROM employee";
ResultSet r= s.executeQuery(q);
while(r.next())
{
if(p.equals(r.getString("Password")) && n.equals(r.getString("Email")))
{
	response.sendRedirect("display.html");
}
else
{
	out.println("Login failed");
}
}
%>
</body>
</html>