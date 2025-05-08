package com.company.boot008;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.company.boot008.util7_iddouble.MyUser;
import com.company.boot008.util7_iddouble.MyUserService;

@SpringBootTest
public class Util007_IdDouble {
	
	@Autowired MyUserService myUserService;
	
	@Test void userInsert() {
		MyUser user = new MyUser();
		user.setUsername("first");
		user.setEmail("first@company.com");
		System.out.println(myUserService.insertUser(user));
	}
	
	@Disabled void userSelectEmail() {
		System.out.println(myUserService.selectUseremail("first@company.com"));
	}
	
	@Disabled void userSelectUsername() {
		System.out.println(myUserService.selectUsername("first"));
	}
}
