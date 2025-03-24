<%@page import="java.util.Arrays"%>
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
		<h3 class="card-header">REQUEST - RADIOCHECK</h3>
		<%
		String username1 = request.getParameter("username1");
		String optradio = request.getParameter("optradio");
		%>
		<table class="table table-striped">
			<caption>radioCheckbox 데이터 확인</caption>
			<tbody>
				<tr><th scope="row">USER</th><td> <%=username1 %></td></tr>
				<tr><th scope="row">CHECK</th><td> <%=optradio %></td></tr>
			</tbody>
		</table>
	</div>
</body>
</html>