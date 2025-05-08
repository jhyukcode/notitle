package com.company.boot008.util7_iddouble;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MyUserRepository extends JpaRepository<MyUser, Long> {
	
	@Query("select m from MyUser m where m.username=:username")
	Optional<MyUser> findByUsername(String username);
	
	@Query("select m from MyUser m where m.email=:email")
	Optional<MyUser> findByEmail(String email);	
	}

