function scrollCountry(){

	let searchTerm = document.getElementById("iso");

	console.log(searchTerm);

	let element = document.get();
	element.scrollIntoView();

}

function addISOCode(){

	document.getElementsByName("country").nodeValue = document.getElementById("iso").nodeValue;
	
	console.log(document.getElementById("iso").nodeValue);
	console.log(document.getElementsByName("country").nodeValue);
}