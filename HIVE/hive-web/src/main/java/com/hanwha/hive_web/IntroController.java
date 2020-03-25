package com.hanwha.hive_web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hanwha.hive_web.dao.AbstractDao;

@RestController
public class IntroController extends AbstractDao{
	
	@RequestMapping("/")
	public String intro() throws Exception {
		Map<String, Object> dsIn = new HashMap<String, Object>();
		dsIn.put("searchKeyword", "garve32");
		selectList("com.hanwha.hive_web.sample.mapper.HelloMapper.selectName", dsIn);
		return "intro";
	}
	
	
}
