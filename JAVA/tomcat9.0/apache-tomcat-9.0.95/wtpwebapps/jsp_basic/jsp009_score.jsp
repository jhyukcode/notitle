<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>FORM - SCORE</title>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class="container card my-5 pt-3">
		<h3 class="card-header bg-info">FORM - SCORE</h3>
		<p class="container card mb-3 mt-3 bg-light">
		1. 성적 처리 폼 열기 <br/>
		다음과 같이 설정<br/>
		처리할 경로 : jsp009_reuslt.jsp<br/>
		주소 표시 창 줄에 노출 X<br/>
		보관 용기 이름 : kor / eng / math<br/>
		2. 전송 버튼 클릭 시 다음과 같이 출력<br/>
		==성적처리 프로그램=<br/>
		국어:<br/>
		영어:<br/>
		수학:<br/>
		총점:<br/>
		평균:<br/>
		합불:(평균60 and 국/영/수 모두 40 이상)<br/>
		레벨 : (>=90 A, >=80 B, >=70 C, D)<br/>
		다시<br/>
		</p>
		<form action="jsp009_result.jsp" method="post">
			<div class="my-3">
				<label for="kor" class="form-label">KOR:</label>	
				<input type="number" class="form-control" id="kor" name="kor" min="0" max="100" value="0">
			</div>
  
		  	<div class="mb-3">
		    	<label for="eng" class="form-label">ENG:</label>
		    	<input type="number" class="form-control" id="eng" name="eng" min="0" max="100" value="0">
		  	</div>
		  	
			<div class="mb-3">
		    	<label for="math" class="form-label">MATH:</label>
		    	<input type="number" class="form-control" id="math" name="math" min="0" max="100" value="0">
		  	</div>
		  	<div class="mb-3" style="text-align:right">
			<button type="submit" class="btn btn-success mb-3">성적 계산하기</button>
			</div>
			</form>
	</div>
</body>
</html>