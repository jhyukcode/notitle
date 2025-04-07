package com.company.boot001.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Data
@Getter
@Setter
@NoArgsConstructor
@ToString

public class UserDto {
	
	private int age;
	private String name;
	
}
// com.'회사명'.'프로젝트'.'개발단위' - @Controller / @Servlet / @DB관련