package com.company.contorller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.company.dto.UserDto;
import com.company.service.UserService;

@Controller
public class UserController {
	@Autowired UserService service;

	//@RequestMapping(value="/list.user", method=Requestmethod.GET)
	@RequestMapping("list.user")
	public String list(Model model) {
		model.addAttribute("list", service.selectAll());
		return "user/list";
	}
	
	@RequestMapping("detail.user")
	public String detail(Model model, int no) {
		//System.out.println(no);
		model.addAttribute("dto", service.selectOne(no));
		return "user/select";
	}
	
	@RequestMapping(value="insert.user", method=RequestMethod.POST)
	public String insert(UserDto dto) {			// UserDto 내부 속성이 name, age
		if (dto!=null) {service.insert(dto);}
		return "redirect:/list.user";
	}
	
	@RequestMapping(value="update.user", method=RequestMethod.POST)
	public String update(UserDto dto) {
		if (dto!=null) {service.update(dto);}
		return "redirect:/list.user";
	}
	
	@RequestMapping("delete.user")
	public String delete(int no) {
		service.delete(no);
		return "redirect:list.user";
	}
	// detail.user - get
	// update.user - post
	// insert.user - post
	// delete.user - get
}
