<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
<%         
  out.print(request.getServletPath());
%>
<br/>
getContextPath()
<%     
  out.print(request.getContextPath());
%>
<br/>
getPathInfo()
<%   
   out.print(request.getPathInfo());
%>
<br/>
getQueryString()
<%   
   out.print(request.getQueryString());
%> 
<form name="myForm" action="Myservlet">
<label>Name:</label><input  type="text" name="name"></br>
<label>Password:</label><input type="password" name="pass">
<button type="submit">Login</button>

</form>
</body>
</html>