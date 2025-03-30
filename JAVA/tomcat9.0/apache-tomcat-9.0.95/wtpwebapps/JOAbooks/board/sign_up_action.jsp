<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"  %>

<%  
	request.setCharacterEncoding("UTF-8");

	String id = request.getParameter("cid");
	String pwd = request.getParameter("cpwd");
	
	Connection conn = null;  PreparedStatement pstmt = null; ResultSet rset = null;
	
	String chk = "select count(*) 'cnt' from board_member where id=?";
	String sql = "insert into board_member (id, pwd) values (?, ?)";
	int result = -1;
	
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mbasic","root", "1234");//3. db연동 
		
		pstmt = conn.prepareStatement(chk);  
		pstmt.setString(1, id);
		rset = pstmt.executeQuery();
		
		if (rset.next()){ result = rset.getInt("cnt"); }
		
		if(result == 1){
			out.println("<script>alert('사용할 수 없는 아이디입니다'); history.go(-1); </script>");
		}
		else{ 
			pstmt.close();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			int create = pstmt.executeUpdate();
			out.println("<script>alert('계정이 생성되었습니다'); location.href='../index.jsp'; </script>");
		}
	}catch(Exception e){ e.printStackTrace();
	}finally{
		if(rset  != null){  rset.close();  }
		if(pstmt != null){  pstmt.close(); }
		if(conn  != null){  conn.close();  }
	}
%>