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
	
		<thead><tr><td style = "background-color: #bdbd4f">${five_day.city}'s 5 day weather forecast</td></tr></thead>
		
		<tbody>
			
			<tr>
				<td>
					<button class = "btn btn-info">${five_day.day}</button>
				</td>
				<td>
					<button class = "btn btn-info">Tuesday</button>
				</td>
				<td>
					<button class = "btn btn-info">Wednesday</button>
				</td>
				<td>
					<button class = "btn btn-info">Thursday</button>
				</td>
				<td>
					<button class = "btn btn-info">Friday</button>
				</td>
			</tr>
			<tr>
				<td>${five_day.humidity}</td>
				<td>${five_day.pressure}</td>
				<td>${five_day.temperature}</td>
				<td>${five_day.tempMax}</td>
				<td>${five_day.tempMin}</td>
				<td>${five_day.weather}</td>
				<td>${five_day.weatherDesc}</td>
			</tr>
			
		</tbody>
	
	</table>
	
	</div>
	
	<script src = "js/five-day-forecast.js"></script>
	
</body>
</html>