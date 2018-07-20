//console.log('Form.js linked!');
const name = document.querySelector('.name'),
	username = document.querySelector('.username'),
	form = document.querySelector('#form');

// event listeners
eventListener();
function eventListener(){
	name.addEventListener('blur',checkIt);
	username.addEventListener('blur',checkIt);
}

function checkIt(e){
	//console.log('checkIt() called');
	e.preventDefault();
	const count = e.target.value.length;
	if(count<1){
		printError(e.target);
	}
}

function printError(element){
	//console.log('printError() called');
	//console.log(element);
	const para = document.createElement('p');
	para.textContent = 'Enter Something';
	//para.appendChild(document.createTextNode('Enter Something'));
	para.style.color = 'red';
	console.log(para);
	element.appendChild(para);
}
