package com.company.boot003.member;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.company.boot003.board.Board;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity @Getter @Setter @ToString(exclude = "board")
public class Member {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
	private int age;
	@Column(updatable = false, columnDefinition = "datetime(6)" ) private LocalDateTime create_date = LocalDateTime.now();
	@Column(nullable=false, columnDefinition = "varchar(255)" ) private String name;
	@OneToMany(mappedBy = "member") List<Board> board = new ArrayList<>();
	// 유저는 많은 글을 쓸 수 있다
}	
/*
mysql> desc member;
+-------------+--------------+------+-----+---------+----------------+
| Field       | Type         | Null | Key | Default | Extra          |
+-------------+--------------+------+-----+---------+----------------+
| id          | bigint       | NO   | PRI | NULL    | auto_increment |
| age         | int          | NO   |     | NULL    |                |
| create_date | datetime(6)  | YES  |     | NULL    |                |
| name        | varchar(255) | NO   |     | NULL    |                |
+-------------+--------------+------+-----+---------+----------------+
4 rows in set (0.00 sec)
*/
