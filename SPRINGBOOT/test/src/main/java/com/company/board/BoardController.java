package com.company.board;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class BoardController {
	
	private final BoardService service;

	/* 보드 전체 리스트 가져오기 */
	@GetMapping("/board/list")
	public String list(Model model) {
		model.addAttribute("list", service.selectDesc());
		return "board/list";
	}
	/* 게시글 상세보기 */
	@GetMapping("/board/detail/{id}")
	public String detail(@PathVariable Long id, Model model) {
		model.addAttribute("detail", service.select(id));
		return "board/detail";
	}
	/* 게시글 작성 폼 */
	@GetMapping("/board/insert")
	public String write() {
		return "board/write";
	}
	/* 게시글 작성 기능 */
	@PostMapping("/board/insert")
	public String write_post(Board board) {
		service.insert(board);
		return "redirect:/board/list"; 
	}
	/* 게시글 수정 폼 */
	@GetMapping("/board/update/{id}")
	public String update(@PathVariable Long id, Model model) {
		model.addAttribute("edit", service.select(id));
		return "board/edit";
	}
	/* 게시글 수정 기능 */
	@PostMapping("/board/update")
	public String update_post(@ModelAttribute Board board) {
		service.update(board.getId(), board.getBpass(), board.getBtitle(), board.getBcontent());
		return "redirect:/board/detail/"+board.getId();
	}
	/* 게시글 삭제 폼 */
	@GetMapping("/board/delete/{id}")
	public String delete(@PathVariable Long id, Model model) {
		model.addAttribute("delete", service.select(id));
		return "board/delete";
	}
	/* 게시글 삭제 기능 */
	@PostMapping("/board/delete")
	public String delete_post(Board board) {
		service.delete(board.getId(), board.getBpass());
		return "redirect:/board/list";
	}
}
