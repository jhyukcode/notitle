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
		// 1. ó���ϰ�
		model.addAttribute("result", "harry");
		//return "basic1.jsp"; // 2. ���
		return "basic1"; // prefix[/] basic1 suffix .jsp
		}	
}
