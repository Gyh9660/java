	
		
	function validateForm(){
		var form = document.writeFrm
		if(form.subject.value == "" || form.subject.value.length==0){
			alert("제목을 입력하세요");
			form.subject.focus();
			return false;
		}
		if(form.content.value == "" || form.content.value.length==0){
			alert("내용을 입력하세요");
			form.content.focus();
			return false;
		}
	
		return true;
	}

		