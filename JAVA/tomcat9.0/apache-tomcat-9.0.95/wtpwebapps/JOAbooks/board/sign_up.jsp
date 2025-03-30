<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%@ include file="../inc/header.jsp" %>
    
      <div class="container-fluid p-5"></div>
  

	<div class="container p-5 bg-light" style="align-items: center; border:solid 3px rgba(0, 0, 0, 0.1); border-radius: 7px;">
    <form action="sign_up_action.jsp" method="get" onsubmit="return signup()">
    <div class="m-2">
      <label for="cid" class="form-label">ID:</label>
      <input type="text" class="form-control" id="cid" placeholder="사용할 아이디" name="cid">
    </div>
    <div class="m-2">
      <label for="pwd" class="form-label">Password:</label>
      <input type="password" class="form-control" id="cpwd" placeholder="사용할 비밀번호" name="cpwd">
    </div>
    <div class="m-2">
      <label for="ccpwd" class="form-label">Password Check:</label>
      <input type="password" class="form-control" id="ccpwd" placeholder="비밀번호 확인" name="ccpwd">
    </div>
    <div class="form-check mb-3" style="text-align: right;">
      <label class="form-check-label">
        <button type="submit" class="btn btn-success" style="display: inline-block;">SIGNUP</button>
      </label>
    </div>
</form>	
</div>

<div class="container-fluid p-4"></div>

<script>
	
	function signup(){
		let cid = document.querySelector("#cid");
		let cpwd = document.querySelector("#cpwd");
		let ccpwd = document.querySelector("#ccpwd");
		
		if (cid.value=="") {alert('아이디가 입력되지 않았습니다'); cid.focus(); return false;}
		if (cpwd.value=="") {alert('비밀번호가 입력되지 않았습니다'); cpwd.focus(); return false;}
		if ( cpwd.value!=ccpwd.value ) { alert('입력하신 비밀번호가 일치하지 않습니다'); ccpwd.focus(); return false;}
		
		return true;
	}
	
</script>
    
    
    
    <%@ include file="../inc/footer.jsp" %>