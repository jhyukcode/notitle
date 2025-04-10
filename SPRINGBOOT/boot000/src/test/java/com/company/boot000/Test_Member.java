package com.company.boot000;

import java.time.LocalDate;

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
}
