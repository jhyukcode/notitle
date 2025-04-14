package com.company.boot000.member;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity  @Getter  @Setter
public class Member {
	// DB id
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	// 계정 정보
	@Column(unique=true, name="member_id", nullable=false) private String memberId; // 아이디
	@Column(name="member_pass", nullable=false) private String memberPass; 			// 비밀번호
	
	// 사용자 정보
	@Column(unique=true) private String email; 			// 이메일
	@Column(nullable=false) private String realName;	// 실명
	private String displayName;							// 표시되는 이름
	private String phoneNumber;							// 휴대전화
	private LocalDate birthDate;						// 생년월일
	private char gender;								// 성별
	
	// 사용자 실주소
	@Column(name="address_road")private String addressRoad; 	// 도로명
	@Column(name="address_jibun")private String addressJibun;	// 지번
	@Column(name="address_detail")private String addressDetail;	// 상세
	
	// 자동 입력
	@Column(name="member_role")private String memberRole = "MEMBER";										// 회원구분:멤버
	@Column(name="member_warning")private Integer memberWarning = 0;										// 회원경고:0
	@Column(name="member_join_date")private LocalDate memberJoinDate = LocalDate.now();	// 생성일
	

}