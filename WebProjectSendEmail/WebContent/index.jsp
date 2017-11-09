<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Email</title>
</head>
<body>
<form action="SendEmailServlet">
<lable>To </lable><input type="text" name="email">
<label>Subject</label><input type="text" name="subject">
<label>Body</label><input type="text" name="body">
<button type="submit">Send Mail</button>
</body>
</html>