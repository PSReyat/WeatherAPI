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

	<div class = "card-body" align = "center">
	
		<h3>Weather API: Get the current weather for your city.</h3><br/>
	
		<div class = "col-4">
			
			<form action = "/weather" method = "GET">
				<input class = "form-control" type = "text" placeholder = "Your city" required/><br/>
				<input class = "form-control" type = "text" placeholder = "Your country's ISO code (not required)"/><br/>
				<button type = "submit" class = "btn btn-success btn-sm">Find out the weather!</button>
			</form>
			
		</div>
	
	</div>

</body>
</html>