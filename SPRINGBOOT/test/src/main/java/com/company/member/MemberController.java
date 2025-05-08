package com.company.member;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MemberController {
	
	@Autowired MemberService ms;
	@Autowired MemberRepository mR;

	@GetMapping("/member/login")
	public String login() {
		return "member/login"; 
	}
	
	
	
	
	@GetMapping("/member/register")
	public String register(Model model) {
		model.addAttribute("memberForm", new MemberForm());
		return "member/register";
	}
	
	@PostMapping("/member/register")
	public String register_post(@Valid MemberForm mF, BindingResult bR) {
		if(bR.hasErrors()) { return "member/register"; }
		if( !mF.getPassword().equals(  mF.getPassword2()) ) {
			bR.rejectValue("password2", "pawordInCorrect","비밀번호를 확인해주세요");
			return "member/register"; }
		
		try {
			Member member = new Member();
			member.setEmail(mF.getEmail());
			member.setPassword(mF.getPassword());
			member.setUsername(mF.getUsername());
			ms.insert(member);
		} catch(DataIntegrityViolationException e) {
			e.printStackTrace();
			bR.reject("failed" , "정보를 다시 확인해주세요");
			return "member/join"; 
		} catch(Exception e) {
			e.printStackTrace();
			bR.reject("failed" , e.getMessage());
			return "member/join"; 
		}
		return "redirect:/member/login";
	}
	
	@ResponseBody
	@GetMapping("/member/register/reduplicationEmail/{email}")
	public Map<String, Object> reduplicationEmailCheck(@PathVariable String email) {
	    Map<String, Object> resultEmail = new HashMap<>();
	    
	    boolean exists = mR.findByEmail(email).isPresent();

	    resultEmail.put("resultEmail", exists ? "사용불가" : "사용가능");
	    return resultEmail;
	}
}
