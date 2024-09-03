package com.guru.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.guru.model.LoginBean;

@WebServlet("/ControllerServlet")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		LoginBean bean=new LoginBean();
		bean.setName(name);
		bean.setEmail(email);
		System.out.println(bean.getEmail()+bean.getName());
		request.setAttribute("mybean", bean);
		//Using Servlet Context
         ServletContext context=getServletContext();
         context.setAttribute("mybean", bean);
         //Http Session 
         HttpSession session=request.getSession();
         session.setAttribute("mybean", bean);
		if(bean.validate()==1)
		{
			// RequestDispatcher rd=request.getRequestDispatcher("success.jsp");  
	         //rd.forward(request, response); 
			response.sendRedirect("success.jsp");
		}
		else
		{
			response.sendRedirect("failure.jsp");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
