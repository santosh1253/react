package com.guru;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.guru.database.ConnectionProvider;

/**
 * Servlet implementation class Child
 */
@WebServlet("/Child")
public class Child extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Child() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String name=request.getParameter("Uname");
		String id=request.getParameter("Rollno");
		PrintWriter pw=response.getWriter();
		pw.println("<h1>"+name+" "+id+"</h1>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("Uname");
		String id=request.getParameter("Rollno");
		int rollno=Integer.parseInt(id);
		try {
			Connection con=ConnectionProvider.getConnectionObj();
			PreparedStatement ps=con.prepareStatement("insert into student values(?,?)");
			ps.setString(1, name);
			ps.setInt(2, rollno);
			int x=ps.executeUpdate();
			if(x>0)
			{
				PrintWriter pw=response.getWriter();
				pw.print("User Registered Successfully");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
