<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!-- login.jsp -->
<!-- login.jsp -->
<%@ include file="jsp022_header.jsp" %>
<!-- navbar -->  
<!-- navbar --> 

<body>
	<div class="container card  my-5">
		<h3 class="card-header mb-3"> REGISTER </h3> 
		<p style="text-align:center; "><img src="img/login.png" alt="login"/></p>  
		
		<form action="<%=request.getContextPath()%>/user_join"  method="post"  onsubmit="return  form()">
			<div class="my-3">
				<label for="name"   class="form-label">아이디 </label>
				<input type="text"  class="form-control"  id="name"  name="name" />      
			</div>
			<div class="my-3">
				<label for="pass"       class="form-label">비밀번호 </label>
				<input type="password"  class="form-control"  id="pass"  name="pass" />      
			</div>		
			<div class="my-3">
				<input type="checkbox"   id="check"  name="remember" />      
				<label for="check"       class="form-label">아이디 기억하기 </label>
			</div>	
			<div class="my-3 text-end"> 
				<input type="submit" title="login 하러가기" class="btn btn-success" value="LOGIN" />      
			</div>								
		</form>
		
		<script>
			function form(){
				let  name = document.getElementById("name");
				let  pass = document.querySelector("#pass");
				
				if(name.value =="" ){  alert("빈칸입니다. \n확인해주세요");  name.focus();  return false; } 
				if(pass.value =="" ){  alert("빈칸입니다. \n확인해주세요");  pass.focus();  return false; }
			}
		</script>
	</div>
		<!-- login.jsp -->
	<!-- login.jsp -->
	<!-- footer.jsp -->
	<!-- footer.jsp -->
	<!-- 파일 분리 : jsp022_footer.jsp -->
<%@ include file="jsp022_footer.jsp" %>

</body>
</html>