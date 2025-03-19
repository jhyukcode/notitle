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
	<div class="container-fluid bg-secondary my-5 py-5">
		<h2 class="text-light">MILK ORDER</h2>
	</div>
	
	<div class="container card py-3">
	 	<h2 class="alert alert-primary mt-2">YOUR ORDER</h2>
	 	
	 	<table class="table table-striped">
		
		<thead>
		      <tr>
		        <th scope="col">Number</th>
		        <th scope="col">Taste</th>
		        <th scope="col">Price</th>
		      </tr>
		</thead>
		
		<tbody>
		<%@ page import="java.sql.*" %>
	 	<%
	 	Connection conn = null;
	 	PreparedStatement ptmt = null;
	 	ResultSet rset = null;
	 	String sql="select * from milk";
	 	String url="jdbc:mysql://localhost:3306/mbasic";
	 	String id="root", pass="1234";
	 	try {
	 		// 1.  드라이버 로딩
	 		Class.forName("com.mysql.cj.jdbc.Driver");
	 		// 2. db 연동
	 		conn = DriverManager.getConnection(url, id, pass);
	 		// 3. PreparedStatement
	 		ptmt = conn.prepareStatement(sql); 		
	 		// 4. 결과
	 		rset = ptmt.executeQuery();
			while(rset.next()) {
			//	out.println( rset.getInt("mno")+"/"+rset.getString("mname")+"/"+rset.getInt("mprice"));
			int mno=rset.getInt("mno");
			String mname=rset.getString("mname");
			int mprice=rset.getInt("mprice");
			%>
			<tr>
		        <td><%=mno%></td>
		        <td><%=mname%></td>
		        <td><%=mprice%></td>
		    </tr>
		<%
			}
	 	} catch (Exception e) {e.printStackTrace();
	 	} finally {
	 		if(rset != null) { rset.close();}
			if(ptmt != null) { ptmt.close();}
			if(conn != null) { conn.close();}
	 	}
	 	%>
	 		</tbody>
		</table>
	</div>
</body>
</html>