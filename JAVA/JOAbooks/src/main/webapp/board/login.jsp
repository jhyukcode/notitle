<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<%@ include file="../inc/header.jsp" %>


  <div class="container-fluid p-5"></div>
  

	<div class="container p-5 bg-light" style="align-items: center; border:solid 3px rgba(0, 0, 0, 0.1); border-radius: 7px;">
    <form action="login_action.jsp" method="get" onsubmit="return bFinder()">
    <div class="m-2">
      <label for="id" class="form-label">ID:</label>
      <input type="text" class="form-control" id="id" placeholder="아이디" name="id">
    </div>
    <div class="m-2">
      <label for="pwd" class="form-label">Password:</label>
      <input type="password" class="form-control" id="pwd" placeholder="비밀번호" name="pwd">
    </div>
    <div class="form-check mb-3" style="text-align: right;">
      <label class="form-check-label">
        <input class="form-check-input" type="checkbox" name="remember"> 아이디 기억하기
        <button type="submit" class="btn btn-primary" style="display: inline-block;">LOGIN</button>
      </label>
    </div>
</form>	
</div>

<div class="container-fluid p-4"></div>

<script>
	
	function bFinder(){
		let id = document.querySelector("#id");
		let pwd = document.querySelector("#pwd");
		
		if (id.value=="") {alert('아이디가 입력되지 않았습니다'); id.focus(); return false;}
		if (pwd.value=="") {alert('비밀번호가 입력되지 않았습니다'); pwd.focus(); return false;}
		
		return true;
	}
	
</script>


<%@ include file="../inc/footer.jsp" %>