<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Weather API!</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" 
integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" 
crossorigin="anonymous">

</head>
<body>

	<div class = "card" align = "center">
	
		<h3>Weather API: Get the current weather for your city.</h3>
	
		<form action = "/" method = "GET">
			<input type = "text" placeholder = "Your city" required/><br/>
			<input type = "text" placeholder = "Your countries ISO code"/><br/>
			<button type = "submit" class = "btn btn-success btn-sm">Find out the weather!</button>
		</form>
		
		
	
	</div>

</body>
</html>