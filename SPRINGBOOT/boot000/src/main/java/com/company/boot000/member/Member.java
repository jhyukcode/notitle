package com.company.boot000.member;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity  @Getter  @Setter
public class Member {
	// DB 순번
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	// 회원 계정 정보
	@Column(unique=true)
	private String username; // 아이디
	private String password; // 비밀번호
	@Column(unique=true) private String email; // 이메일
	private Integer member_warning; // 패널티 횟수
	
	private char member_tier; // 멤버 관리자/일반 구분
	
	// 가입자 주소 정보
	private String address_road; 	// 도로명
	private String address_jibun;	// 지번
	private String address_detail;	// 상세
	
	
	@Column(updatable = false)
	private LocalDateTime member_join_date = LocalDateTime.now(); // 회원가입일
	
	

}