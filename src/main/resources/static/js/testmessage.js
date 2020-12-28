/**
 * 
 */

let para = document.createElement("h1");

let node = document.createTextNode("This is a header from the js file");

para.appendChild(node);

let element = document.getElementById("div1");

element.appendChild(para);
