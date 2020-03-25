package com.hanwha.hive_web.sample.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.support.RequestContext;

import com.hanwha.hive_web.dao.AbstractDao;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository("helloMapper")
public class HelloMapper extends AbstractDao{
	
	public List<HashMap<String, Object>> selectName(Map<String, Object> dsIn) {
		//return selectList("helloMapper.selectName", dsIn);
		//log.info("RequestContext=[{}]", HttpServletRequest);
		return selectList("com.hanwha.hive_web.sample.mapper.HelloMapper.selectName", dsIn);
	}
}

/*
@Mapper
public interface HelloMapper {
	
	// 샘플목록조회
	List<HashMap<String, Object>> selectName(Map<String, Object> dsIn);
	
	// 샘플 그리드 인서트
	void insertUserTest(Map<String, Object> dsIn);

	// 샘플 그리드 업데이트
	void updateUserTest(Map<String, Object> dsIn);
	
	// 샘플 그리드 딜리트
	void deleteUserTest(Map<String, Object> dsIn);
}
*/