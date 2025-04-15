package com.company.boot000.member;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity @Getter @Setter
public class Member_Status {
	
	@Id private Integer id;
	
	@Column(name="status", nullable=false)private String status;
}
