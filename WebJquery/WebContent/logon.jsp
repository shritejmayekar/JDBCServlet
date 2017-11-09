<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>lOGON PAGE</title>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!-- <script type="text/javascript">
function validation() {
	
	if(document.myForm.name.value==""||document.myForm.pass.value=="") {
		
		alert("hi");
		return false;
	}
	return true;
}


</script> -->
<script type="text/javascript">
$(document).ready(function () {
	
	$("input").eq(0).css(background-color,red);
	
	
});



</script>

</head>
<body>
<form  name="myForm">
Name:<input type="text" name="name" id="uname"></br>
Password:<input type="password" pass="pass" id="pass"> 
<button type="submit">Login </button>



</form>
</body>
</html>