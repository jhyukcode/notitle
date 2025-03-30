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
		<pre>
		1) 드라이버로딩	Class.forName
		2) db연동		DriverManager.getConnection(url, id, pass);
		3) Statement, PreparedStatement
		4) 결과 : ResultSet (select) / int (insert, update, delete)
		</pre>
		<%@ page import="java.sql.*" %>
		<%
			Connection conn = null;
			PreparedStatement ptmt = null;
			ResultSet rset = null;
			String sql="select * from milk where mname=? and mno=?";
			String url="jdbc:mysql://localhost:3306/mbasic";
			String id="root", pass="1234";
			try{
				// 1) 드라이버로딩
				Class.forName("com.mysql.cj.jdbc.Driver");
				// 2) db연동
				conn = DriverManager.getConnection(url, id, pass);
				// 3) Statement, PreparedStatement
				ptmt = conn.prepareStatement(sql);
				ptmt.setString(1, "white");	// 1 - ?의 번호 1부터 시작
				ptmt.setInt(2, 1);	// 2 - 두번째 물음표

				// 표-줄-칸
				rset = ptmt.executeQuery();
				while(rset.next()){
					out.println(rset.getInt("mno")+"/"+rset.getString("mname")
					+"/"+rset.getInt("mprice"));
				}
				
				// 4) 결과 : ResultSet (select) / int (insert, update, delete)
				
			} catch (Exception e) { e.printStackTrace();
			} finally {
				if(rset != null) { rset.close();}
				if(ptmt != null) { ptmt.close();}
				if(conn != null) { conn.close();}
			}
			

		%>
	</div>
</body>
</html>