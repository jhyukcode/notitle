package com.company.boot001.mymember;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.company.boot001.myjpa.Team;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity @Getter @Setter @ToString
public class Member {
	@Id	// PK
	@GeneratedValue(strategy = GenerationType.IDENTITY)	// AI
	private Long id;
	
	// name="USERNAME" 필드명 수정, NOT NULL 설정
	//@Column(name="USERNAME", nullable=false) // @Trasient 인식안되게함
	@Column(nullable=false)
	private String name;
	
	@Column(nullable=false)
	private Integer age;
	
	private LocalDateTime create_date = LocalDateTime.now();
	
	@ManyToOne
	private Team team; // 멤버는 하나의 팀을 가진다
	// team_id 컬럼 자동 생성됨
}
/*
	관계1
	팀(avgengers) 은 많은 멤버(iron, captain,..)를 가진다
	멤버는 하나의 팀을 가진다

	team -|-∈ member





*/