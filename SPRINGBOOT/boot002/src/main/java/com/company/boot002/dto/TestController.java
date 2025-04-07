package com.company.boot002.dto;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@RequestMapping("/test1")
	@ResponseBody
	public String ex1() { return "springboot"; }
	
	@RequestMapping("/test2")
	   public String ex2(Model model) {
	      model.addAttribute("result","hello");
	      return "test2";
	   }
	
	@RequestMapping("/test")
		public String ex3() { return "test"; }
}
