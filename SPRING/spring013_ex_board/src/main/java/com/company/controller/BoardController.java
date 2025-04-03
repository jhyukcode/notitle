package com.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.company.dto.BoardDto;
import com.company.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
	@Autowired BoardService service;
	
	
	// 전체리스트 가져오기
	@RequestMapping(value ="/list" , method=RequestMethod.GET)
	public String list(Model model) { 
		model.addAttribute("list", service.selectAll());
		return "board/list";}
	
	// 글쓰기 화면
	@RequestMapping(value="/create" , method=RequestMethod.GET)
	public String create() {  return "board/write";}
	
	// 글쓰기 기능
	@RequestMapping(value="/create" , method=RequestMethod.POST)
	public String create_post(BoardDto dto) {
		if(dto!=null) { service.insert(dto); }
		return "redirect:/board/list";
		}
	
	// 글상세보기
	@RequestMapping(value="/detail", method=RequestMethod.GET)
	public String detail(Model model, int bno) {
		model.addAttribute("dto", service.detail(bno));
		return "board/detail";
		}
	
	// 글 수정하기 폼
	@RequestMapping(value = "/edit" , method = RequestMethod.GET)
	public String edit(Model model, int bno) {
		model.addAttribute("dto", service.updateForm(bno));
		return "board/edit";
		}
	
	// 글 수정 기능
	@RequestMapping(value = "/edit" , method = RequestMethod.POST)
	public String edit_post(BoardDto dto) {
		if(dto!=null) {service.update(dto);}
		return "redirect:/board/detail?="+dto.getBno();
		}
	
	// 글 삭제 폼
	@RequestMapping(value="/delete" , method=RequestMethod.GET)
	public String delete() {  return "board/delete";}
	
	// 글 삭제 기능
	@RequestMapping(value="/delete" , method=RequestMethod.POST)
	public String delete_post(BoardDto dto) {
		if(dto!=null) { service.delete(dto);}
		return "redirect:/board/list";}
	
	
}
//http://localhost:8081/spring011_ex_board/board/list
//http://localhost:8081/spring011_ex_board/board/create
//http://localhost:8081/spring011_ex_board/board/detail
//http://localhost:8081/spring011_ex_board/board/edit
//http://localhost:8081/spring011_ex_board/board/delete

/*  ver-1
@Controller
public class BoardController {
	@RequestMapping(value ="/board/list" , method=RequestMethod.GET)
	public String list() {  return "board/list";}
	
	@RequestMapping(value="/board/create" , method=RequestMethod.GET)
	public String create() {  return "board/write";}
	
	@RequestMapping(value="/board/create" , method=RequestMethod.POST)
	public String create_post() {  return "board/write";}
	
	@RequestMapping(value="/board/detail", method=RequestMethod.GET)
	public String detail() {  return "board/detail";}
	
	@RequestMapping(value = "/board/edit" , method = RequestMethod.GET)
	public String edit() {  return "board/edit";}
	
	@RequestMapping(value = "/board/edit" , method = RequestMethod.POST)
	public String edit_post() {  return "board/edit";}
	
	@RequestMapping(value="/board/delete" , method=RequestMethod.GET)
	public String delete() {  return "board/delete";}
	
	@RequestMapping(value="/board/delete" , method=RequestMethod.POST)
	public String delete_post() {  return "board/delete";}
}
*/



/*
/board/list        �넂    board/list.jsp   
/board/create   �넂    board/write.jsp   
/board/detail    �넂    board/detail.jsp   
/board/edit      �넂    board/edit.jsp   
/board/delete   �넂    board/delete.jsp   
*/