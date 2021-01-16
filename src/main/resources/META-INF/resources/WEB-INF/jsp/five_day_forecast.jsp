<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Five Day Forecast for ${weather.city}</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" 
integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" 
crossorigin="anonymous">

</head>
<body>
	
	<div class = "card-body">
	
		<table class = "table table-sm table-striped">
	
		<thead><tr><td style = "background-color: #bdbd4f">${weather.city}'s current weather</td></tr></thead>
		
		<tbody>
			
			<tr style = "background-color: #000000; color: #ffffff;">
				<td>
				</td>
				<td>
					Monday
				</td>
				<td>
					Tuesday
				</td>
				<td>
					Wednesday
				</td>
				<td>
					Thursday
				</td>
				<td>
					Friday
				</td>
			</tr>
			
			<tr style = "background-color: #000000; color: #ffffff;">
				<td>
					Temperature
				</td>
			</tr>
			<tr style = "background-color: #000000; color: #ffffff;">
				<td>
					Weather
				</td>
			</tr>
			<tr style = "background-color: #000000; color: #ffffff;">
				<td>
					Weather Description
				</td>
			</tr>
			
		</tbody>
	
	</table>
	
	</div>
	
	<script src = "js/five-day-forecast.js"></script>
	
</body>
</html>