let status = true;
let idck = false;
$(document).ready(function(){
	//[ID중복확인]버튼을 클릭하면 자동실행
	//입력한 아이디 값을 갖고 confirmId.jsp페이지 실행
	$("#checkId").click(function(){
	  if($("#u_id").val()){
		//아이디를 입력하고 [ID중복확인]버튼을 클릭한 경우
		var query = {u_id:$("#u_id").val()};
		
	    $.ajax({
	    	type:"POST",//요청방식
	    	url:"confirmId.jsp",//요청페이지
	    	data:query,//파라미터
	    	success:function(data){//요청페이지 처리에 성공시
	    		if(data == 1){//사용할 수 없는 아이디
	    			alert("사용할 수 없는 아이디");
	    	    	$("#u_id").val("");
	    	    	$("#u_id").focus();
	    	    	return false;
	    	     }else if(data == 0)//사용할 수 있는 아이디
	    	  	    idck = true;	    	  	    
	    	  	    //alert(idck);
	    	  	    alert("사용할 수 있는 아이디");
	    	  	    
	 	    }
	    });
	  }else{//아이디를 입력하지 않고 [ID중복확인]버튼을 클릭한 경우
		  alert("사용할 아이디를 입력");
		  $("#u_id").focus();
	  }
	});
	
	
	//[가입하기]버튼을 클릭하면 자동실행
	//사용자가 가입폼인 registerForm.jsp페이지에 입력한 내용을 갖고
	//registerPro.jsp페이지 실행
	$("#process").click(function(){
	   checkIt(); //입력폼에 입력한 상황 체크
	   
	   if(status){
		  var query = {u_id:$("#u_id").val(), 
				  pass:$("#pass").val(),
			      u_name:$("#u_name").val(),
			      zip_code:$("#sample6_postcode").val(),
			      address:$("#address").val()+" "+$("#sample6_detailAddress").val() +" "+$("#sample6_extraAddress").val(),
			      email:$("#mailid").val()+"@"+$("#email").val(),
			      phone:$("#phone").val()+$("#phone2").val()+$("#phone3").val()};
		  
		  $.ajax({
		      type:"post",
		      url:"regPro.jsp",
		      data:query,
		      success:function(data){
				  alert("회원가입에 성공했습니다.")
		    	  window.location.href='main.jsp';
		 	  }
		  });
	   }
	});
	
	//[취소]버튼을 클릭하면 자동실행
	$("#cancle").click(function(){
		window.location.href='main.jsp';
	});

 });

//사용자가 입력폼에 입력한 상황을 체크
function checkIt() {
	status = true;
	 if(!$("#u_name").val()) {//이름을 입력하지 않으면 수행
        alert("사용자 이름을 입력하세요");
        $("#u_name").focus();
        status = false;
        return false;
    }
    
    if(!$("#u_id").val()) {//아이디를 입력하지 않으면 수행
        alert("아이디를 입력하세요");
        $("#u_id").focus();
        status = false;
        return false;//사용자가 서비스를 요청한 시점으로 돌아감
    }
    
    if(!$("#pass").val()) {//비밀번호를 입력하지 않으면 수행
        alert("비밀번호를 입력하세요");
        $("#pass").focus();
        status = false;
        return false;
    }
    var pwdCheck = /^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*?[#?!@$%^&*-]).{6,16}$/;
    
    if(!pwdCheck.test(pass.value)) {//비밀번호가 문자/숫자 6~16자가 아닐경우 수행
        alert("6~16자 특수문자+숫자+문자 입력");
        pass.focus();
        status = false;
        return false;
    }
    //비밀번호와 재입력비밀번호가 같지않으면 수행
    if($("#pass").val() != $("#repass").val()){
        alert("비밀번호를 동일하게 입력하세요");
        $("#repass").focus();
        status = false;
        return false;
    }
    
    if($("#phone").val() == "basic") {
        alert("번호 앞자리를 선택해주세요.")
        status = false;
        return false;
    }
    
    if(!$("#phone2").val()) {//전화번호를 입력하지 않으면 수행
        alert("전화번호를 입력하세요");
        $("#phone2").focus();
        status = false;
        return false;
    }  
    
    if(!$("#phone3").val()) {//전화번호를 입력하지 않으면 수행
        alert("전화번호를 입력하세요");
        $("#phone3").focus();
        status = false;
        return false;
    }  
    if(!$("#mailid").val()) {//이메일를 입력하지 않으면 수행
        alert("이메일을 입력하세요");
        $("#mailid").focus();
        status = false;
        return false;
    }  
    
    if(!$("#email").val()) {//이메일를 입력하지 않으면 수행
        alert("이메일을 입력하세요");
        $("#email").focus();
        status = false;
        return false;
    }  
    
    if(!$("#address").val()) {//주소를 입력하지 않으면 수행
        alert("주소를 입력하세요");
        $("#address").focus();
        status = false;
        return false;
    }
    
    if(idck == false){
		alert("아이디 중복체크를 해주세요");
        status = false;
        idck = false;
        return false;
	}
    
}

 function sample6_execDaumPostcode() {
        new daum.Postcode({
            oncomplete: function(data) {
                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

                // 각 주소의 노출 규칙에 따라 주소를 조합한다.
                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                var addr = ''; // 주소 변수
                var extraAddr = ''; // 참고항목 변수

                //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
                if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
                    addr = data.roadAddress;
                } else { // 사용자가 지번 주소를 선택했을 경우(J)
                    addr = data.jibunAddress;
                }

                // 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.
                if(data.userSelectedType === 'R'){
                    // 법정동명이 있을 경우 추가한다. (법정리는 제외)
                    // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
                    if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                        extraAddr += data.bname;
                    }
                    // 건물명이 있고, 공동주택일 경우 추가한다.
                    if(data.buildingName !== '' && data.apartment === 'Y'){
                        extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                    }
                    // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
                    if(extraAddr !== ''){
                        extraAddr = ' (' + extraAddr + ')';
                    }
                    // 조합된 참고항목을 해당 필드에 넣는다.
                    document.getElementById("sample6_extraAddress").value = extraAddr;
                
                } else {
                    document.getElementById("sample6_extraAddress").value = '';
                }

                // 우편번호와 주소 정보를 해당 필드에 넣는다.
                document.getElementById("sample6_postcode").value = data.zonecode;
                document.getElementById("address").value = addr;
                // 커서를 상세주소 필드로 이동한다.
                document.getElementById("sample6_detailAddress").focus();
            }
        }).open();
    }
    
    
function selectEmail(ele){
    var $ele = $(ele);
    var $email = $('input[name=email]');

    // '1'인 경우 직접입력
    if($ele.val() == "1"){
        $email.attr('readonly', false);
        $email.val('');
    } else {
        $email.attr('readonly', true);
        $email.val($ele.val());
    }
}


