<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">

</style>
</head>
<body>
  <%
    String email=request.getParameter("email");
    String pwd=request.getParameter("pwd");
    String url="jdbc:mysql://localhost:3306/student";
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con=DriverManager.getConnection(url,"root","Guru@1253");
  //  Statement st=con.createStatement();
  //  String query="delete from stud where pwd='Guru' ";
    String Query1="insert into stud values('root','Guru')";
    PreparedStatement ps=con.prepareStatement(Query1);
    String Query2="delete from stud where email='null' ";
    ps.addBatch(Query1);
    ps.addBatch(Query2);
    int arr[]=ps.executeBatch();
    out.println(arr[0]+" "+arr[1]);
    if(arr[0]==1 && arr[1]>=0)
    {
    	out.println("Queries using batch executed successfully");
    }
    ps=con.prepareStatement("select * from stud");
    ResultSet rs=ps.executeQuery();
  %>
    <table>
     <tr><th>Email</th><th>password</th></tr>
     <% 	
       while(rs.next())
       { 
      %>
        <tr>
        <td><%= rs.getString(1) %></td>
        <td><%= rs.getString(2) %></td>
        </tr>
    <%    
       }
     con.close();
     %>
    </table>
</body>
</html>