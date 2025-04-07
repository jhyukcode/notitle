package com.company.boot001;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.company.boot001.myjpa.Team;
import com.company.boot001.myjpa.TeamRepository;

@SpringBootTest
class Test001_Team {
	@Autowired TeamRepository teamRepository;
	
	// teamRepository.save (insert, update) / teamRepository.delete (delete)
	// teamRepository.findAll (select) /  teamRepository.findById (select)
	
	@Test void insert() {
		Team team = new Team();
		team.setName("avengers");
		teamRepository.save(team);
	}

	@Disabled void selectAll() {
		List<Team> list = teamRepository.findAll();
		System.out.println(list.size());			// 3
		System.out.println(list.get(0).getName());	// milk
	}
	
	@Disabled void update() {
		// 1. 수정할 팀 찾기
		// Optioanl<Team> : null 값 안전보장
		Optional<Team> findTeam = teamRepository.findById(1L);
		System.out.println(findTeam.isPresent());	// true
		
		// 2. 이름 변경해서 수정
		Team team = findTeam.get();
		team.setName("car");
		teamRepository.save(team);
	}
	
	@Disabled void delete() {
		Optional<Team> findTeam = teamRepository.findById(3L);
		System.out.println(findTeam.isPresent());
		Team team = findTeam.get();
		teamRepository.delete(team);
		
	}
}

/*
 * crud1. insert into team (name) values (' ') 
 * curd2. select * from team / select * from team where id=?
 * curd3. update team set name=? where id=? 
 * curd4. delete from team where id=?
 */