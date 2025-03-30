<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib  prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<nav class="navbar navbar-expand-sm navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="<%=request.getContextPath()%>/list.do">MAIN</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#mynavbar">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="mynavbar">
      <ul class="navbar-nav ms-auto">
      <% String id = (String)session.getAttribute("userid");
      if( id!=null ){ %>
      <!-- 로그인 O -->
      <li class="nav-item" style="text-align: right;"> <a class="nav-link" href="<%=request.getContextPath()%>/board/mypage.jsp" style="color: white;"><%=id %></a></li>
      <li class="nav-item" style="text-align: right;"> <a class="nav-link" href="<%=request.getContextPath()%>/board/logout_action.jsp">LOGOUT</a> </li>
      
      <!-- 로그인 X -->
      <% } else { %>
      <li class="nav-item" style="text-align: right;"> <a class="nav-link" href="<%=request.getContextPath()%>/board/sign_up.jsp">Sign Up</a> </li>
      <li class="nav-item" style="text-align: right;"> <a class="nav-link" href="<%=request.getContextPath()%>/board/login.jsp">Login</a> </li>
      <%  } %>
      </ul>
    </div>
  </div>
</nav>
