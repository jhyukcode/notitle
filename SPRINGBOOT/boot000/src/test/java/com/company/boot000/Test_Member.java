package com.company.boot000;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.company.boot000.member.Member;
import com.company.boot000.member.MemberRepository;

@SpringBootTest
public class Test_Member {
	
	@Autowired MemberRepository memberRepository;
	
	@Disabled @Test
	void insert() {
		Member member = new Member();
		/*필수입력*/
		member.setEmail("admin@company.com");
		member.setPassword("1234");
		member.setUsername("admin");
		member.setBirthDate(LocalDate.parse("2001-09-01"));
		/*선택입력*/
		member.setGender('0');
		member.setPhoneNumber(null);
		member.setAddress(null);
		memberRepository.save(member);
	}
	
	@Disabled @Test
	void selectAll() {
		List<Member> member = new ArrayList<>();
		member = memberRepository.findAll();
		System.out.println(member);
	}
	
	@Test
	void selectOne() {
		Optional<Member> member = memberRepository.findById(2L);
		if(member.isPresent()) {
			System.out.println(member);
		} else { System.out.println("NOT FOUND"); }
	}
	
	@Disabled
	void update() {
		Optional<Member> member = memberRepository.findById(1L);
		if(member.isPresent()) {
//			Member find = member;
		}
	}
}
