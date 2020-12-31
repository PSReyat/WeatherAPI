<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${weather.city}'s weather information</title>

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
						Country 
					</td>
					<td>
						Country (ISO code)
					</td>
					<td>
						Time zone (Hours)
					</td>
					<td>
						Temperature (&#176;C)
					</td>
					<td>
						Feels like (&#176;C)
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
			
				<tr>
					<td>
						${weather.country}
					</td>
					<td>
						${weather.countryISOCode}
					</td>
					<td>
						${weather.timeZone}
					</td>
					<td>
						${weather.temperature}
					</td>
					<td>
						${weather.tempFeelsLike}
					</td>
					<td>
						${weather.tempMin}
					</td>
					<td>
						${weather.tempMax}
					</td>
					<td>
						${weather.weather}
					</td>
					<td>
						${weather.weatherDesc}
					</td>
					<td>
						${weather.pressure}
					</td>
					<td>
						${weather.humidity}
					</td>
				</tr>
				
			</tbody>
		
		</table>
	
	</div>

</body>
</html>