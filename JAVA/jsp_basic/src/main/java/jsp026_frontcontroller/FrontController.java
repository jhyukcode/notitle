package jsp026_frontcontroller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("*.front")	// ##1 모든 파일 중 확장자가 front 인 파일
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);	// ##3
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);	// ##3
	}
	// ##2
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		String path = request.getServletPath();
		System.out.println("..."+path);
		
		if (path.equals("/a.front")) {System.out.println("A. A처리컨트롤러 호출\nB. View");}
		else if (path.equals("/b.front")) {System.out.println("A. B처리컨트롤러 호출\nB. View");}

	// ##4-1. 브라우저 띄우기('Ctrl'+'F11') : http://localhost:8080/jsp_basic/*.front
	//   4-2. http://localhost:8080/jsp_basic/a.front > 콘솔창 확인 : .../a.front
	//   4-2. http://localhost:8080/jsp_basic/b.front > 콘솔창 확인 : .../b.front
	
}
}
