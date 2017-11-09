<%@page import="com.bridgelabz.dao.RegisterDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
body {
	background-color: #FF8A65
}

h2, h3 {
	font-family: Serif;
}

a {
	margin-top: 10px;
}

img:hover {
	background-color: black;
	color: white;
}

input[type] {
	margin-top: 10px;
	width: 350px;
	padding: 8px;
	box-sizing: border-box;
	background: transparent;
	border-width: 0px;
	border: none;
	border-bottom: 2px solid blue;
}

button {
	margin-top: 10px;
	margin-left: 300px;
	color: white;
	background-color: #03A9F4;
	padding: 10px;
	border-radius: 6px;
	box-sizing: border-box;
}

button:hover {
	background-color: #3F51B5;
}

.flex-container {
	display: -webkit-flex;
	display: flex;
	-webkit-flex-direction: column;
	flex-direction: column;
	width: 500px;
	height: 600px;
	margin-top: 6%;
	margin-left: 29%;
	background-color: #FBE9E7;
}

.flex-item {
	background-color: #FBE9E7;
	flex-direction: column;
	margin-top: 5px;
	margin-left: 50px;
}

#forgotpassword {
	color: #2196F3;
}

#spaces {
	margin-top: 150px;
}
</style>
<title>Sign in-Google Account Authentication and Password</title>
</head>

<body>
	<form action="Login" method="post">
		<div class="flex-container">
			<div id="spaces">
				<div class="flex-item" id="google">
					<img src="googleImg.png" height="30" alt="Google" class="image" />
				</div>
				<div class="flex-item">
					<h2>Welcome</h2>
					<%
						String email = request.getParameter("email");
						out.print("<h3>" + email + "</h3>");
						HttpSession httpSession = request.getSession();
						session.setAttribute("user", email);
					%>
				</div>
				<div class="flex-item" id="signin">
					<input type="password" name="password" placeholder="Password"
						required="required" />
				</div>
				<div class="flex-item">
					<a href="#"><label id="forgotemail">Forgot password?</label></a>
				</div>
				<div class="flex-item" id="submit">
					<button type="submit">NEXT</button>
				</div>
			</div>
		</div>
	</form>
</body>
</html>