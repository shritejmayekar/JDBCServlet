<%@page import="javafx.geometry.HPos"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Logout</title>
</head>
<body>
<%
HttpSession httpSession=request.getSession();
httpSession.invalidate();
response.sendRedirect("/JavaScriptInnerhtml");
%>
</body>
</html>