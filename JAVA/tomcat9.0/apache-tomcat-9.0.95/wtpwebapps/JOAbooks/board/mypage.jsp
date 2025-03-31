<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
    <%@ include file="../inc/header.jsp" %>
    
    
  <div class="container-fluid p-5"></div>

  <div class="d-flex justify-content-center" style="width:100%">
    <div class="card" style="width:700px; height:500px;">
  <img class="card-img-top m-3" src="image/man.png" alt="Card image" style="width: 100px;">
  <div class="card-body">
    <h4 class="card-title"><%=id %></h4>
    <p class="card-text">회원 정보</p>
    <p class="card-text pt-3">생년월일</p>
    <p class="card-text">계정 생성일</p>
    <p class="card-text">활동</p>
    <p class="card-text">포인트</p>
  </div>
</div>
    <div class="card p-5">
      <p class="pt-4">로그인</p>
      <p class="pt-4">비밀번호</p>
      <p class="pt-4">알림설정</p>
      <p class="pt-4">회원탈퇴</p>
    </div>
  </div>

<div class="container-fluid p-4"></div>

<%@ include file="../inc/footer.jsp" %>