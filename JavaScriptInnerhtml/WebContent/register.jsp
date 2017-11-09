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
	position: absolute;
	background-color: #FBE9E7;
	border-top-left-radius: 1em;
	border-top-right-radius: 1em;
	border-bottom-left-radius: 1em;
	border-bottom-right-radius: 1em;
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
	background-color: #FBE9E7;
	flex-direction: column;
	margin-top: 4px;
	margin-left: 10px;
	border-top-left-radius: 1em;
	border-top-right-radius: 1em;
	border-bottom-left-radius: 1em;
	border-bottom-right-radius: 1em;
}

.flex-item2 {
	background-color: #FF8A65;
	flex-direction: column;
	margin-top: 4px;
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

p {
	color: red;
}
</style>
<script type="text/javascript">
	function validateForm() {
		var fname = document.getElementById("fname").value;
		var lname = document.getElementById("lname").value;
		var email = document.form.email.value;
		var password = document.form.password.value;
		var confirmPassword = document.form.confirmPassword.value;
		if (fname == "" || lname == "") {
			document.getElementById("demo").innerHTML = "You can't leave this empty.";
			return false;
		}
		if (email == "") {
			document.getElementById("demoEmail").innerHTML = "You can't leave this empty.";
			return false;
		}
		if (validateEmail()) {
			document.getElementById("demoEmail").innerHTML = "please put email in @exam.com format.";
			return false;

		}
		if (password == "") {
			document.getElementById("demoPassword").innerHTML = "You can't leave this empty.";
			return false;
		}
		if (confirmPassword == "") {
			document.getElementById("demoConfirmPassword").innerHTML = "You can't leave this empty.";
			return false;
		}
		if (password != confirmPassword) {
			document.getElementById("demoConfirmPassword").innerHTML = "Enter same password.";
			return false;
		}
		if (document.form.month.value == "") {
			document.getElementById("demoMonth").innerHTML = "Select Month.";
			return false;
		}
		if (document.form.day.value == "") {
			document.getElementById("demoMonth").innerHTML = "Enter day.";
			return false;
		}
		if (document.form.year.value == "") {
			document.getElementById("demoMonth").innerHTML = "Enter year.";
			return false;
		}
		if (document.form.gender.value == "") {
			document.getElementById("demogender").innerHTML = "Select Gender.";
			return false;
		}
		if (document.form.mobile.value == "") {
			document.getElementById("demoMobile").innerHTML = "Enter mobile number.";
			return false;
		}
		if (isNaN(document.form.mobile.value)) {
			document.getElementById("demoMobile").innerHTML = "Mobile number should be number.";
			return false;
		}
		if (document.form.mobile.value.length < 10) {

			document.getElementById("demoMobile").innerHTML = "Mobile number should be 10 digits.";
			return false;

		}
		if (document.form.remail.value == "") {
			document.getElementById("demoRecover").innerHTML = "You can't leave this empty.";
			return false;

		}
		if (validateEmail()) {
			document.getElementById("demoRecover").innerHTML = "please put email in @exam.com format.";
			return false;
		}
		if (document.form.location.value == "") {
			document.getElementById("demoCountry").innerHTML = "please select location.";
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
<title>Create your Google Account</title>
</head>
<body>

	<div class="flex-containerlarge">

		<div class="flex-item" id="spaces">
			<form action="login">
				<img alt="Google" src="googleImg.png" height="50"
					style="margin-top: 8px; margin-left: 10px;">
				<button type="submit">Sign in</button>

			</form>
		</div>
		<div class="flex-item2">
			<h1 style="color: grey; margin-left: 6em;">Create your Google
				Account</h1>
		</div>
		<form action="Register" method="post" onSubmit="return validateForm()"
			name="form">

			<div class="flex-container">

				<div class="flex-item">
					<label>Name</label>
				</div>
				<div class="flex-item"></div>

				<div class="flex-item">
					<input type="text" name="firstName" placeholder="First" id="fname">
					&emsp;<input type="text" name="lastname" placeholder="Last"
						id="lname">
					<p id="demo"></p>
				</div>
				<div class="flex-item">
					<label> Choose your Name</label>
				</div>
				<div class="flex-item">
					<input type="text" name="email" placeholder="@gmail"
						id="buttonLarge">
					<p id="demoEmail"></p>

				</div>
				<div class="flex-item">
					<label> Create a Password</label>
				</div>
				<div class="flex-item">
					<input type="password" name="password" id="buttonLarge">
					<p id="demoPassword"></p>

				</div>
				<div class="flex-item">
					<label> Confirm a Password</label>
				</div>
				<div class="flex-item">
					<input type="password" name="confirmPassword" id="buttonLarge">
					<p id="demoConfirmPassword"></p>
				</div>
				<div class="flex-item">
					<label> Birthday</label>
				</div>
				<div class="flex-item">
					<select name="month" style="padding: 6px; margin-left: 5px">
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
					</select> <input type="text" name="day" id="button" placeholder="Day"
						width="50"> <input type="text" name="year" id="button"
						placeholder="Year">
					<p id="demoMonth"></p>
					<div class="flex-item">
						<label>Gender</label>
					</div>
					<div class="flex-item">
						<select name="gender" style="padding: 6px; width: 300px" value="">
							<option value="">Gender</option>
							<option value="Male">Male</option>
							<option value="Female">Female</option>
							<option value="Other">Other</option>
							<option value="Not to say">Not to say</option>
						</select>
						<p id="demogender"></p>

					</div>
					<div class="flex-item">
						<label>Mobile phone</label>
					</div>
					<div class="flex-item">
						<input type="text" name="mobile" maxlength="10" id="buttonLarge">
						<p id="demoMobile"></p>
					</div>
					<div class="flex-item">
						<label>Current Email address</label>
					</div>
					<div class="flex-item">
						<input type="text" name="remail" id="buttonLarge">
						<p id="demoRecover"></p>
					</div>
					<div class="flex-item">
						<label>Location</label>
					</div>
					<div class="flex-item">
						<select name="location" style="padding: 6px; margin-left: 5px"
							value="">
							<option value="">Country</option>
							<option value="India">India</option>
							<option value="Australia">Australia</option>
							<option value="Bangladesh">Bangladesh</option>
							<option value="Sri Lanka">Sri Lanka</option>
							<option value="china">China</option>
						</select>
						<p id="demoCountry"></p>
						<div class="flex-item" id="submit">
							<button type="submit">NEXT</button>
						</div>
					</div>
				</div>
		</form>
	</div>
</body>
</html>

