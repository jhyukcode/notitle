<%@page import="java.net.InetAddress"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	request.setCharacterEncoding("UTF-8");  
	String oname = request.getParameter("oname");
	int onum = Integer.parseInt( request.getParameter("onum") );
	
	Connection conn = null; PreparedStatement pstmt = null; 
	String sql = "insert into milk_order (oname, onum, oip) values (?, ?, ?);";
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mbasic" , "root" , "1234");
		
		pstmt = conn.prepareStatement(sql); 
		pstmt.setString(1, oname); 
		pstmt.setInt(2, onum);
		pstmt.setString(3, InetAddress.getLocalHost().getHostAddress());
		
		int result = pstmt.executeUpdate();
		if(result>0){out.println("<script>alert('주문 완료'); location.href='milk.jsp'; </script>");}
		else{out.println("<script>alert('주문 실패'); location.href='milk.jsp'; </script>");}
		
	}catch(Exception e){e.printStackTrace();
	}finally{
		  if(pstmt!=null){pstmt.close();}
		  if(conn!=null){conn.close();}
	}
%>

<%--
	//1. utf-8 설정
	//2. request.getParameter() 이용해서 데이터받기 
	
	//3. Driver 연동
	//4. DB 연동   - close()
	
	//5. PreparedStatement 이용해서 sql처리
	//6. 결과값 받아서 처리
--%>