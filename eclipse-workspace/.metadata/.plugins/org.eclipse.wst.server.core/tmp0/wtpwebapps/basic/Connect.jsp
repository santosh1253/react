<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.* "%>
<% 
try
{
		int uid=Integer.parseInt(request.getParameter("uname"));
		String pwd=request.getParameter("password");
		String fname=request.getParameter("firstname");
		String lname=request.getParameter("lastname");
		int  age=Integer.parseInt(request.getParameter("age"));
		int weight=Integer.parseInt(request.getParameter("w"));
		String bloodGroup=request.getParameter("bloodgroup");
		String gender=request.getParameter("gender");
		String contact=request.getParameter("phone");
		String address=request.getParameter("address");
		String email=request.getParameter("email");
		String flag=request.getParameter("blood");
		//out.println(request.getParameter("uname")+" "+request.getParameter("age")+" "+request.getParameter("w"));
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","Guru@1253");
		PreparedStatement ps=con.prepareStatement("create table if not exists users(uid int primary key,password varchar(20),firstname varchar(20),lastname varchar(20),age int,weight int,bloodgroup varchar(20),gender varchar(20),contact varchar(20),address varchar(20),email varchar(20),Donated_recently varchar(10))");
		
		if(ps.executeUpdate()>0)
		{
			out.println("Table Created Successfully");
		}
		ps=con.prepareStatement("insert into users (uid,password,firstname,lastname,age,weight,bloodgroup,gender,contact,address,email,Donated_recently) values('"+uid+"','"+pwd+"','"+fname+"','"+lname+"','"+age+"','"+weight+"','"+bloodGroup+"','"+gender+"','"+contact+"','"+address+"','"+email+"','"+flag+"')");
		if(ps.executeUpdate()>0)
		{
			out.println("Registration completed Succesfully");
			response.sendRedirect("success.jsp");
		}
		else
		{
			out.println("OOps");
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
%>