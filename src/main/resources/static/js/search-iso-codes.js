function scrollCountry(){

	let searchTerm = document.getElementById("iso");

	console.log(searchTerm);

	element.scrollIntoView();

}

function addISOCode(country){

	//var iso = document.getElementById("iso_code").textContent;
	var addCountry = document.getElementsByName("country")
	addCountry.value = country.textContent;
	
	console.log(addCountry);
	console.log(country);
}