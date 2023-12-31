var cm = CodeMirror.fromTextArea(document.getElementById("editor"),{
			mode: "xml",
			theme: "dracula",
			lineNumbers: true,
			autoCloseTags: true
		});
		cm.setSize("1250","700");
		
		
		
function onButtonClick() {
		alert('Tester');
		let giga = cm.getValue();
		console.log('test')
		console.log(giga)
		//console.log(cm.getValue());
		
		//text = text.replace(webapp/Replace.html, '');
		//new_cm.setValue(text);
		}	
const button = document.querySelector('button');
button.addEventListener('click',onButtonClick);