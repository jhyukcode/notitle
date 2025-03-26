<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	int ono = Integer.parseInt(request.getParameter("ono"));	
	int onum = Integer.parseInt(request.getParameter("onum"));	
	String oname = request.getParameter("oname");
	
	Connection conn = null; PreparedStatement pstmt = null;
	String sql = "update milk_order set oname = ?, onum = ? where ono=?";
	
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mbasic" , "root" , "1234");
		
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, oname);    pstmt.setInt(2, onum);      pstmt.setInt(3, ono); 
		
		if(pstmt.executeUpdate()>0){out.println("<script>alert('수정됨');location.href='milk.jsp';</script>");}
		else{out.println("<script>alert('수정실패');location.href='milk.jsp';</script>");}
		
	}catch(Exception e){ e.printStackTrace();
	}finally{
		if(pstmt!=null){pstmt.close();}
		if(conn!=null){conn.close();}
	}
%>

<!-- 
1. utf-8 설정
2. request.getParameter() 이용해서 데이터받기 (  ono, oname, onum )
3. Driver 연동
4. DB 연동   - close()
5. PreparedStatement 이용해서 sql처리
6. 결과값 받아서 처리
-->