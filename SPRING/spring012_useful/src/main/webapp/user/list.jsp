<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User</title>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

</head>
<body>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<div class="container card">
		<h3 class="card-header bg-success text-white">USERS</h3>
		<!-- for( UserDto u : list ) {} -->
	<c:forEach var="u" items="${list}" varStatus="status">
	<div class="alert alert-warning my-3">
		<a href="detail.user?no=${u.no}">
		NO : ${u.no} - NAME : ${u.name} - AGE : ${u.age}
		</a>
		<div class="d-flex justify-content-end">
		 <p class="btn btn-danger"><a href="delete.user?no=${u.no}" style="color:white; text-decoration:none;">삭제</a></p>
		 </div>
	</div>
	</c:forEach>
	</div>
	<!-- 빈칸검사 -->
	<script>
		function bFinder() {
			let name = document.querySelector("#name4");
			let age = document.querySelector("#age4");
			
			if(name.value=="") { alert('이름이 비었습니다'); name.focus(); return false;}
			if(age.value=="") { alert('나이가 비었습니다'); age.focus(); return false;}
			return true;
		}
	</script>
	<div class="container card">
		      <form method="post" action="insert.user" id="userInsert" onsubmit="return bFinder()">
           <fieldset> 
           <legend>리스트추가</legend>
            <div class="form-group">
               <label for="name4">이름</label>
               <input type="text" name="name"   id="name4"   class="form-control"/>
            </div>   
          <div class="form-group"> 
               <label for="age4">나이</label>
               <input type="number" name="age"   id="age4"   class="form-control"/>
            </div>           
            <div class="form-group">
               <input type="submit" value="전송"  class="btn  btn-warning"/>
            </div>
         </fieldset>
         </form>   
	</div>
</body>
</html>