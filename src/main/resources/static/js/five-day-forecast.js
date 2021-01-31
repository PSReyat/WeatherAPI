/**
 * 
 */
function chooseDay(day){
	document.getElementById("current_day").innerHTML = day;
	document.body.innerHTML += "<c:set var = 'chosen_day' value = '"+ day +"'/>";
	console.log(day);
}