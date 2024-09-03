<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.guru.*"%>
<jsp:useBean id="obj" class="com.guru.Employee"></jsp:useBean>
<jsp:setProperty property="*" name="obj"></jsp:setProperty>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
    int status=RegisterDao.register(obj);
    if(status>0) out.println("Regisitered Successfully");
%>
<%
     getDetails.getData();
%>
</body>
</html>