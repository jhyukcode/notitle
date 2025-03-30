<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<%@ include file="../inc/header.jsp" %>

<div class="container-fluid text-center mt-5">
	<h3>MULTIBOARD - 글쓰기</h3>
</div>
<div class="container p-5">
	<h5>WRITE(CREATE)</h5><hr>
	
	<form action="write.do" method="get" onsubmit="return bFinder()">
	  <div class="mb-3 mt-3">
	    <label for="banme" class="form-label">이름</label>
	    <input type="text" class="form-control" id="bname" placeholder="작성자의 이름" name="bname">
	  </div>
	  <div class="mb-3">
	    <label for="btitle" class="form-label">제목</label>
	    <input type="text" class="form-control" id="btitle" placeholder="작성글 제목" name="btitle">
	  </div>
  	<label for="bcontent">내용</label>
	<textarea class="form-control" rows="10" id="bcontent" name="bcontent"></textarea>
	<div class="d-grid gap-3 mt-2 mb-5">
	  <input type="submit" title="작성하기" class="btn btn-info" value="입력" style="box-shadow: 0 2px 4px rgba(52, 152, 219, 0.2);"/>
	  <button type="reset" class="btn btn-block" style="box-shadow: 0 2px 4px rgba(52, 152, 219, 0.2);">취소</button>
	  <button type="button" class="btn btn-block" style="box-shadow: 0 2px 4px rgba(52, 152, 219, 0.2);">목록보기</button>
	</div>
  </form>
</div>

<script>
	function bFinder() {
		let bname = document.querySelector("#bname");
		let btitle = document.querySelector("#btitle");
		let bcontent = document.querySelector("#bcontent");
		
		if(bname.value==""){alert('이름이 비어있습니다'); bname.focus(); return false;}
		if(btitle.value==""){alert('제목이 비어있습니다'); btitle.focus(); return false;}
		if(bcontent.value==""){alert('내용이 비어있습니다'); bcontent.focus(); return false;}
		
		return true;
	}

</script>


<%@ include file="../inc/footer.jsp" %>