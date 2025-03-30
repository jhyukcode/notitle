<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"  %>

<%  
	request.setCharacterEncoding("UTF-8");

	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	
	Connection conn = null;  PreparedStatement pstmt = null; ResultSet rset = null;
	
	String sql = "select count(*) 'cnt' from board_member where id=? and pwd=?";
	int result = -1;
	
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mbasic","root", "1234");//3. db연동 
		pstmt = conn.prepareStatement(sql);  
		pstmt.setString(1, id);
		pstmt.setString(2, pwd);
		rset = pstmt.executeQuery();
		if (rset.next() ){  result = rset.getInt("cnt");  }
		
		if(result == 1){
			out.println("<script>location.href='../index.jsp';</script>");
			session.setAttribute("userid", id);
		}
		else{ 
			out.println("<script>alert('아이디 혹은 비밀번호가 틀렸습니다'); history.go(-1); </script>");
		}
	}catch(Exception e){ e.printStackTrace();
	}finally{
		if(rset  != null){  rset.close();  }
		if(pstmt != null){  pstmt.close(); }
		if(conn  != null){  conn.close();  }
	}
%>