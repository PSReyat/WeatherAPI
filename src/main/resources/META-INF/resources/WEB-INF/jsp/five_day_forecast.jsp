<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
	
	<h3 style = "background-color: #bdbd4f; padding-bottom: 5px;">${city}'s five day weather forecast</h3>
	
	<div class = "card-body">
	
		<table class = "table table-hover table-sm">
			
			<tbody>
				<tr>
					<c:forEach items = "${five_day}" var = "fiveDay">
						<td>
							<button id = "days" class = "btn btn-info btn-lg" style = "width: 100%;" value = "${fiveDay.key}" onclick = "chooseDay(value)">${fiveDay.key}</button>
						</td>
					</c:forEach>
				</tr>
			</tbody>
		
		</table>
		
		<table id = "weather_display" class = "table table-striped table-sm">
		
			<thead>
				<tr style = "background-color: #000000; color: #ffffff;">
					<td id = "current_day" style = "background-color: #15ff15; color: #150015">
						Today
					</td>
					<td>
						Country 
					</td>
					<td>
						Country (ISO code)
					</td>
					<td>
						Temperature (&#176;C)
					</td>
					<td>
						Minimum temperature (&#176;C)
					</td>
					<td>
						Maximum temperature (&#176;C)
					</td>
					<td>
						Weather
					</td>
					<td>
						Weather description
					</td>
					<td>
						Pressure
					</td>
					<td>
						Humidity
					</td>
				</tr>
			</thead>
			<tbody>
				
				<c:forEach items = "${five_day}" var = "fiveDay">
						
					<c:forEach items = "${fiveDay.value}" var = "list">
						
						<c:set var = 'day' value = '${list.day}'/>
						<c:if test = "${day == chosen_day}">
							<tr>
								<td>
									${list.time}
								</td>
								<td>
									${list.country}
								</td>
								<td>
									${list.countryISOCode}
								</td>
								<td>
									${list.temperature}
								</td>
								<td>
									${list.tempMin}
								</td>
								<td>
									${list.tempMax}
								</td>
								<td>
									${list.weather}
								</td>
								<td>
									${list.weatherDesc}
								</td>
								<td>
									${list.pressure}
								</td>
								<td>
									${list.humidity}
								</td>
							</tr>
						</c:if>
						
					</c:forEach>
					
				</c:forEach>
				
			</tbody>
		
		</table>
	
	</div>
	
	<script src = "/js/five-day-forecast.js"></script>
	
</body>
</html>