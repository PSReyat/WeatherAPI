/**
 * 
 */
function chooseDay(day){
	document.getElementById("current_day").innerHTML = day;
	document.body.insertAdjacentHTML("afterbegin", "<c:set var = 'chosen_day' value = '"+ day +"'/>");
	console.log(day);
}