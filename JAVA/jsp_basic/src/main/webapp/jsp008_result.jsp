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
		<h3 class="card-header bg-info">LOGIN RESULT</h3>
		<%
			String email = request.getParameter("email");
			String pwd = request.getParameter("pass");
			String remem = request.getParameter("remember");
			
		%>
		<div class=my-5>
			<p> EMAIL : <%=email %></p>
			<p> PWD : <%=pwd %></p>
			<p> REMEMBER : <%=remem %></p>
			<p><a href="javascript:history.go(-1)" class="btn btn-warning">BACK</a></p>
		</div>
	</div>
</body>
</html>