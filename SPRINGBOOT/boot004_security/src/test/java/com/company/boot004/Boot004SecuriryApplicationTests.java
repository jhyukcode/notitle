package com.company.boot004;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.company.boot004.member.Member;
import com.company.boot004.member.MemberRepository;

@SpringBootTest
class Boot004SecuriryApplicationTests {
	
	@Autowired MemberRepository memberRepository;
	
	@Test @Disabled 
	void insert() {
		Member member = new Member();
		member.setEmail("admin@company.com");
		member.setPassword("1234");
		member.setUsername("ADMIN");
		memberRepository.save(member);
	}
	@Test @Disabled 
	void findAll() {
		List<Member> findAll = memberRepository.findAll();
		System.out.println(findAll);
	}
	@Test @Disabled 
	void findId() {
		System.out.println(memberRepository.findById(1L).get());
	}

	@Test @Disabled 
	void findUsername() {
		System.out.println(memberRepository.findByUsername("ADMIN").get());
	}
	@Test @Disabled
	void update() {
		Member member = new Member();
		member.setUsername("Admin");
		memberRepository.save(member);
	}
	@Test @Disabled 
	void updatePassword() {
		memberRepository.updatePasswordByIdAndPassword(1L, "1234", "1111");
													//(ID, 구암호, 새암호)
	}
	@Test @Disabled 
	void delete() {
		Member member = memberRepository.findById(1L).get();
		memberRepository.delete(null);
	}
}