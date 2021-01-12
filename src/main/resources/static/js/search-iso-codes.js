function scrollCountry(){

	let searchTerm = document.getElementById("iso");

	console.log(searchTerm);

	let element = document.get();
	element.scrollIntoView();

}

function addISOCode(){

	let iso = document.getElementById("iso_code").textContent;
	document.getElementsByName("country").innerHTML = iso;

	document.getElementsByName("country").onfocus;

	
	console.log(document.getElementById("iso_code").textContent);
}