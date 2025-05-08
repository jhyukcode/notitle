package com.company.member;


import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MemberForm {

	@NotEmpty(message="아이디는 필수 입력입니다")
	private String username;
	
	@NotEmpty(message="비밀번호를 입력하지 않았습니다")
	private String password;
	
	@NotEmpty(message="비밀번호 확인란을 입력하지 않았습니다")
	private String password2;
	
	@NotEmpty(message="이메일을 입력하지 않았습니다")
	private String email;
}
