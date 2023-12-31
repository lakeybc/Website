import {EditorState} from "@codemirror/state"
import {EditorView, keymap} from "@codemirror/view"
import {defaultKeymap} from "@codemirror/commands"
let startState = EditorState.create({
	doc: "Hello World",
	extention: [keymap.of(defaultKeymap)]
})
let view = new EditorView({
	state: startState,
	parent: document.body
})

let transaction = view.state.update({changes: {from: 0, insert: "0"}});
console.log(transaction.state.doc.toSTring());

view.dispatch(transaction);