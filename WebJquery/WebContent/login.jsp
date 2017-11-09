<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
		
      <script type = "text/javascript">
        
    
         
         $(document).ready(function() {
        	$("button").click(function() {
        		
        		$("h1").toggle();
        		
        	}) 
        	$("label").click(function() {
        		$("h2").toggle();
        	});
         }); 
      </script>	
</head>
<body>
<h1>Hello</h1>
<button type="button" >Toggle</button>
<h2>Hey ,how are you</h2>
<label>Click me</label>
</body>
</html>