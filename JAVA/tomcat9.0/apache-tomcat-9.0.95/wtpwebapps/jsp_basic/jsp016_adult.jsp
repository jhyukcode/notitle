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
	<div class="container card my-5 bg-light">
		<h3 class="alert alert-danger">반갑습니다! 고객님</h3>
		<p> <%=request.getParameter("userage") %>세 고객님을 위한 추천입니다!</p>
		<p><a href="javascript:history.go(-1)" class="btn btn-warning">돌아가기</a></p>
	</div>
</body>
</html>