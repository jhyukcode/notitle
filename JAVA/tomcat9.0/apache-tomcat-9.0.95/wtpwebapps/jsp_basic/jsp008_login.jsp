<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class="container card my-5 pt-3">
		<h3 class="card-header bg-info">FORM-LOGIN</h3>
		<p class="container card mb-3 mt-3 bg-warning">
		1. 로그인 폼 열기 <br/>
		다음과 같이 설정 - <br/>
		처리할 경로 : jsp008_result.jsp <br/>
		주소 표시창 줄에 노출 <br/>
		보관 용기 이름 : email / pass / remember <br/>
		2. 저송 버튼을 누르면 다음과 같이 출력 <br/>
		==LOGIN== <br/>
		EMAIL : ~ <br/>
		PASS : ~ <br/> 
		[다시] <br/>
		</p>
		<p style="text-align:center"><img src="img/login.png" alt="login"></p>
		<form action="jsp008_result.jsp" method="get">
			<div class="my-5">
				<label for="email" class="form-label">EMAIL :</label>	
				<input type="email" class="form-control" id="email" placeholder="Enter email" name="email">
			</div>
  
		  	<div class="mb-3">
		    	<label for="pwd" class="form-label">Password:</label>
		    	<input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pass">
		  	</div>
		  	
			<div class="form-check mb-3" style="font-size:14px">
				<label class="form-check-label"> 
					<input class="form-check-input" type="checkbox" name="remember"> REMEMBER
				</label>
			</div>
			<button type="submit" class="btn btn-primary mb-3">Submit</button>
		</form>
	</div>
</body>
</html>