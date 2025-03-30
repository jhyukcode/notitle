<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%	
	session.invalidate();
	out.println("<meta http-equiv='refresh' content='0; url=../index.jsp'>");
%>