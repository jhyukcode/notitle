package com.company.board;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.company.member.Member;

import lombok.Getter;
import lombok.Setter;

@Entity @Getter @Setter
public class Board {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	private String btitle;
	private String bcontent;
	private String bpass;
	private Long bhit = 0L;
	private LocalDateTime create_date = LocalDateTime.now();
	private String bip;
	
	@ManyToOne(fetch = FetchType.LAZY) @JoinColumn(name = "member_id")
	private Member member;
}

/*
mysql> desc board;
+-------------+--------------+------+-----+---------+----------------+
| Field       | Type         | Null | Key | Default | Extra          |
+-------------+--------------+------+-----+---------+----------------+
| id          | bigint       | NO   | PRI | NULL    | auto_increment |
| btitle      | varchar(200) | YES  |     | NULL    |                |
| bcontent    | text         | YES  |     | NULL    |                |
| bpass       | varchar(255) | YES  |     | NULL    |                |
| bhit        | bigint       | YES  |     | NULL    |                |
| create_date | datetime(6)  | YES  |     | NULL    |                |
| bip         | varchar(255) | YES  |     | NULL    |                |
+-------------+--------------+------+-----+---------+----------------+
*/