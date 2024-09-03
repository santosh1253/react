<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="obj1" class="com.guru.Employee"></jsp:useBean>
<jsp:setProperty name="obj1" property="*"></jsp:setProperty>
<jsp:getProperty name="obj1" property="name"></jsp:getProperty>
<h1><jsp:getProperty name="obj1" property="email"></jsp:getProperty></h1>