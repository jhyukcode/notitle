package com.company.boot004.member;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface MemberRepository extends JpaRepository<Member, Long> {
	Optional<Member> findByUsername(String username);
	
	// 아이디를 이용해서 유저 이름 가져오기
	@Query("select m.username from Member m where id=:id")
	void findUsernameById(String id);
	
	// 아이디와 비밀번호를 대조하여 새 비밀번호로 바꾸기
	@Modifying @Transactional
	@Query("update Member m set m.password=:password where m.id=:id and m.password=:old")
	int updatePasswordByIdAndPassword(long id, String old, String password);
	
}
/*
+----------+--------------+------+-----+---------+----------------+
| Field    | Type         | Null | Key | Default | Extra          |
+----------+--------------+------+-----+---------+----------------+
| id       | bigint       | NO   | PRI | NULL    | auto_increment |
| email    | varchar(255) | YES  | UNI | NULL    |                |
| password | varchar(255) | YES  |     | NULL    |                |
| udate    | datetime(6)  | YES  |     | NULL    |                |
| username | varchar(255) | YES  | UNI | NULL    |                |
+----------+--------------+------+-----+---------+----------------+
Q1 crud sql 구문 적기

select * from member
select * from member where id=?

insert into member (email, password, username) values (?, ?, ?)

update member set email=? where id=?
update member set password=? where id=?
update member set username=? where id=?

delete from member where id=?

Q2 @Query 아이디(email)와 비밀번호가 같은 유저의 비밀번호 변경
	@Modyfying @Transactional @Query
*/