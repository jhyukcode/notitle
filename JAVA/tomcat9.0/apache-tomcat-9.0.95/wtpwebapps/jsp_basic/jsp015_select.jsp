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
		<h3 class="card-header">REQUEST - SELECT</h3>
		<%
		String username2 = request.getParameter("username2");
		String color = request.getParameter("color");
		%>
		<table class="table table-striped">
			<caption>Select 데이터 확인</caption>
			<tbody>
				<tr><th scope="row">USER</th><td> <%=username2 %></td></tr>
				<tr><th scope="row">SELECT</th><td class="<%=color %> container p-5 text-white"><%=color %></td></tr>
			</tbody>
		</table>
	</div>
</body>
</html>