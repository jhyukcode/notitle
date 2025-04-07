package com.company.boot001.mymember;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

}

//mysql> desc member;
//+-------------+--------------+------+-----+---------+----------------+
//| Field       | Type         | Null | Key | Default | Extra          |
//+-------------+--------------+------+-----+---------+----------------+
//| id          | bigint       | NO   | PRI | NULL    | auto_increment |
//| age         | int          | NO   |     | NULL    |                |
//| create_date | datetime(6)  | YES  |     | NULL    |                |
//| name        | varchar(255) | NO   |     | NULL    |                |
//+-------------+--------------+------+-----+---------+----------------+
//4 rows in set (0.00 sec)