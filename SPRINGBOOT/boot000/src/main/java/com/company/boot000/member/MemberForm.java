package com.company.boot000.member;
 
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter  @Setter
public class MemberForm { // memberForm	 
	@NotEmpty(message="이메일 필수 항목입니다.")
	@Size(min=4, max=20)
	private String username;

	@NotEmpty(message="비밀번호 필수 항목입니다.")
	private String password;

	@NotEmpty(message="비밀번호 확인은 항목입니다.")
	private String password2; 
	
	@NotEmpty(message="이름 항목입니다.")
	private String name;
}

//https://beanvalidation.org/