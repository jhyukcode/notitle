<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../inc/header.jsp"%>

<div class="container card  my-5  p-3">
	<h3>MULTIBOARD - 삭제하기 </h3>
	<form action="${pageContext.request.contextPath}/board/delete" method="post"  id="deleteForm"   onsubmit="return  deleteform()">
		<div class="my-3">
		  <label for="bpass" class="form-label" >비밀번호</label>
		  <input type="password"   name="bpass"   id="bpass" class="form-control"> 
		</div>
		<div class="text-end">
			<input type="submit"   value="삭제"  class="btn btn-outline-danger btn-block">
			<a href="#" onclick="window.history.back();" class="btn btn-outline-primary btn-block">취소</a>
		</div>
	</form>
</div>

<script>
	function deleteform() {}
	let bpass = document.getElementById("bpass");
	if (bpass.value=="") {alert{'비밀번호를 입력하지 않았습니다'}; bpass.focus(); return false;}
	//if (bpass.value==${dto.bpass}) { alert{'게시글이 삭제되었습니다'}; return true;}
	return false;
</script>










<%@ include file="../inc/footer.jsp"%>