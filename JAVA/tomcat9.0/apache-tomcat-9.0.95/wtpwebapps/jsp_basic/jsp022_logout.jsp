<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	// jsp022_logout.jsp
	// 1. session 초기화 코드
	// 2. login.jsp 페이지로 넘기기	(10초 뒤에 안내)
	
	session.invalidate();
	// v1
	//out.println("<script>alert('로그아웃합니다'); locate.href='jsp022_login.jsp';</script>");
	
	// v2
	//out.println("<script>alert('로그아웃합니다');</script>");	동작안함
	//response.sendRedirect("jsp022_login.jsp");	알림창 처리 안됨

	// v3 새로고침 http-equiv='refresh' content='초' url='경로'
	out.println("<meta http-equiv='refresh' content='0; url=jsp022_login.jsp' />");
	
	// > sendRedirect/dispatcher 차이점
	// request.gerREquestDIspatcher("jsp022_my.jsp").forward(request, response);

%>