package com.hanwha.hive_web.util.record;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * <pre>
 * {@link Record}객체의 {@link List} 
 * </pre>
 * 
 * @author 권익찬
 * @since 2.0.2
 */
public interface RecordSet extends Serializable, List<Record> {
	
	/**
	 * <pre>
	 * 이 객체에 할당된{@link RecordMetadata}
	 * </pre>
	 * 
	 * @return
	 */
	RecordMetadata getMetadata();
	
	/**
	 * 이 객체가 현재 가지고 있는 Record의 개수
	 * @return
	 */
	int getRowCount();
	
	/**
	 * 이 객체에 현재 세팅된 컬럼의 개수
	 * @return
	 */
	int getColumnCount();

	/**
	 * 이 객체에 현재 세팅된 컬럼들의 이름
	 * @return
	 */
	Iterable<String> getColumns();
	
	/**
	 * 해당 rowIndex의 {@link Record} 참조
	 * @param rowIndex
	 * @return
	 */
	Record getRecord(int rowIndex);
	
	/**
	 * <pre>
	 * 해당 row의 데이터 배열
	 * </pre>
	 * 
	 * @param index
	 * @return
	 */
	Object[] getRow(int rowIndex);
	
	/**
	 *  Record 하나 추가 후 해당 구현체 반환
	 * @return
	 */
	Record addRecord();
	
	/**
	 * 해당 레코드 순번과 필드 순번에 해당하는 값을 반환한다.
	 * @param row 레코드 순번
	 * @param column  필드 순번
	 * @return
	 */
	Object getValue(int row, int column);
}
