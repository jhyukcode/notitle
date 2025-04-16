package com.company.boot003.member;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface MemberRepository extends JpaRepository<Member, Long> {
	
	@Transactional  
	@Query("select * from Member m where m.name=?")
	void findByUsername(String name);
	
}
