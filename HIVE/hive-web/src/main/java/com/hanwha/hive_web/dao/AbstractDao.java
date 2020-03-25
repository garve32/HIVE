package com.hanwha.hive_web.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AbstractDao {
	
	
	@Autowired
	//private SqlSession sqlSession;
	private SqlSessionTemplate sqlSession;
	
	protected void printQueryId(String queryId) {
		if(log.isDebugEnabled()) {
			log.debug("\t QueryId \t: " + queryId);
		}
	}
	
	public Object insert(String queryId, Object params) {
		printQueryId(queryId);
		return sqlSession.insert(queryId, params);
	}
	
	public Object update(String queryId, Object params) {
		printQueryId(queryId);
		return sqlSession.update(queryId, params);
	}
	
	public Object delete(String queryId, Object params) {
		printQueryId(queryId);
		return sqlSession.delete(queryId, params);
	}
	
	public Object selectOne(String queryId) {
		printQueryId(queryId);
		return sqlSession.selectOne(queryId);
	}
	
	public Object selectOne(String queryId, Object params) {
		printQueryId(queryId);
		return sqlSession.selectOne(queryId, params);
	}
	
	public List<HashMap<String, Object>> selectList(String queryId) {
		printQueryId(queryId);
		log.info("sqlSession=[{}]", sqlSession.getConnection());
		return sqlSession.selectList(queryId);
	}
	
	public List<HashMap<String, Object>> selectList(String queryId, Object params) {
		printQueryId(queryId);
		log.info("sqlSession=[{}]", sqlSession.getConnection());
		return sqlSession.selectList(queryId, params);
	}
	

}
