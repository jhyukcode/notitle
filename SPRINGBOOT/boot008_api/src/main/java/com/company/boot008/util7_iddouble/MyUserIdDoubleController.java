package com.company.boot008.util7_iddouble;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyUserIdDoubleController {

	@Autowired MyUserService service;
	
	@GetMapping("/iddouble") 
	public String main() { return "iddouble";}
	
	@GetMapping(value="/idByUsername/{username}", produces="application/json; charset=UTF-8")
	@ResponseBody
	public Map<String, Object> idByUsername(@PathVariable String username) {
		Map<String, Object> result = new HashMap<>();
		String msg="사용불가";
		try {
			service.selectUsername(username);
		} catch (Exception e) {msg="사용가능";}
		result.put("result", msg);
		return result;
	}
}
