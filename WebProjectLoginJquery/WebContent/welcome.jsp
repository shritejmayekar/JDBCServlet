<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
body {
	background-color: #FFFFF
}

h2, h3 {
	font-family: Serif;
}

a {
	margin-top: 10px;
}

img {
	border-width: 10px;
}

img:hover {
	background-color: black;
	color: white;
}

input[type] {
	margin-top: 10px;
	width: 400px;
	padding: 8px;
	box-sizing: border-box;
	background: #FFFFF;
	border-width: 2px;
	border-color: #DCDCDC
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
	width: 100%;
	background-color: #FBE9E7;
}

.flex-item {
	background-color: #FFFFF;
	flex-direction: column;
	margin-top: 14%;
	margin-left: 40%;
}

#text {
	margin-top: 10px;
	color: #2196F3;
}

#spaces {
	margin-top: 150px;
}
</style>
<title>Sign in-Google Account</title>
</head>
<body>

	<!--  <a href="login.jsp"><label id="text">Login</label></a> -->
	<div class="flex-conatiner">
		<form action="logout.jsp" method="get">
		
		
		<button type="submit" style="margin-left: 90%">Sign Out</button>
		<div  style="margin-left: 90%">
		<label>
		Welcome
		<%
		HttpSession httpSession = request.getSession();
		Object value = httpSession.getAttribute("user");
		
		if(value==null)
			response.sendRedirect("login");
		else{
		
		out.print(value);
		}
	%>
	</label>
	</div>
		</form>
	
		<form method="get" action="https://www.google.com/search">
			<div class="flex-item">
				<img src="googleImg.png" alt="Google" class="image" />
				<div style="margin-top: 10px; margin-left: -40px;">
					<input type="text" name="q" value="" maxlength="25" />
				</div>
				<div>
					<button type="submit">Search</button>
				</div>
			</div>
		</form>
	</div>
</body>
</html>
	
</body>
</html>