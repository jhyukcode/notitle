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
	<div class="container card my-3">
		<div class="card-header my-3 bg-info text-white"><h3>사용자 정보 </h3></div>
		<div class="alert alert-warning">NO : ${dto.no}</div>
		<div class="alert alert-warning">NAME : ${dto.name}</div>
		<div class="alert alert-warning">AGE : ${dto.age}</div>
	</div>
	<!-- 빈칸검사 -->
	<script>
		function bFinder_update() {
			let name = document.querySelector("#name");
			let age = document.querySelector("#age");
			
			if(name.value=="") { alert('이름이 비었습니다'); name.focus(); return false;}
			if(age.value=="") { alert('나이가 비었습니다'); age.focus(); return false;}
			return true;
		}
	</script>
	<!-- 선택한 리스트 수정 -->
	<div class="container card">
		      <form method="post" action="update.user" id="userUpdate" onsubmit="return bFinder_update()">
           <fieldset> 
           <legend>리스트수정</legend>
           <div class="form-group"> 
               <label for="no">번호</label>
               <input type="number" name="no"   id="no" value="${dto.no}" placeholder="${dto.no}"  class="form-control bg-light" readonly/>
            </div>
            <div class="form-group"> 
               <label for="name">이름</label>
               <input type="text" name="name"   id="name"   class="form-control"/>
            </div>   
          <div class="form-group"> 
               <label for="age">나이</label>
               <input type="number" name="age"   id="age"   class="form-control"/>
            </div>           
            <div class="form-group">
               <input type="submit" value="수정"  class="btn  btn-danger"/>
            </div>
         </fieldset>
         </form>   
	</div>
</body>
</html>