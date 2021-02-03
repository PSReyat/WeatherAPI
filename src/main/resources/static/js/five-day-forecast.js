/**
 * 
 */
function chooseDay(day){
	document.getElementById("current_day").innerHTML = day;
	document.body.insertAdjacentHTML("afterbegin", "<c:set var = 'chosen_day' value = '"+ day +"'/>");
	console.log(day);
}

//document.getElementById("display_weather").insertAdjacentHTML("afterbegin", "<c:forEach items = '${five_day}' var = 'fiveDay'><c:forEach items = '${fiveDay.value}' var = 'list'><c:set var = 'day' value = '${list.day}'/><c:if test = '${day == '"+day+"'}'><tr><td>${list.time}</td><td>${list.country}</td><td>${list.countryISOCode}</td><td>${list.temperature}</td><td>${list.tempMin}</td><td>${list.tempMax}</td><td>${list.weather}</td><td>${list.weatherDesc}</td><td>${list.pressure}</td><td>${list.humidity}</td></tr></c:if></c:forEach></c:forEach>");
