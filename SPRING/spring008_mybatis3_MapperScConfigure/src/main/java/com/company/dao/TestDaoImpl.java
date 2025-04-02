package com.company.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TestDaoImpl implements TestDao {
	@Autowired private SqlSession sqlSession;
	private static final String namespcae = "com.company.dao.TestDao";
	@Override
	public String curtTime() {
		return sqlSession.selectOne(namespcae+".curtTime");
	}

}
