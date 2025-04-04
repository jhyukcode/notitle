<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../inc/header.jsp"%>

<div class="card container my-3 p-3 bg-light">
	<h3>MULTIBOARD 상세보기</h3>
	<div class="">
		<div class="d-flex flex-row">
			<span class="col-sm-1"></span>
			<span class="col-sm-6" style="font-size:20px;">${dto.btitle}</span>
			<span class="col-sm-2" style="font-size:20px;">${dto.bname}</span>
			<span class="col-sm-2" style="font-size:20px;">조회 : ${dto.bhit}</span>
			<span class="col-sm-1"></span>
		</div>
	</div>
	<hr>
	<div class="my-3">
		<div class="">
			<span><i class="bi bi-book-half"></i> 내용</span>
			<p>${dto.bcontent}</p>
		</div>
	</div>
	<div class="text-end">
		<a href="${pageContext.request.contextPath}/board/edit?bno=${dto.bno}" class="btn btn-primary">수정</a> 
		<a href="${pageContext.request.contextPath}/board/delete?bno=${dto.bno}" class="btn btn-outline-danger">삭제</a> 
		<a href="${pageContext.request.contextPath}/board/list" class="btn btn-outline-success">목록보기</a>
	</div>
</div>

<%@ include file="../inc/footer.jsp"%>