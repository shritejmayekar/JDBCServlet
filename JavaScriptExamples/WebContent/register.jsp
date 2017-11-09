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
	height: 585px;
	margin-top: 10px;
	margin-left: 60%;
	radius: 6px;
	background-color:  #FBE9E7;
}

.flex-containerlarge {
	display: -webkit-flex;
	display: flex;
	margin-top: 0px;
	-webkit-flex-direction: column;
	flex-direction: column;
	background-color: #FF8A65
}

.flex-item {
	background-color: #FBE9E7;
	flex-direction: column;
	margin-top: 12px;
	margin-left: 10px;
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
<title>Create your Google Account</title>
</head>
<body>

	<div class="flex-containerlarge">

		<div class="flex-item" id="spaces">
			<form action="login">
				<img alt="Google" src="googleImg.png" height="50"
					style="margin-top: 8px;margin-left: 10px;">
				<button type="submit">Sign in</button>
			</form>
		</div>
		<form action="Register" method="post">
			<div class="flex-container">
				<div class="flex-item">
					<label>Name</label>
				</div>
				<div class="flex-item"></div>

				<div class="flex-item">
					<input type="text" name="firstName" required="required"
						placeholder="First"> &emsp;<input type="text"
						name="lastname" required="required" placeholder="Last">
				</div>
				<div class="flex-item">
					<label> Choose your Name</label>
				</div>
				<div class="flex-item">
					<input type="text" name="email" required="required"
						placeholder="@gmail" id="buttonLarge">

				</div>
				<div class="flex-item">
					<label> Create a Password</label>
				</div>
				<div class="flex-item">
					<input type="password" name="password" required="required"
						id="buttonLarge">

				</div>
				<div class="flex-item">
					<label> Confirm a Password</label>
				</div>
				<div class="flex-item">
					<input type="password" name="confirmPassword" required="required"
						id="buttonLarge">
				</div>
				<div class="flex-item">
					<label> Birthday</label>
				</div>
				<div class="flex-item">
					<select required="required" name="month"
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
					</select> <input type="text" name="day" required="required" id="button"
						placeholder="Day" width="50"> <input type="text"
						name="year" required="required" id="button" placeholder="Year">
					<div class="flex-item">
						<label>Gender</label>
					</div>
					<div class="flex-item">
						<select required="required" name="gender"
							style="padding: 6px; width: 300px">
							<option value="">Gender</option>
							<option value="Male">Male</option>
							<option value="Female">Female</option>
							<option value="Other">Other</option>
							<option value="Not to say">Not to say</option>
						</select>

					</div>
					<div class="flex-item" id="submit">
						<button type="submit">NEXT</button>
					</div>
				</div>
			</div>
		</form>
	</div>
</body>
</html>

