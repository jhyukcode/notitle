package com.company.boot003;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.company.boot003.member.Member;
import com.company.boot003.member.MemberRepository;

@SpringBootTest
public class Test_Member {

	@Autowired MemberRepository memberRepository;
	
	@Disabled void insert() {
		Member member = new Member();
		member.setName("third");
		member.setAge(33);
		memberRepository.save(member);
	}
	
	@Disabled void selectAll() {
		List<Member> list = memberRepository.findAll();
		for(Member m:list) {
			System.out.println(m);
		}
	}
	
	@Disabled void selectOne() {
		Optional<Member> list = memberRepository.findById(1L);
		if(list.isPresent()) {
			System.out.println(list);
		} else { System.out.println("Not found"); }
	}
	
	@Disabled void update() {
		Optional<Member> list = memberRepository.findById(1L);
		if(list.isPresent()) {
			Member member = list.get();
			member.setAge(1);
			member.setName("one");
			memberRepository.save(member);
			System.out.println("Updated");
		} else { System.out.println("Not found"); }
	}
	
	@Test void delete() {
		Optional<Member> list = memberRepository.findById(3L);
		if(list.isPresent()) {
			Member member = list.get();
			memberRepository.delete(member);
			System.out.println("Deleted");
		} else { System.out.println("Not found"); }
	}
}
// insert into member (age, name, create_date) values (?, ?, ?)
// select * from member
// select * from member where id=?
// update member set name=? age=? where id=?