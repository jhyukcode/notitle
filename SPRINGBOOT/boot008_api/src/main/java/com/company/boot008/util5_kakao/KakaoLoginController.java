package com.company.boot008.util5_kakao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class KakaoLoginController {
	@Autowired KakaoLogin api;
	
	@GetMapping("/kakao")
	public String login(Model model) {
		model.addAttribute("url", api.step1());
		return "login";
	}
	
	@GetMapping("/kkao")
	public String loginuser(String code, Model model) {
		try{
		api.step2(code);
		} catch ( Exception e) { e.printStackTrace() ;}
		return "login";
	}
	/*
	@GetMapping("/kakao")
	public String loginuser(@RequestParam("code") String code, Model model) {
		List<String>
		return "";
	}
	*/
}
