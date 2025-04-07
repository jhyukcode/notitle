package com.company.controller;

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
	
	@RequestMapping(value="update.user", method=RequestMethod.POST)
	public String update(UserDto dto) {
		if (dto!=null) {service.update(dto);}
		return "redirect:/detail.user";
	}
}
