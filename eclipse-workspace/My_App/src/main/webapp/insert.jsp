<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ page import="java.sql.*"%>
	<%
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	String password = request.getParameter("pwd");
	String id = request.getParameter("id");
	String blood = request.getParameter("blood");
	String donation = request.getParameter("donated");
	String gender = request.getParameter("gender");
	String location = request.getParameter("loc");
	int age = Integer.parseInt(request.getParameter("age"));
	int weight = Integer.parseInt(request.getParameter("weight"));
	long phone = Long.parseLong(request.getParameter("no"));
	Class.forName("com.mysql.jdbc.Driver");
	String url = "jdbc:mysql://localhost:3306/seneca";
	Connection c = DriverManager.getConnection(url, "root", "Guru@1253");
	PreparedStatement s = c.prepareStatement(
			"create table if not exists employee (Name varchar(50),Email varchar(50),Phone_Number long,Password varchar(20),Id varchar(10),Blood_Group varchar(20),Gender varchar(20),Age int,Weight int,Donated_in_last_6_months varchar(10),Location varchar(50))");
	s.executeUpdate();
	s = c.prepareStatement(
			"insert into employee(Name,Email,Phone_Number,Password,Id,Blood_Group,Gender,Age,Weight,Donated_in_last_6_months,Location)values('"
			+ name + "','" + email + "','" + phone + "','" + password + "','" + id + "','" + blood + "','" + gender
			+ "','" + age + "','" + weight + "','" + donation + "','" + location + "')");
	int x = s.executeUpdate();
	if (x > 0)
		response.sendRedirect("Login.html");
	else
		out.println("User not registered");
	%>
</body>
</html>
