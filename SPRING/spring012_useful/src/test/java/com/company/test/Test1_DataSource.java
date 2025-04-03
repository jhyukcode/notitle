package com.company.test;

import javax.sql.DataSource;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.dao.TestDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:config/root-context.xml")
public class Test1_DataSource {

		@Autowired ApplicationContext context;
		@Autowired DataSource ds;
		@Autowired TestDao dao;
		
		@Ignore public void test1() { System.out.println(ds); }
		@Test public void time1() { System.out.println(dao.readTime()); }
}
