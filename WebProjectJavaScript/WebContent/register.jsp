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
	width: 150px;
	padding: 5px;
	margin-left: 5px;
	box-sizing: border-box;
}

#buttonLarge {
	margin-top: 10px;
	margin-left: 5px;
	width: 350px;
	padding: 8px;
	box-sizing: border-box;
}

button {
	margin-top: -15px;
	margin-left: 80%;
	color: white;
	background-color: #03A9F4;
	padding: 10px;
	border-radius: 6px;
	box-sizing: border-box;
	border-width: 0px;
	 cursor: pointer;
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
	height: 915px;
	margin-top: -5em;
	margin-left: 60%;
	position:absolute;
	background-color:  #FBE9E7;
	border-top-left-radius: 2em;
	  border-top-right-radius: 2em;
	  border-bottom-left-radius: 2em;
	  border-bottom-right-radius: 2em;
}

.flex-containerlarge {
	display: -webkit-flex;
	display: flex;
	margin-top: 0px;
	
	-webkit-flex-direction: column;
	flex-direction: column;
	background-color: #FF8A65;
	
}

.flex-item {

	background-color:#FBE9E7;
	flex-direction: column;
	margin-top: 12px;
	margin-left: 10px;
	border-top-left-radius: 1em;
	  border-top-right-radius: 1em;
	  border-bottom-left-radius: 1em;
	  border-bottom-right-radius: 1em;
}
.flex-item2 {

	background-color: #FF8A65;
	flex-direction: column;
	margin-top: 12px;
	margin-left: 10px;
	border-top-left-radius: 1em;
	  border-top-right-radius: 1em;
	  border-bottom-left-radius: 1em;
	  border-bottom-right-radius: 1em;
}

#text {
	color: #2196F3;
	padding: 100px;
}

#spaces {
	margin-top: 0px;
}

label {
	font-size: 19px;
	margin-left: 5px;
}
</style>
<script type="text/javascript">
function validateForm() {
	if(document.getElementById("fname").value=="") {
		alert("Enter FirstName");
		return false;
	}
	if(document.getElementById("lname").value=="") {
		alert("Enter LastName");
		return false;
	}
	if(document.form.email.value=="") {
		alert("Enter email");
		return false;
	}
	if(validateEmail()) {
		alert("please put email in @exam.com format");
		return false;
		
	}
	if(document.form.password.value=="") {
		alert("Enter password");
		return false;
	}
	if(document.form.confirmPassword.value=="") {
		alert("Enter confirm password");
		return false;
	}
	if(document.form.password.value!=document.form.confirmPassword.value) {
		alert("Enter same password ");
		return false;
	}
	if(document.form.month.value=="") {
		alert("Enter month");
		return false;
	}
	if(document.form.day.value=="") {
		alert("Enter day");
		return false;
	}
	if(document.form.year.value=="") {
		alert("Enter year");
		return false;
	}
	if(document.form.gender.value=="") {
		alert("select gender");
		return false;
	}
	if(document.form.mobile.value=="") {
		alert("Enter mobile number");
		return false;
	}
	if(isNaN(document.form.mobile.value)) {
		alert("Please Enter valid mobile Number");
		return false;
	}
	if(document.form.mobile.value.length<10 ) {
		
		alert("Mobile number should be of 10 digits");
		return false;
		
	}
	if(document.form.remail.value=="") {
		alert("Enter recovery account email");
		return false;
		
	}
	if(validateEmail()) {
		alert("please put email in @exam.com format");
		return false;
	}
	if(document.form.location.value=="") {
		alert("Select country");
		return false;
		
	}
	
	return true;
	
	
}
function validateEmail() {
	var email=document.form.email.value;
	var specialCharacter=email.indexOf("@");
	var dotSymbol=email.indexOf(".");
	if(specialCharacter< 1 || (dotSymbol-specialCharacter<5))
		return true;
	return false;
	
}
</script>
<title>Create your Google Account</title>
</head>
<body>

	<div class="flex-containerlarge">
		
		<div class="flex-item" id="spaces">
			<form action="login">
				<img alt="Google" src="googleImg.png" height="50"
					style="margin-top: 8px;margin-left: 10px;">
				<button type="submit" >Sign in</button>
					
			</form>
		</div>
		<div class="flex-item2"><h1 style="color:grey;margin-left:6em;">Create your Google Account</h1></div>
		<form action="Register" method="post" onSubmit="return validateForm()" name="form">
		
			<div class="flex-container">
		
				<div class="flex-item">
					<label>Name</label>
				</div>
				<div class="flex-item"></div>

				<div class="flex-item">
					<input type="text" name="firstName" 
						placeholder="First" id="fname"> &emsp;<input type="text"
						name="lastName"  placeholder="Last" id="lname">
				</div>
				<div class="flex-item">
					<label> Choose your Name</label>
				</div>
				<div class="flex-item">
					<input type="text" name="email" 
						placeholder="@gmail" id="buttonLarge" >

				</div>
				<div class="flex-item">
					<label> Create a Password</label>
				</div>
				<div class="flex-item">
					<input type="password" name="password" 
						id="buttonLarge" >

				</div>
				<div class="flex-item">
					<label> Confirm a Password</label>
				</div>
				<div class="flex-item">
					<input type="password" name="confirmPassword" 
						id="buttonLarge" >
				</div>
				<div class="flex-item">
					<label> Birthday</label>
				</div>
				<div class="flex-item">
					<select  name="month"
						style="padding: 6px; margin-left: 5px">
						<option value="">Month</option>
						<option value="January">January</option>
						<option value="February">February</option>
						<option value="March">March</option>
						<option value="April">April</option>
						<option value="May">May</option>
						<option value="June">June</option>
						<option value="July">July</option>
						<option value="August">August</option>
						<option value="September">September</option>
						<option value="October">October</option>
						<option value="November">November</option>
						<option value="December">December</option>
					</select> <input type="text" name="day"  id="button"
						placeholder="Day" width="50"> <input type="text"
						name="year"  id="button" placeholder="Year">
					<div class="flex-item">
						<label>Gender</label>
					</div>
					<div class="flex-item">
						<select  name="gender"
							style="padding: 6px; width: 300px" value="">
							<option value="">Gender</option>
							<option value="Male">Male</option>
							<option value="Female">Female</option>
							<option value="Other">Other</option>
							<option value="Not to say">Not to say</option>
						</select>
					
					</div>
					<div class="flex-item">
					<label>Mobile phone</label>
				</div>
				<div class="flex-item">
					<input type="text" name="mobile"  maxlength="10"
						id="buttonLarge">
				</div>
				<div class="flex-item">
					<label>Current Email address</label>
				</div>
				<div class="flex-item">
					<input type="text" name="remail" 
						id="buttonLarge">
				</div>
				<div class="flex-item">
					<label>Location</label>
				</div>
				<div class="flex-item">
					<select  name="location"
						style="padding: 6px; margin-left: 5px" value="">
						<option value="">Country</option>
						<option value="India">India</option>
						<option value="Australia">Australia</option>
						<option value="Bangladesh">Bangladesh</option>
						<option value="Sri Lanka">Sri Lanka</option>
						<option value="china">China</option>
					</select> 
				
					<div class="flex-item" id="submit">
						<button type="submit">NEXT</button>
					</div>
				</div>
			</div>
		</form>
	</div>
</body>
</html>

