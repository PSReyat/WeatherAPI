function scrollCountry(){

	let searchTerm = document.getElementById("iso");

	console.log(searchTerm);

	let element = document.get();
	element.scrollIntoView();

}

function addISOCode(country){

	//var iso = document.getElementById("iso_code").textContent;
	document.getElementsByName("country").value = country;
	
	console.log(document.getElementById("iso_code").textContent);
}