package com.guru;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class Hello
 */
@WebServlet("/Hello")
public class Hello extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public Hello() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//PrintWriter pw=response.getWriter();
		//pw.write(request.getServerName()+" "+request.getServerPort()+" "+request.getLocalName());
		String id=request.getParameter("Rollno");
		String name=request.getParameter("Uname");
		PrintWriter pw=response.getWriter();
		pw.print(Integer.parseInt(id)+Integer.parseInt(name));
	}

}
