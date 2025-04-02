package com.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/board")
public class BasicController {
	
	@RequestMapping(value = "/list", method = RequestMethod.GET) 
	public String list() { return "board/list"; }
	
	@RequestMapping(value = "/create", method=RequestMethod.GET) 
	public String create() { return "board/write"; }
	
	@RequestMapping(value = "/create", method=RequestMethod.POST) 
	public String create_post() { return "board/write"; }
	
	@RequestMapping(value = "/detail", method=RequestMethod.GET) 
	public String detail() { return "board/detail"; }
	
	@RequestMapping(value = "/edit", method=RequestMethod.GET) 
	public String edit() { return "board/edit"; }
	
	@RequestMapping(value = "/edit", method=RequestMethod.POST) 
	public String edit_post() { return "board/edit"; }
	
	@RequestMapping(value = "/delete", method=RequestMethod.GET) 
	public String delete() { return "board/delete"; } 
	
	@RequestMapping(value = "/delete", method=RequestMethod.POST) 
	public String delete_post() { return "board/delete"; } 
}

/* ver-2
@Controller
	@RequestMapping("/")
	public String list() { return "board/list"; }
	
	@RequestMapping(value = "/list.do", method = RequestMethod.GET) 
	public String list(Model model) { model.addAttribute("result", "list"); return "board/list"; }
	
	@RequestMapping(value = "/create.do", method=RequestMethod.GET) 
	public String create(Model model) { model.addAttribute("result", "write"); return "board/write"; }
	
	@RequestMapping(value = "/create.do", method=RequestMethod.POST) 
	public String create_post(Model model) { model.addAttribute("result", "write"); return "board/write"; }
	
	@RequestMapping(value = "/detail.do", method=RequestMethod.GET) 
	public String detail(Model model) { model.addAttribute("result", "detail"); return "board/detail"; }
	
	@RequestMapping(value = "/edit.do", method=RequestMethod.GET) 
	public String edit(Model model) { model.addAttribute("result", "edit"); return "board/edit"; }
	
	@RequestMapping(value = "/edit.do", method=RequestMethod.POST) 
	public String edit_post(Model model) { model.addAttribute("result", "edit"); return "board/edit"; }
	
	@RequestMapping(value = "/delete.do", method=RequestMethod.POST) 
	public String delete(Model model) { model.addAttribute("result", "delete"); return "board/delete"; } 
*/


/* ver-1
@Controller
	@RequestMapping("/")
	public String list() { return "board/list"; }
	
	@RequestMapping("/list.do") 
	public String list(Model model) { model.addAttribute("result", "list"); return "board/list"; }
	
	@RequestMapping("/delete.do") 
	public String delete(Model model) { model.addAttribute("result", "delete"); return "board/delete"; }
	
	@RequestMapping("/detail.do") 
	public String detail(Model model) { model.addAttribute("result", "detail"); return "board/detail"; }
	
	@RequestMapping("/edit.do") 
	public String edit(Model model) { model.addAttribute("result", "edit"); return "board/edit"; }
	
	@RequestMapping("/create.do") 
	public String create(Model model) { model.addAttribute("result", "write"); return "board/write"; }
}
*/