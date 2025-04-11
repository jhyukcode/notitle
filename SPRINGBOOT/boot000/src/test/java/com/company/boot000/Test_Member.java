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
	
	 @Test
	void insert() {
		Member member = new Member();
		/*필수입력*/
		member.setUsername("member@company.com");
		member.setPassword("1234");
		member.setName("member");
		member.setBirthDate(LocalDate.parse("2001-09-01"));
		/*선택입력*/
		member.setGender('0');
		member.setPhoneNumber(null);
		member.setAddress(null);
		memberRepository.save(member);
	}
	
	@Disabled @Test
	void selectAll() {
		List<Member> list = new ArrayList<>();
		list = memberRepository.findAll();
		System.out.println(list);
	}
	
	@Disabled @Test
	void selectOne() {
		Optional<Member> list = memberRepository.findById(2L);
		if(list.isPresent()) {
			System.out.println(list);
		} else { System.out.println("NOT FOUND"); }
	}
	
	@Disabled @Test
	void update() {
		Member member = memberRepository.findById(1L).get();
		member.setGender('M');
		memberRepository.save(member);
	}
	
	@Disabled
	void delete() {
		Member member = memberRepository.findById(1L).get();
		memberRepository.delete(member);
	}
	
}
