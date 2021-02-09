<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${city}'s Five Day Forecast</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" 
integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" 
crossorigin="anonymous">

</head>
<body>
	
	<h3 style = "background-color: #15ffaa; padding-bottom: 5px;">${city}'s five day weather forecast</h3>
	
	<div class = "card-body">
	
		<table class = "table table-hover table-sm" style = "table-layout: fixed; width: 100%;">
			
			<tbody>
				<tr>
					<td>
						<button class = "btn btn-info btn-lg" style = "width: 100%;" value = "${days[0]}" onclick = "showDay0(value)">
							${days[0]}
						</button>
					</td>
					<td>
						<button class = "btn btn-info btn-lg" style = "width: 100%;" value = "${days[1]}" onclick = "showDay1(value)">
							${days[1]}
						</button>
					</td>
					<td>
						<button class = "btn btn-info btn-lg" style = "width: 100%;" value = "${days[2]}" onclick = "showDay2(value)">
							${days[2]}
						</button>
					</td>
					<td>
						<button class = "btn btn-info btn-lg" style = "width: 100%;" value = "${days[3]}" onclick = "showDay3(value)">
							${days[3]}
						</button>
					</td>
					<td>
						<button class = "btn btn-info btn-lg" style = "width: 100%;" value = "${days[4]}" onclick = "showDay4(value)">
							${days[4]}
						</button>
					</td>
				</tr>
			</tbody>
		
		</table>
		
		<table class = "table table-striped table-sm">
		
			<thead>
				<tr style = "background-color: #000000; color: #ffffff;">
					<td id = "current_day" style = "background-color: #15ffaa; color: #150015">
						${days[0]} (Today)
					</td>
					<td>Country</td>
					<td>Country (ISO code)</td>
					<td>Temperature (&#176;C)</td>
					<td>Minimum temperature (&#176;C)</td>
					<td>Maximum temperature (&#176;C)</td>
					<td>Weather</td>
					<td>Weather description</td>
					<td>Pressure</td>
					<td>Humidity</td>
				</tr>
			</thead>
			
			<!-- Today -->
			<tbody id = "day0">
				<c:forEach items = "${weather_data[0]}" var = "list">
					<tr>
						<td>${list.time}</td>
						<td>${list.country}</td>
						<td>${list.countryISOCode}</td>
						<td>${list.temperature}</td>
						<td>${list.tempMin}</td>
						<td>${list.tempMax}</td>
						<td>${list.weather}</td>
						<td>${list.weatherDesc}</td>
						<td>${list.pressure}</td>
						<td>${list.humidity}</td>
					</tr>
				</c:forEach>
			</tbody>
			
			<!-- Tomorrow -->
			<tbody id = "day1" style = "visibility: collapse">
				<c:forEach items = "${weather_data[1]}" var = "list">
					<tr>
						<td>${list.time}</td>
						<td>${list.country}</td>
						<td>${list.countryISOCode}</td>
						<td>${list.temperature}</td>
						<td>${list.tempMin}</td>
						<td>${list.tempMax}</td>
						<td>${list.weather}</td>
						<td>${list.weatherDesc}</td>
						<td>${list.pressure}</td>
						<td>${list.humidity}</td>
					</tr>
				</c:forEach>
			</tbody>
			
			<!-- 3rd day -->
			<tbody id = "day2" style = "visibility: collapse">
				<c:forEach items = "${weather_data[2]}" var = "list">
					<tr>
						<td>${list.time}</td>
						<td>${list.country}</td>
						<td>${list.countryISOCode}</td>
						<td>${list.temperature}</td>
						<td>${list.tempMin}</td>
						<td>${list.tempMax}</td>
						<td>${list.weather}</td>
						<td>${list.weatherDesc}</td>
						<td>${list.pressure}</td>
						<td>${list.humidity}</td>
					</tr>
				</c:forEach>
			</tbody>
			
			<!-- 4th day -->
			<tbody id = "day3" style = "visibility: collapse">
				<c:forEach items = "${weather_data[3]}" var = "list">
					<tr>
						<td>${list.time}</td>
						<td>${list.country}</td>
						<td>${list.countryISOCode}</td>
						<td>${list.temperature}</td>
						<td>${list.tempMin}</td>
						<td>${list.tempMax}</td>
						<td>${list.weather}</td>
						<td>${list.weatherDesc}</td>
						<td>${list.pressure}</td>
						<td>${list.humidity}</td>
					</tr>
				</c:forEach>
			</tbody>
			
			<!-- 5th day -->
			<tbody id = "day4" style = "visibility: collapse">
				<c:forEach items = "${weather_data[4]}" var = "list">
					<tr>
						<td>${list.time}</td>
						<td>${list.country}</td>
						<td>${list.countryISOCode}</td>
						<td>${list.temperature}</td>
						<td>${list.tempMin}</td>
						<td>${list.tempMax}</td>
						<td>${list.weather}</td>
						<td>${list.weatherDesc}</td>
						<td>${list.pressure}</td>
						<td>${list.humidity}</td>
					</tr>
				</c:forEach>
			</tbody>
			
		</table>
	
	</div>
	
	<script src = "/js/five-day-forecast.js"></script>
	
</body>
</html>

<!-- 
<c:forEach items = "${five_day}" var = "fiveDay">
						
					<c:forEach items = "${fiveDay.value}" var = "list">
						
						<c:set var = 'day' value = '${list.day}'/>
						<c:if test = "${day == 'Tuesday'}">
							<tr>
								<td>${list.time}</td>
								<td>${list.country}</td>
								<td>${list.countryISOCode}</td>
								<td>${list.temperature}</td>
								<td>${list.tempMin}</td>
								<td>${list.tempMax}</td>
								<td>${list.weather}</td>
								<td>${list.weatherDesc}</td>
								<td>${list.pressure}</td>
								<td>${list.humidity}</td>
							</tr>
						</c:if>
						
					</c:forEach>
					
				</c:forEach> -->
				
<!-- 
<c:set var = "day0" value = "${days[0]}"/>
				<c:set var = "day1" value = "${days[1]}"/>
				<c:set var = "day2" value = "${days[2]}"/>
				<c:set var = "day3" value = "${days[3]}"/>
				<c:set var = "day4" value = "${days[4]}"/>

<c:set var = "chosen_day" value = "Wednesday"/>
			
				<c:choose>
					<c:when test = "${chosen_day == day0}">
						<c:set var = "data" value = "${}"/>
					</c:when>
					<c:when test = "${chosen_day == day1}">
						<c:set var = "data" value = "${weather_data[1]}"/>
					</c:when>
					<c:when test = "${chosen_day == day2}">
						<c:set var = "data" value = "${weather_data[2]}"/>
					</c:when>
					<c:when test = "${chosen_day == day3}">
						<c:set var = "data" value = "${weather_data[3]}"/>
					</c:when>
					<c:when test = "${chosen_day == day4}">
						<c:set var = "data" value = "${weather_data[4]}"/>
					</c:when>
				</c:choose> -->