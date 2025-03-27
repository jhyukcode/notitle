package com.company.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FrontController_
 */
@WebServlet("*.do")
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
		doDO(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doDO(request, response);
	}
	protected void doDO(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String path = request.getServletPath();
		System.out.println(path);
		
		if(path.equals("/list.do")) {
			System.out.println("list.do :  C:전체리스트        BList        /      V:list.jsp");
			// C:전체리스트        BList        /      V:list.jsp
		}
		else if(path.equals("/write_view.do")) {
			System.out.println("write_view.do : 글쓰기 폼");
			// C:글삽입             BWrite(알림창- 성공/실패) /   V: /list.do
		}
		else if(path.equals("/write.do")) {
			System.out.println("write.do : 글쓰기 기능");
			// BWrite(알림창- 성공/실패) /   V: /list.do
		}
		else if(path.equals("/detail.do")) {
			System.out.println("detail.do : 상세보기");
			// C:해당번호 상세보기  BDetail(조회수올리기/해당글상세) V:detail.jsp
		}
		else if(path.equals("/edit_view.do")) {
			System.out.println("edit_view.do : 글 수정 폼");
			//  C:해당번호 글수정폼  BEditView(해당글상세) V:edit.jsp
		}
		else if(path.equals("/edit.do")) {
			System.out.println("edit.do : 글 수정 기능");
			//  C:해당번호 글수정기능 BEdit(해당글수정) V: /detail.do
		}
		else if(path.equals("/delete.do")) {
			System.out.println("delete.do : 글 삭제");
			// C:해당번호 글삭제기능 BDelete(해당글삭제)      V: /list.do
		}
		
	}
}
