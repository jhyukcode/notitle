<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	int ono = Integer.parseInt(request.getParameter("ono"));
	String result = "관리자에게 문의바랍니다.";
	Connection conn = null; PreparedStatement pstmt = null;  
	
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mbasic", "root", "1234");
		pstmt = conn.prepareStatement("delete from milk_order where ono=?");
		pstmt.setInt(1, ono);
		if(pstmt.executeUpdate() > 0){ result ="삭제됨"; }
		
		out.println("<script>alert('"+result+"'); location.href='milk.jsp';</script>");
				
	}catch(Exception e){e.printStackTrace();
	}finally{
		if(pstmt!=null){pstmt.close();}
		if(conn!=null){conn.close();}
	}
%>

<!-- //1. utf-8 설정
//2. request.getParameter() 이용해서 데이터받기 

//3. Driver 연동
//4. DB 연동   - close()

//5. PreparedStatement 이용해서 sql처리
//6. 결과값 받아서 처리 -->