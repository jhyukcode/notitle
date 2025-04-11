package com.company.boot000.member;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity @Getter @Setter @ToString
public class Member {
	/* 필수정보 */
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
	@Column(unique=true, nullable = false)private String username;
	@Column(nullable = false)private String password;
	@Column(nullable = false)private String name;
	@Column(updatable = false, nullable = false)private LocalDateTime created_at = LocalDateTime.now();
	@Column(updatable = false,  nullable = false)private LocalDate birthDate; 
	
	/* 선택정보 */
	@Column(nullable = true)private char gender; // 생년월일과 통합
	private String address;
	private String phoneNumber;
}
