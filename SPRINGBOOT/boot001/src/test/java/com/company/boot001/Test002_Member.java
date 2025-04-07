package com.company.boot001;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.company.boot001.myjpa.Team;
import com.company.boot001.mymember.Member;
import com.company.boot001.mymember.MemberRepository;

@SpringBootTest
public class Test002_Member {
	@Autowired MemberRepository memberRepository;
	
	@Disabled void insert() {
		Team team = new Team();
		team.setId(1L);					//##1 > team의 id가 존재하지 않으면 오류
		
		Member member = new Member();
		member.setName("second");
		member.setAge(22);
		member.setTeam(team);			//##2
		memberRepository.save(member);	//## insert, update - save
		//  insert into member (age, create_date, name, team_id) values (?, ?, ?, ?)
	}
	
	// Q2. findAll 이용하여 모든 유저 출력
	@Test void selectAll() {
		List<Member> list = memberRepository.findAll();
		//System.out.println(list.size());
		//System.out.println(list.toString());
		for(Member m: list) { System.out.println(m); }
	}
	
	// Q3. update 이용하여 유저번호가 1L인 데이터값 수정
	@Disabled void update() {
		Optional<Member> findMember = memberRepository.findById(1L);
		//System.out.println(findMember.isPresent());
		if (findMember.isPresent()) {
			Member member = findMember.get();
			member.setName("one");
			member.setAge(1);
			memberRepository.save(member);
			System.out.println("Updated");
		} else System.out.println("Not found");
	}
	
	// Q4. delete 이용하여 1L 유저 삭제
	@Disabled void delete() {
		Optional<Member> findMember = memberRepository.findById(1L);
		//System.out.println(findMember.isPresent());
		if (findMember.isPresent()) {
			Member member = findMember.get();
			memberRepository.delete(member);
			System.out.println("Deleted");
		} else System.out.println("Not found");
	}
}
