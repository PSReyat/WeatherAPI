/**
 * 
 */
function showDay0(day){
	document.getElementById("current_day").innerHTML = day + " (Today)";
	document.getElementById("day0").style.visibility = "";
	document.getElementById("day1").style.visibility = "collapse";
	document.getElementById("day2").style.visibility = "collapse";
	document.getElementById("day3").style.visibility = "collapse";
	document.getElementById("day4").style.visibility = "collapse";
}

function showDay1(day){
	document.getElementById("current_day").innerHTML = day + " (Tomorrow)";
	document.getElementById("day0").style.visibility = "collapse";
	document.getElementById("day1").style.visibility = "";
	document.getElementById("day2").style.visibility = "collapse";
	document.getElementById("day3").style.visibility = "collapse";
	document.getElementById("day4").style.visibility = "collapse";
}

function showDay2(day){
	document.getElementById("current_day").innerHTML = day;
	document.getElementById("day0").style.visibility = "collapse";
	document.getElementById("day1").style.visibility = "collapse";
	document.getElementById("day2").style.visibility = "";
	document.getElementById("day3").style.visibility = "collapse";
	document.getElementById("day4").style.visibility = "collapse";
}

function showDay3(day){
	document.getElementById("current_day").innerHTML = day;
	document.getElementById("day0").style.visibility = "collapse";
	document.getElementById("day1").style.visibility = "collapse";
	document.getElementById("day2").style.visibility = "collapse";
	document.getElementById("day3").style.visibility = "";
	document.getElementById("day4").style.visibility = "collapse";
}

function showDay4(day){
	document.getElementById("current_day").innerHTML = day;
	document.getElementById("day0").style.visibility = "collapse";
	document.getElementById("day1").style.visibility = "collapse";
	document.getElementById("day2").style.visibility = "collapse";
	document.getElementById("day3").style.visibility = "collapse";
	document.getElementById("day4").style.visibility = "";
}