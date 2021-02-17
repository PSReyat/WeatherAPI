<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Weather API!</title>

<link rel = "stylesheet" href = "/css/scroll_behaviour.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" 
integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" 
crossorigin="anonymous">

</head>
<body>

<header>
	<p>
		Created by Parminder Reyat | Using Open Weather Map API from RapidAPI | 
		<a href = "https://github.com/PSReyat/WeatherAPI" target = "_blank">GitHub for code</a>
	</p>
</header>

	<!-- Search weather -->

	<div id = "weather_search" class = "card-body" align = "center">
	
		<h3>Weather API: Get the current weather for your city.</h3><br/>
	
		<div class = "col-5">
			
			<form action = "" method = "get">
				<input class = "form-control" name = "city" type = "text"  placeholder = "Your city" required/><br/>
				<input class = "form-control" id = "country" name = "country" type = "text" value = "" placeholder = "Your country's ISO code (not required)"/><br/>
				<button type = "submit" formaction = "/current/weather" name = "current" class = "btn btn-success btn-sm">Find out the current weather!</button>
				<button type = "submit" formaction = "/five_day/weather" name = "five_day" class = "btn btn-info btn-sm">Find out 5 day forecast!</button>
			</form>
			
		</div>
	
	</div>
	
	<c:if test = "${error}">
		<p style = "color: red; text-align: center;">Invalid entry.</p>
	</c:if>
	
	<!-- ISO codes -->
		
	<div id = "iso_codes" class = "card-body" align = "center">
	
		<h3 style = "text-decoration: underline;">Countries and their ISO codes</h3><br/>
		
		<p>To search for your country, hold 'Ctrl' and press 'F' and then enter your country</p>
	
		<table class = "table table-striped table-sm">
			
			<thead style = "background-color: #000000; color: #ffffff">
				<tr>
					<td>
						Country
					</td>
					<td>
						ISO Code
					</td>
				</tr>
			</thead>
			
			<tbody>
				<c:forEach items="${codes}" var="list">
					
					<tr>
						<td>
							${list.key}
						</td>
						<td>
							<a href = "#weather_search">
								<button id = "iso_code" class = "btn btn-outline-info btn-sm" value = "${list.value}" onclick = "addISOCode(value)">${list.value}</button>
							</a>
						</td>
					</tr>
					
				</c:forEach>
			</tbody>
			
		</table>
		
	</div>
	
	<script src = "/js/search-iso-codes.js"></script>

</body>
</html>