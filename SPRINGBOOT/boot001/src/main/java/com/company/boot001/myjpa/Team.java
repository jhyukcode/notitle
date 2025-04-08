package com.company.boot001.myjpa;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.company.boot001.mymember.Member;

import lombok.Getter;
import lombok.Setter;

@Entity @Getter @Setter
public class Team {
	@Id //1. 기본키(PK)
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 숫자자동증가(AI)
	private Long id;
	
	private String name;
	
	@Column( updatable = false ) // 수정불가(초기값불변)
	private LocalDateTime createDate = LocalDateTime.now();
	
	//@Transient // 컬럼인식불가
	//private String email;
	
	// mappedBy : 주인, 부모 | 부모가 있으면 참조할 수 있게 -> 자식
	@OneToMany(mappedBy = "team" , cascade = CascadeType.REMOVE)
	List<Member> member = new ArrayList<>();
}
