/**
 * 
 */
function chooseDay(day){
	let jstl = '<c:set var = "chosen_day" value = '+ day +'/>';
	document.getElementById("current_day").innerHTML = day;
	document.body.innerHTML += jstl;
}