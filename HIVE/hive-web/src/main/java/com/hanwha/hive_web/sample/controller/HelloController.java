package com.hanwha.hive_web.sample.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hanwha.hive_web.sample.service.HelloService;
import com.nexacro.uiadapter17.spring.core.annotation.ParamDataSet;
import com.nexacro.uiadapter17.spring.core.data.NexacroResult;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HelloController {
	
	@Autowired
	private HelloService service;
	
	@RequestMapping("/test.do")
	public NexacroResult test(@ParamDataSet(name = "dsSearch") Map<String, Object> dsIn, Pageable pageable) throws Exception {
		log.info("dsSearch=[{}]", dsIn);
		List<HashMap<String,Object>> name = service.selectName(dsIn);
		NexacroResult result = new NexacroResult();
		result.addDataSet("output1", name);
		return result;
	}
	
	@RequestMapping("/updateSampleDataWithMap.do")
	public NexacroResult updateSampleDataWithMap(@ParamDataSet(name = "input1") List<Map<String, Object>> dsIn) throws Exception {
		log.info("dsList=[{}]", dsIn);
		service.updateSampleDataWithMap(dsIn);
		NexacroResult result = new NexacroResult();
		return result;
	}

	
}
