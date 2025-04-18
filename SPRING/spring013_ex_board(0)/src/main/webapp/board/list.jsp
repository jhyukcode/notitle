<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../inc/header.jsp" %>

<script>
//window.onload=function(){};
//window.addEventListener("load", function(){});
//jQuery(document).ready(function(){});
//$(document).ready(function(){});
$(function(){
	let result='${result}'; console.log(result);
	if(result=='fail'){alert('비밀번호 확인'); history.go(-1);}
	else if(result.length!=0) {alert(result);}
});
</script>

<div class="container   my-5">
	<h3>MULTIBOARD</h3>
	<table  class="table table-striped  table-bordered table-hover text-center">
		<caption>MULTIBOARD-LIST</caption>
		<thead>
			<tr><th scope="col">NO</th><th scope="col">TITLE</th>
			      <th scope="col">WRITER</th><th scope="col">DATE</th><th scope="col">HIT</th></tr>
		</thead>
		<tbody>
		<c:forEach var="dto" items="${list}" varStatus="status">
 			<tr><td>${status.index+1}</td>
 			<td><a href="${pageContext.request.contextPath}/board/detail?bno=${dto.bno}" style="text-decoration:none; color:black;">${dto.btitle}</a></td>
			<td>${dto.bname}</td>
			<td>${dto.bdate}</td>
			<td>${dto.bhit}</td></tr>  
		</c:forEach>
		</tbody>
	</table>
	<p  class="text-end"><a href="${pageContext.request.contextPath}/board/write.jsp"   class="btn btn-primary">글쓰기</a></p>
</div>

<%@ include file="../inc/footer.jsp" %>