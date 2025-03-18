<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>SCORE - RESULT</title>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class="container card my-5 pt-3 bg-light">
		<h3 class="card-header bg-info">FORM - SCORE RESULT</h3>
		<%
			int kor = Integer.parseInt(request.getParameter("kor"));
			int eng = Integer.parseInt(request.getParameter("eng"));
			int math = Integer.parseInt(request.getParameter("math"));
			
			int total = kor+eng+math;
			double avg = total/3f;
		%>

		<table class="talbe table-bordered table-striped table-hover my-5">
			<caption>성적처리</caption>
			<thead style="text-align:center">
				<tr>
					<th scope="col">kor</th>
					<th scope="col">eng</th>
					<th scope="col">math</th>
					<th scope="col">total</th>
					<th scope="col">avg</th>

				</tr>
			</thead>
			<tbody style="text-align:right">
				<tr>
					<td><%=kor%></td>
					<td><%=eng%></td>
					<td><%=math%></td>
					<td><%=total%></td>
					<td><%=avg%></td>
				</tr>

			</tbody>
		</table>

		<div class="my-3">
		<p>국어 : <%=kor %> </p>
		<p>영어 : <%=eng %> </p>
		<p>수학 : <%=math %> </p>
		<p>총점 : <%=total %> </p>
		<p>평균 : <%=avg %> </p>
		<p><a href="jsp009_score.jsp" class="btn btn-warning">BACK</a></p>
		</div>
	</div>
</body>
</html>