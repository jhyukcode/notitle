package com.company.member;

import java.time.LocalDateTime;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity @Getter @Setter
public class Member {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String email;
	private String password;
	private LocalDateTime udate = LocalDateTime.now();
	private String username;
	private LocalDateTime create_date = LocalDateTime.now();
	
}
/*
mysql> desc member;
+-------------+--------------+------+-----+---------+----------------+
| Field       | Type         | Null | Key | Default | Extra          |
+-------------+--------------+------+-----+---------+----------------+
| id          | bigint       | NO   | PRI | NULL    | auto_increment |
| email       | varchar(255) | YES  | UNI | NULL    |                |
| password    | varchar(255) | YES  |     | NULL    |                |
| udate       | datetime(6)  | YES  |     | NULL    |                |
| username    | varchar(255) | YES  | UNI | NULL    |                |
| create_date | datetime(6)  | YES  |     | NULL    |                |
+-------------+--------------+------+-----+---------+----------------+
8 rows in set (0.00 sec)
*/