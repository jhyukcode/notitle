package com.company.boot000.member;
 
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter  @Setter
public class MemberForm { // memberForm	 
	@NotEmpty(message="사용자 ID는 필수 항목입니다.")
	@Size(min=4, max=20)
	private String username;

	@NotEmpty(message="비밀번호 필수 항목입니다.")
	private String password;

	@NotEmpty(message="비밀번호 확인은 항목입니다.")
	private String password2; 
	
	@NotEmpty(message="이메일은 필수 항목입니다.")
	private String email;
	
	@NotEmpty(message="지번은 필수 항목입니다.")
	private String address_jibun;
	
	@NotEmpty(message="도로명은 필수 항목입니다.")
	private String address_road;
	
	@NotEmpty(message="상세주소는 필수 항목입니다.")
	private String address_detail;
}

//https://beanvalidation.org/