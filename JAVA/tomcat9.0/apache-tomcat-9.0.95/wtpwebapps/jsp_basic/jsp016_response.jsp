<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html  lang="ko">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class="container card my-5">
		<h3 class="card-header  bg-info text-white">response</h3>
		<pre class="alert alert-warning my-2">
		내장객체 : response
		javax.servlet.ServletResponse(  javax.servlet.http.HttpResponse )
		- Http요청에 대한 응답정보를 저장한 객체
		- 응답처리를 하는객체인 response는 실행결과를 브라우저로 되돌려줄때 사용하는 내장객체
		- jsp에서 다른페이지로 이동시키는방법 :  
		   (1)   sendRedierct   - 브라우저 url을 변경 , request/response객체가 유지되지 않음 
		   (2)   RequestDispatcfher
		</pre>
		<pre>
		response.jsp (1) > [처리] jsp016_2.jsp (2)
						
							> 19세 미만 : jsp016_child.jsp
							> 19세 이상 : 주소 표시창 변경없음, 보이는 화면은 jsp016_adult.jsp 
		</pre>
		<form  action="jsp016_2.jsp"  method="get" onsubmit="return blankFinder()"> 
			<div class="mb-3 mt-3">
				<label for="userage">나이입력</label>
				<input type="number"  id="userage"   name="userage"   class="form-control" />
			</div>
			<div class="mb-3 mt-3">
				<input type="submit"  value="LOGIN"  class="btn btn-danger" />
			</div> 
		</form>
		<script>
		function blankFinder(){
			let userage = document.querySelector("#userage");
			if(userage.value==""){alert("나이를 입력하지 않았습니다"); userage.focus(); return false;}
			return true;
		}
		
		</script>
	</div>
</body>
</html>
 