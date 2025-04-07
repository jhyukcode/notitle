package com.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class BasicController {
	@RequestMapping("/") 
	public String basic() { return "home"; }
	
	@RequestMapping("/basic1.do") 
	public String basic1(Model model) { 
		// 1. 처리하고
		model.addAttribute("result", "harry");
		//return "basic1.jsp"; // 2. 경로
		return "basic1"; // prefix[/] basic1 suffix .jsp
		}	
}
