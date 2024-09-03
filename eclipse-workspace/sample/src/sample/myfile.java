package sample;

import java.io.*;
import java.sql.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class myfile extends HttpServlet{
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
  response.setContentType("text/html");
  PrintWriter pw = response.getWriter();
  String connectionURL = "jdbc:mysql://localhost:3306/db";
  Connection connection;
  try{
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		pw.println(username);
		pw.println(password);
		connection = DriverManager.getConnection(connectionURL, "root", "admin");
		PreparedStatement pst = connection.prepareStatement("insert into emp_info values(?,?)");
		pst.setString(1,username);
		pst.setString(2,password);
		int i = pst.executeUpdate();
		if(i!=0){
		pw.println("<br>Record has been inserted");
		}
		else{
		pw.println("failed to insert the data");
	}
  }
  catch (Exception e){
  pw.println(e);
  }
  }
}