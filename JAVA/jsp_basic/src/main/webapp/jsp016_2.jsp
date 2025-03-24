<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("UTF-8");
	int userage = Integer.parseInt(request.getParameter("userage"));
	
	if(userage<19) {	// 알림창, location.href
		//out.println("<script> location.href='jsp016_child.jsp';</script>");	// 경로노출
		response.sendRedirect("jsp016_child.jsp?userage="+userage);	// 경로노출, 권장사항
	} else {
		//out.println("<script> location.href='jsp016_adult.jsp';</script>"); // 경로노출
		// 요청							↓ 페이지에					 요청한정보  응답하는정보
		request.getRequestDispatcher("jsp016_adult.jsp").forward(request, response);
	}

%>