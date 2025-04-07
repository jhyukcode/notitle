package com.company.boot001.dto;

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
	      model.addAttribute("test","hello");
	      return "test2";
	   }
	
	@RequestMapping("/test3") // < 실제주소 : localhost:8181/boot1/test3
	   public String ex3() { return "test3"; } // < 띄울 내용
	
}