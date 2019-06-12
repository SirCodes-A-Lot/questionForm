$(document).ready(function() {
	ajaxGetQuestions(event);
});

function ajaxGetQuestions() {
	$.ajax({
		type : "GET",
		url : "/getQuestions",
		success : function(result) {
			if (result.status == "200") {
				$.each(result.data, addQuestion);
				makeSubmitButton();
				console.log(result.data);
			} else {
				console.log("ERROR:  ", "no response");
			}
		},
		error : function(e) {
			console.log("ERROR: ", e);
		}
	});
}

var addQuestion =  function (key, questionObject) {
	var questionEntry = document.createElement("DIV");
	questionEntry.innerHTML= key +") " + questionObject.question;
	$("#questionsList").append(questionEntry);
	makeAnswerRadioButtons(key, questionObject);
	$("#questionsList").append(document.createElement("BR"));
};

function makeAnswerRadioButtons (key, questionObject) {
	for (var i=0; i < questionObject.allAnswers.length; i++){
		var answerOption = document.createElement("LABEL");
		var radioButton = document.createElement("INPUT");
		radioButton.setAttribute("type", "radio");
		radioButton.setAttribute("name", key);
		radioButton.setAttribute("value", questionObject.allAnswers[i]);
		answerOption.appendChild(radioButton);
		answerOption.append(questionObject.allAnswers[i]);
		$("#questionsList").append(answerOption);
		$("#questionsList").append(document.createElement("BR"));
	}
}

function makeSubmitButton() {
	var submitButton = document.createElement("INPUT");
	submitButton.setAttribute("type", "submit");
	$("#questionsList").append(submitButton);
}