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
	</div>

	<%@page import="javax.naming.*"%>
	<%@page import="javax.sql.*"%>
	<%@page import="java.sql.*"%>
	<%
	Context initContext = new InitialContext();
	Context envContext  = (Context)initContext.lookup("java:/comp/env");
	DataSource ds = (DataSource)envContext.lookup("jdbc/mbasic");
	Connection conn = ds.getConnection();
	if(conn!=null){out.println("db connected");}
	%>
	
</body>
</html>