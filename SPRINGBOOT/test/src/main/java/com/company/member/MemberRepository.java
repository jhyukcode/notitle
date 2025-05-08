package com.company.member;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MemberRepository extends JpaRepository<Member, Long> {

	
	@Query("select m from Member m where m.email=:email")
	Optional<Member> findByMemberId(String email);
	
	@Query("select m from Member m where m.email=:email")
	Optional<Member> findByEmail(String email);	
	
}
