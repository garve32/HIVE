package com.hanwha.hive_web.sample.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hanwha.hive_web.sample.mapper.HelloMapper;
import com.nexacro.uiadapter17.spring.core.data.DataSetRowTypeAccessor;
import com.nexacro17.xapi.data.DataSet;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@Transactional
public class HelloService {
	
	@Autowired
	private HelloMapper helloMapper;
	
	/**
	 * @param dsIn
	 * @return
	 * @throws Exception
	 */
	public List<HashMap<String,Object>> selectName(Map<String, Object> dsIn) throws Exception {
		return helloMapper.selectName(dsIn);
	}
	/**
	 * @param dsIn
	 * @throws Exception
	 */
	public void updateSampleDataWithMap(List<Map<String, Object>> dsIn) throws Exception {
		log.info("service dsIn=[{}]", dsIn);
		
		int size = dsIn.size();
//		for(int i=0; i<size; i++) {
//			Map<String, Object> dsInRow = dsIn.get(i);
//			// 테스트로  필수인풋 강제할당
//			dsInRow.put("USER_ENG_NM", "test");
//			dsInRow.put("GENDER_CD", "M");
//			dsInRow.put("INSERT_UID", "garve32");
//			dsInRow.put("UPDATE_UID", "garve32");
//			//
//			int rowType = (int) dsInRow.get("DataSetRowType");
//				log.info("service dsInRow=[{}]", dsInRow);
//				log.info("service getRowType()=[{}]", rowType);
//				if(rowType == DataSet.ROW_TYPE_INSERTED) {
//					helloMapper.insertUserTest(dsInRow);
//				} else if(rowType == DataSet.ROW_TYPE_UPDATED) {
//					helloMapper.updateUserTest(dsInRow);
//				} else if(rowType == DataSet.ROW_TYPE_DELETED) {
//					helloMapper.deleteUserTest(dsInRow);
//				}
//		}
	}

}
