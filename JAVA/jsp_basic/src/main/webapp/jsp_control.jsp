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
	<div class="container card my-5">
		<h3 class="card-header"></h3>
		<form action="jsp_control_rq" method="get">
			<div class="my-5">
				<label for="avg" class="form-label">평균입력 :</label>	
				<input type="number" class="form-control" id="avg" name="avg" min="0" max="100">
			</div>
			<button type="submit" class="btn btn-primary mb-3">Submit</button>
		
		</form>
	</div>
</body>
</html>