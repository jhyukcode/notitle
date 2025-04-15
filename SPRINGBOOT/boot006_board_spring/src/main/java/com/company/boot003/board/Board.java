package com.company.boot003.board;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.company.boot003.member.Member;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity @Getter @Setter @ToString
public class Board {
	@Id @GeneratedValue( strategy = GenerationType.IDENTITY ) private Long id;
	@Column( columnDefinition = "text" ) private String bcontent;
	@Column( columnDefinition = "varchar(255)" ) private String bfile;
	private Long bhit=0L;
	@Column( columnDefinition = "varchar(255)" ) private String bip;
	@Column( columnDefinition = "varchar(255)" ) private String bpass;
	@Column( columnDefinition = "varchar(200)" ) private String btitle;
	@Column( updatable = false, columnDefinition = "datetime(6)" ) private LocalDateTime create_date = LocalDateTime.now();
	@ManyToOne @JoinColumn(name="MEMBER_ID") private Member member;
}
/*
mysql> desc board;
+-------------+--------------+------+-----+---------+----------------+
| Field       | Type         | Null | Key | Default | Extra          |
+-------------+--------------+------+-----+---------+----------------+
| id          | bigint       | NO   | PRI | NULL    | auto_increment |
| bcontent    | text         | YES  |     | NULL    |                |
| bfile       | varchar(255) | YES  |     | NULL    |                |
| bhit        | bigint       | YES  |     | NULL    |                |
| bip         | varchar(255) | YES  |     | NULL    |                |
| bpass       | varchar(255) | YES  |     | NULL    |                |
| btitle      | varchar(200) | YES  |     | NULL    |                |
| create_date | datetime(6)  | YES  |     | NULL    |                |
| member_id   | bigint       | YES  | MUL | NULL    |                |
+-------------+--------------+------+-----+---------+----------------+
9 rows in set (0.00 sec)
*/