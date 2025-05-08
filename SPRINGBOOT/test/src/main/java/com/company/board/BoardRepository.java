package com.company.board;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface BoardRepository extends JpaRepository<Board, Long> {

	/* 내림차순 */
	@Query("select b from Board b order by b.id asc")
	List<Board> selectAsc();
	
	/* id와 pass 일치 시 삭제 */
	@Transactional @Modifying
	@Query("delete from Board b where b.id=:id and b.bpass=:bpass")
	void deleteByIdAndPass(Long id, String bpass);
	
	/* id와 pass 일치 시 title content 수정 */
	@Transactional @Modifying
	@Query("update Board b set b.btitle=:btitle, b.bcontent=:bcontent where b.id=:id and b.bpass=:bpass")
	void updateTitleContent(String btitle, String bcontent, Long id, String bpass);
	
	@Query("select b from Board b order by b.id desc")
	List<Board> selectDesc();
	
	@Query("select b from Board b where b.id=:id and b.bpass=:bpass")
	List<Board> findOne(Long id, String bpass);
	
	@Transactional @Modifying
	@Query("delete from Board b where b.id=:id")
	void deleteById(Long id);
	
	@Transactional @Modifying
	@Query("update Board b set b.btitle=:btitle, b.bcontent=:bcontent where b.id=:id")
	void updateTitleContent(String btitle, String bcontent, Long id);
	
}
