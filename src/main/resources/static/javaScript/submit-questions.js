window.addEventListener("DOMContentLoaded", function(e){

	function ajaxSubmitAnswers(formData) {
		$.ajax({
			type : "POST",
			url : "/submitQuestions",
			data : formData,
			success : function(result) {
				if (result.status == "200") {
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

	var checkForm = function(e) {
		e.preventDefault();
		var questionForm = e.target;
		var formData = JSON.stringify($(questionForm).serializeArray());
		console.log(formData);
		ajaxSubmitAnswers(formData);
	}
	document.getElementById("questionsList").addEventListener("submit", checkForm, false);
});
