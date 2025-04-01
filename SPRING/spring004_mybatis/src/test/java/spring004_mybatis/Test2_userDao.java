package spring004_mybatis;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.dao.UserDao;
import com.company.dto.UserDto;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:config/root-context.xml")
public class Test2_userDao {
	@Autowired UserDao dao;
	
	//@Test
	@Ignore
	public void selectAll() {
		System.out.println(dao.selectAll());
	}
	
	@Test
	//@Ignore
	public void selectOne() {
		UserDto dto = new UserDto();
		dto.setNo(1);
		System.out.println(dao.selectOne(1));
	}
	
	//@Test
	@Ignore
	public void insert() {
		UserDto dto = new UserDto();
		dto.setName("fourth");
		dto.setAge(44);
		System.out.println(dao.insert(dto));
	}
	
	//@Test
	@Ignore
	public void update() {
		UserDto dto = new UserDto();
		dto.setName("fifth");
		dto.setAge(55);
		dto.setNo(4);
		System.out.println(dao.update(dto));
	}
	
	//@Test
	@Ignore
	public void delete() {
		UserDto dto = new UserDto();
		dto.setNo(4);
		System.out.println(dao.delete(4));
	}
}
