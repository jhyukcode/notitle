package spring02_di_ex;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.ioctest.AnimalFarm;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:config/test2.xml")

public class Test002 {
	@Autowired ApplicationContext context;

	@Test
	//@Ignore
	public void test2() {
		AnimalFarm farm = context.getBean("animalFarm", AnimalFarm.class);
		farm.print();
	}
}
