function scrollCountry(){

	let searchTerm = document.getElementById("iso");

	console.log(searchTerm);

	let element = document.get();
	element.scrollIntoView();

}

function addISOCode(){

	var iso = document.getElementById("iso_code").textContent;
	document.getElementsByName("country").innerHTML = iso;

	document.getElementsByName("country").focus;

	
	console.log(document.getElementById("iso_code").textContent);
}