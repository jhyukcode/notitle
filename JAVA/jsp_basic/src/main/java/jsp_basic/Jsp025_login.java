package jsp_basic;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


/**
 * Servlet implementation class Jsp025_join
 */
@WebServlet("/user_login")
public class Jsp025_login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Jsp025_login() { super(); }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8"); // 오타주의
		PrintWriter out = response.getWriter();
		
		// 1. 데이터 넘겨받기
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		
		// 2. DBManager 연동
		DBManager db = new DBManager();
		Connection conn = db.getConnection();
		
		// 3. SQL 구문 처리
		PreparedStatement pstmt = null; ResultSet rset = null;
		String sql = "select name, pass from member where name=? and pass=?";
		try {
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1,  name);
		pstmt.setString(2,  pass);
		
		rset = pstmt.executeQuery();  // insert, update, delete | executeQuery -select
		
		// 4. 경로 처리
		if(rset.next()) { 
			HttpSession session = request.getSession();
			session.setAttribute("username", name);
			out.println("<script>alert('login success'); location.href='jsp022_my.jsp';</script>");
			}
		else { 
			out.println("<script>alert('Incorrect ID or Password'); location.href='jsp025_login.jsp'</script>");}
		} catch (SQLException e) {e.printStackTrace(); 
		} finally {
			if (rset!=null) { try {rset.close();} catch (SQLException e) {e.printStackTrace();}}
			if (pstmt!=null) { try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}}
			if (conn!=null) { try {conn.close();} catch (SQLException e) {e.printStackTrace();}}
			}
		//response.sendRedirect("jsp022_login.jsp");
	}

}
