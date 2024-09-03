<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.guru.model.LoginBean"%>
<%
    LoginBean bean=(LoginBean)getServletContext().getAttribute("mybean");
    out.print("Welcome "+bean.getEmail());
    LoginBean lb=(LoginBean)request.getSession().getAttribute("mybean");
    System.out.println(lb.getName());
    out.print("Welcome "+lb.getName());
  %>