<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<%@ include file="../inc/header.jsp" %>

<div class="container my-5">
	<h3>NAVER BOOK</h3>
	<div class="result">
	</div>
	<script>

		$(function() {
			$.ajax({
				//url:"${pageContext.request.contextPath}/books",
				url : "${pageContext.request.contextPath}/books",
				dataType : "json",
				type : "GET",
				success : function(json) { // Object
					// 1. 데이터 분해
					// console.log(json)
					let items = json.items;
					console.log(items[0]); // 객체 1개 items[0] = {title:"", image:"",,,,};
					
					for (let i=0; i<items.length; i++) {
						let div = $('<div class="card my-3 col-sm-5" style="display: inline-block; max-widht:200px; max-height: 500px;">');	// <div></div> 만듦
						let p1 = $('<div class="card-body" style="display: flex; max-widht: inherit; max-height:inherit;">').html('<image src="'+items[i].image+'" />');
						let p2 = $('<div class="card-footer"> style="max-height; inherit; max-widht: inherit; max-height:inherit;">').html('<a style="font-size:12px;" href="'+items[i].link+'">'+items[i].title+'</a>');
						div.append(p1).append(p2); // div 태그 안에 p1 추가하고 p2 추가
						$(".result").append(div);
					}
					// 2. 보여줄 화면 끼워넣기
				},
				error : function(xhr, textStatus, errorThrown) {
					$(".result").html(
							textStatus + "(HTTP-" + xhr.status + "/"
									+ errorThrown);
				}
			}) // $(".result")  document.querySelector(".result")
		}); // jQuery 브라우저 로딩되면 동작
	</script>
</div>

<div class="container card mt-3">
  <h2 class="p-2">Board Title</h2> 
  <table class="table table-sm">
    <thead>
      <tr>
        <th class="col-1">NO</th>
        <th class="col-7">TITLE</th>
        <th class="col-1">WRITER</th>
        <th class="col-2">DATE</th>
        <th class="col-1">hit</th>
      </tr>
    </thead>
    <tbody>
    	<tr>
    		<td>0</td>
    		<td><a href="">NOTICE</a></td>
    		<td>ADMIN</td>
    		<td>--</td>
    		<td>-</td>
    	</tr>
    </tbody>

    <tbody>
    	<c:forEach items="${list}" var="dto"  varStatus="status">
    	<tr>
			<td>${list.size() - status.index}</td>
			<td><a href="detail.do?bno=${dto.bno}">${dto.btitle}</a></td>
			<td>${dto.bname}</td>
			<td>${dto.bdate}</td>
			<td>${dto.bhit}</td>
		</tr>
		</c:forEach>
    </tbody>
  </table>
  <p class="text-end"><a href="write_view.do" class="btn btn-primary">글쓰기</a>
</div>



<%@ include file="../inc/footer.jsp" %>