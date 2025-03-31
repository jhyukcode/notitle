package spring02_di_ex;

import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.ioctest.AnimalFarm;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:config/test1.xml")
public class Test001 {
	@Autowired ApplicationContext context;
	
	//@Test
	@Ignore
	public void test1() {
		//AnimalFarm farm = context.getBean("animalFarm", AnimalFarm.class);
		AnimalFarm cat = (AnimalFarm) context.getBean("animalFarm");
		//java파일 변수 = (자바파일) context.getBean("id값");
		cat.print();
	}
	
}
