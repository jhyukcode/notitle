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
	<div class="container card bg-light my-5">
		<h3 class="card-header bg-warning">내장객체</h3>
		<pre>
		1. jsp페이지가 웹컨테이너에 의해 서블릿으로 변환될 때
		2. 고정된 이름의 객체 컨테이너로 자동으로 구현
		3. request(요청), response(응답), session(정보저장), out(출력)
		</pre>
	</div>
	<div class="container card bg-light my-5">
		<h3 class="card-header bg-warning">request - checkbox</h3>
		<pre>
		1. action="처리 컴포넌트"
		2. method="처리방식"
		3. name="사용자가 입력한 값 보관 이름"
		</pre>
		<form action="jsp015_checkbox.jsp" method="get" onsubmit="return blankFinder()">
			<div class="mb-3 mt-3">
				<label for="username" class="form-label">NAME:</label>
				<input type="text" class="form-control" id="username" placeholder="Enter Username" name="username">
			</div>
			<div>
				<input class="form-check-input" type="checkbox" id="check1" name="option1" value="dog">
				<label class="form-check-label" for="check1">DOG</label>
			</div>
			<div>
				<input class="form-check-input" type="checkbox" id="check2" name="option1" value="cat">
				<label class="form-check-label" for="check2">CAT</label>
			</div>
			<div>
				<input class="form-check-input" type="checkbox" id="check3" name="option1" value="pig">
				<label class="form-check-label" for="check3">PIG</label>
			</div>
			<button type="submit" class="btn btn-success">Submit</button>
		</form>
		<script>
		function blankFinder(){
			let username = document.querySelector("#username");
			let checkboxes = document.querySelectorAll(".form-check-input:checked")
			console.log(checkboxes);
			console.log(checkboxes.length);
			
			if(username.value=="") {alert("이름을 입력하지 않았습니다."); username.focus(); return false;}
			if(checkboxes.length==0) {alert("한 개 이상의 선택 옵션을 선택하세요"); return false;}
			return true;
		}
		</script>
	</div>
	<div class="container card bg-light my-5">
		<h3 class="card-header bg-warning">request(요청) - radio</h3>
		<form action="jsp015_radio.jsp" method="get" onsubmit="return radioFinder()">
			<div class="mb-3 mt-3">
				<label for="username1" class="form-label">NAME:</label>
				<input type="text" class="form-control" id="username1" placeholder="Enter Username" name="username1">
			</div>
			<div class="form-check">
				<input type="radio" class="form-check-input1" id="radio1" name="optradio" value="yes"> Yes
				<label class="form-check-label" for="radio1"></label>
			</div>
			<div class="form-check">
				<input type="radio" class="form-check-input1" id="radio2" name="optradio" value="no"> No
				<label class="form-check-label" for="radio2"></label>
			</div>
			<div class="form-check">
				<input type="radio" class="form-check-input1" disabled> 사용불가(disabled)
				<label class="form-check-label"></label>
			</div>
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
		<script>
		function radioFinder(){
			let username1 = document.querySelector("#username1");
			let radioCheckbox = document.querySelectorAll(".form-check-input1:checked");
			if(username1.value=="") {alert("이름을 입력하지 않았습니다"); username1.focus(); return false;}
			if(radioCheckbox.length==0) {alert("한 개의 선택 옵션을 선택하세요"); return false;}
			return true;
		}
		</script>
	</div>
	<div class="container card bg-light my-5">
		<h3 class="card-header bg-warning">request(요청) - select</h3>
		
		<form action="jsp015_select.jsp" method="get" onsubmit="return selectFinder()">
			<div class="mb-3 mt-3">
				<label for="username2" class="form-label">NAME:</label>
				<input type="text" class="form-control" id="username2" placeholder="Enter Username" name="username2">
			</div>
			<label for="color">COLOR 선택:</label>
			<select class="form-select" id="color" name="color">
				<option value="1">---</option>
				<option value="bg-danger" class="text-danger">RED</option>
				<option value="bg-success" class="text-success">GREEN</option>
				<option value="bg-primary" class="text-primary">BLUE</option>
				<option value="bg-dark" class="text-dark">BLACK</option>
			</select>
			<button type="submit" class="btn btn-danger">Submit</button>
		</form>
		<script>
		function selectFinder(){
			let username2 = document.querySelector("#username2");
			let select = document.querySelector("#color");
			if(username2.value==""){alert("이름을 입력하지 않았습니다"); username2.focus(); return false;}
			if(select.value=="1"){alert("선택 옵션을 선택하지 않았습니다"); return false;}
			return true;
		}
		</script>
	</div>
</body>
</html>