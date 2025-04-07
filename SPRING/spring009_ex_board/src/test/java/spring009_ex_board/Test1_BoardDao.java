package spring009_ex_board;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.dao.BoardDao;
import com.company.dto.BoardDto;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:config/root-context.xml")
public class Test1_BoardDao {
	
	@Autowired BoardDao dao;
	
	//@Test
	@Ignore
	public void selectAll() {
		System.out.println(dao.selectAll());
	}
	
	@Test
	//@Ignore
	public void selectOne() {
		System.out.println(dao.selectOne(5));
	}
	
	//@Test
	@Ignore
	public void insert() throws UnknownHostException {
		BoardDto dto = new BoardDto();
		dto.setBname("fourth");
		dto.setBpass("4444");
		dto.setBtitle("Notice");
		dto.setBcontent("contents");
		dto.setBip(InetAddress.getLocalHost().getHostAddress());
		System.out.println(dao.insert(dto));
	}
	
	//@Test
	@Ignore
	public void update() {
		BoardDto dto = new BoardDto();
		dto.setBtitle("first_edited");
		dto.setBcontent("Notice_edited");
		dto.setBno(2);
		System.out.println(dao.update(dto));
		System.out.println(dao.selectOne(2));
	}
	
	//@Test
	@Ignore
	public void delete() {
		System.out.println(dao.delete(1));
	}
	
	//@Test
	@Ignore
	public void crudChkAuthor() {
		Scanner sc = new Scanner(System.in);
		BoardDto dto = new BoardDto();
		System.out.println("수정하려는 게시글 번호");
		dto.setBno(sc.nextInt());
		if (dao.selectOne(dto.getBno())!=null) {
			System.out.println("아이디 입력");
			dto.setBname(sc.next());
			System.out.println("비밀번호 입력");
			dto.setBpass(sc.next());
		}	
		
	}
}
