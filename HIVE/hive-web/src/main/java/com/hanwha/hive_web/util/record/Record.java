package com.hanwha.hive_web.util.record;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Map;

import com.hanwha.hive_web.util.StringUtils;

/**
 * 
 * <pre>
 * 기본 Map<String,Object> 인터페이스 구현체로서 값에 대한 FieldType Casting기능을 내장한 추상 클래스
 * * 특징
 *  1. FieldType Casting기능 내장
 *  2. 특화기능을 가진 Map구현체의 구현 편의성 제공
 * 	- {@link RecordMetadata}를 이용하여 입력 가능한 key의 범위를 제한 가능 : {@link MetadataRecord}
 * 	- {@link List<Map>}의 공간효율성 등을 고려한 Map구현체 구현 가능 : {@link MetadataRecordArray}, {@link MetadataRecordSet}
 * </pre>
 * 
 */
@SuppressWarnings("serial")
public abstract class Record implements Serializable , Map<String,Object> {
	
	protected Record() {
	}

	/**
	 * <pre>
	 * 재활용을 위한 작업
	 * </pre>
	 * @see #clear()
	 */
	public void recycle() {
		clear();
	}
	
	/**
	 * 재활용을 위한 정리작업. 필요시 override
	 */
	public void clear(){
	}
	
	/**
	 * <pre>
	 * 이 객체에 할당된 column (key)의 개수 
	 * </pre>
	 * 
	 * @return
	 */
	public abstract int getColumnCount();

	/**
	 * <pre>
	 * 이 객체에 할당된 key의 {@link Iterable}
	 * </pre>
	 * 
	 * @return
	 */
	public abstract Iterable<String> getColumns();

	/**
	 * 레코드 추가
	 * <pre>
	 * 레코드 추가 후 자기 자신을 리턴
	 * </pre>
	 * 
	 * @param fieldName
	 * @param value
	 * @return
	 */
	public abstract Record set(String fieldName, Object value);
	
	/**
	 * <pre>
	 * 해당 key에 할당된 데이터 참조
	 * </pre>
	 * 
	 * @param fieldName
	 * @return
	 */
	public abstract Object getObject(String fieldName);
	
	/**
	 * <pre>
	 * 해당 key에 할당된 데이터 참조. 데이터가 null일 경우 기본값 def 반환
	 * </pre>
	 * 
	 * @param fieldName
	 * @param def
	 * @return
	 */
	public abstract Object getObject(String fieldName, Object def);
	
	/**
	 * fieldName에 해당하는 String 값을 반환한다. 만약 값이 null이거나, 빈 문자열 ""일때 는 null를 반환한다.
	 * @param fieldName 필드명
	 * @return
	 */
	public String getString(String fieldName){
		return getString(fieldName, null);
	}

	/**
	 * fieldName에 해당하는 String 값을 반환한다. 
	 * @param fieldName 필드명
	 * @param def 만약 값이 null이거나, 빈 문자열 ""일 경우의 기본값
	 * @return
	 */
	public String getString(String fieldName, String def){
		Object value = getObject(fieldName);
		return (value != null) ? value.toString() : def;
	}

	/**
	 * fieldName에 해당하는 String 값을 Trim하여 반환한다. 만약 값이 null이거나, 빈 문자열 ""일때 는 null를 반환한다.
	 * @param fieldName 필드명
	 * @return
	 */
	public String getTrimmed(String fieldName){
		return getTrimmed(fieldName, null);
	}

	/**
	 * fieldName에 해당하는 String 값을 Trim하여 반환한다. 
	 * @param fieldName 필드명
	 * @param def 만약 값이 null이거나, 빈 문자열 ""일 경우의 기본값
	 * @return
	 */
	public String getTrimmed(String fieldName, String def){
		Object value = getObject(fieldName);
		return StringUtils.normalizeWhiteSpace((value != null) ? value.toString() : def);
	}

	/**
	 * value를 trim하여 저장한다.
	 * @param fieldName
	 * @param value
	 */
	public void setTrimmed(String fieldName, String value){
		if(value != null){
			value = value.trim();
		}
		
		set(fieldName, value);
	}

	/**
	 * fieldName에 해당하는 boolean 값을 반환한다. 
	 * 문자열 "yes", "true"의 경우 true를 반환한다.
	 * 만약 값이 비어 있으면 false를 리턴한다.
	 * @param fieldName 
	 * @return
	 */
	public boolean getBoolean(String fieldName){
		return getBoolean(fieldName, false);
	}

	/**
	 * fieldName에 해당하는 boolean 값을 반환한다.
	 * 문자열 "yes", "true"의 경우  true를 반환한다.
	 * @param fieldName
	 * @param def  값이 비어 있을  경우의 기본값
	 * @return
	 */
	public boolean getBoolean(String fieldName, boolean def){
		Object value = getObject(fieldName);
		if(value != null){
			if(value instanceof Boolean){
				return ((Boolean)value).booleanValue();
			} else {
				return value.equals("true") || value.equals("yes");
			} 
		}
		
        return def;
	}
	

	/**
	 * fieldName에 해당하는 int 값을 반환한다. 만약 값이 비어 있을 면 0을 리턴한다.
	 * @param fieldName 
	 * @return
	 */
	public int getInt(String fieldName){
		return getInt(fieldName, 0);
	}

	/**
	 * fieldName에 해당하는 int 값을 반환한다.
	 * @param fieldName
	 * @param def  값이 비어 있을  경우의 기본값
	 * @return
	 */
	public int getInt(String fieldName, int def){
		Object value = getObject(fieldName);
		if(value != null){
			if(value instanceof Number){
				return ((Number)value).intValue();
			} else {
				String numStr = value.toString();
				if(!StringUtils.hasText(numStr)){
					return def;
				} else {
					return Integer.parseInt(numStr);
				}
			}
		}
		
		return def;
	}
	
	/**
	 * fieldName에 해당하는 byte 값을 반환한다. 만약 값이 비어 있을 면 0을 리턴한다.
	 * @param fieldName 
	 * @return
	 */
	public byte getByte(String fieldName){
		byte def = 0;
		return getByte(fieldName, def);
	}

	/**
	 * fieldName에 해당하는 byte 값을 반환한다.
	 * @param fieldName
	 * @param def  값이 비어 있을 경우의 기본값
	 * @return
	 */
	public byte getByte(String fieldName, byte def){
		Object value = getObject(fieldName);
		if(value != null){
			if(value instanceof Byte){
				return ((Byte)value);
			} else {				
				String str = value.toString();
				if(!StringUtils.hasText(str)){
					return def;
				} else {
					return Byte.parseByte(str);
				}
			}
		}
		return def;
	}	
	
	/**
	 * fieldName에 해당하는 float 값을 반환한다. 만약 값이 비어 있을 면 0을 리턴한다.
	 * @param fieldName 
	 * @return
	 */
	public float getFloat(String fieldName){
		return getFloat(fieldName, 0f);
	}

	/**
	 * fieldName에 해당하는 float 값을 반환한다.
	 * @param fieldName
	 * @param def  값이 비어 있을 경우의 기본값
	 * @return
	 */
	public float getFloat(String fieldName, float def){
		Object value = getObject(fieldName);
		if(value != null){
			if(value instanceof Float){
				return ((Float)value);
			} else if(value instanceof Number) {
				return ((Number)value).floatValue();
			} else {
				String numStr = value.toString();
				if(!StringUtils.hasText(numStr)){
					return def;
				} else {
					return Float.parseFloat(numStr);
				}
			}
		}
		return def;
	}	

	/**
	 * fieldName에 해당하는 double 값을 반환한다. 만약 값이 비어 있을 면 0을 리턴한다.
	 * @param fieldName 
	 * @return
	 */
	public double getDouble(String fieldName){
		return getDouble(fieldName, 0);
	}

	/**
	 * fieldName에 해당하는 double 값을 반환한다.
	 * @param fieldName
	 * @param def  값이 비어 있을 경우의 기본값
	 * @return
	 */
	public double getDouble(String fieldName, double def){
		Object value = getObject(fieldName);
		if(value != null){
			if(value instanceof Double){
				return ((Double)value);
			} else if(value instanceof Number) {
				return ((Number)value).doubleValue();
			} else {
				String numStr = value.toString();
				if(!StringUtils.hasText(numStr)){
					return def;
				} else {
					return Double.parseDouble(numStr);
				}
			}
		}
		return def;
	}
	
	/**
	 * fieldName에 해당하는 long 값을 반환한다. 만약 값이 비어 있을때면 0을 리턴한다.
	 * @param fieldName 
	 * @return
	 */
	public long getLong(String fieldName){
		return getLong(fieldName, 0);
	}

	/**
	 * fieldName에 해당하는 double 값을 반환한다.
	 * @param fieldName
	 * @param def  값이 비어 있을 경우의 기본값
	 * @return
	 */
	public long getLong(String fieldName, long def){
		Object value = getObject(fieldName);
		if(value != null){
			if(value instanceof Number){
				return ((Number)value).longValue();
			} else {
				String numStr = value.toString();
				if(!StringUtils.hasText(numStr)){
					return def;
				} else {
					return Long.parseLong(numStr);
				}
			}
		}
		
		return def;
	}	

	/**
	 * fieldName에 해당하는 BigDecimal 값을 반환한다. 만약 값이 비어 있거나 , 숫자가 아니면 0을 리턴한다.
	 * @param fieldName 
	 * @return
	 */
	public BigDecimal getBigDecimal(String fieldName){
		return getBigDecimal(fieldName, BigDecimal.ZERO );
	}

	/**
	 * fieldName에 해당하는 BigDecimal 값을 반환한다.
	 * @param fieldName
	 * @param def  값이 비어 있거나 , 숫자가 아닐 경우의 기본값
	 * @return
	 */
	public BigDecimal getBigDecimal(String fieldName, BigDecimal def){
		Object value = getObject(fieldName);
		if(value != null){
			if(value instanceof BigDecimal){
				return (BigDecimal)value;
			} else if(value instanceof Number) {
				return BigDecimal.valueOf(((Number)value).doubleValue());
			} else {
				String numStr = value.toString();
				if(!StringUtils.hasText(numStr)){
					return def;
				} else {
					return new BigDecimal(numStr);
				}
			}
		}
		return def;
	}
	
	public Date getDate(String fieldName, long def){
		Object value = getObject(fieldName);
		if(value instanceof Date){
			return (Date)value;
		}
		
		return new Date(def);
	}
	
	public Date getDate(String fieldName ){
		Object value = getObject(fieldName);
		if(value != null){
			if(value instanceof java.sql.Timestamp){
				return new java.sql.Date(((java.sql.Timestamp)value).getTime());
			}else if(value instanceof java.sql.Date){
				return (java.sql.Date)value;
			}else if(value instanceof Date){
				return (Date)value;
			} else {
				throw new RuntimeException(fieldName + "[" + value +"]가 Date형이 아닙니다. (" + value.getClass() + ")");
			}
		}
		
		return null;
	}
	
	public Time getTime(String fieldName ){
		Object value = getObject(fieldName);
		if(value != null){
			if(value instanceof java.sql.Timestamp){
				return new java.sql.Time(((java.sql.Timestamp)value).getTime());
			}else if(value instanceof java.sql.Time){
				return (Time)value;
			} else {
				throw new RuntimeException(fieldName + "[" + value +"]가 Time형이 아닙니다. (" + value.getClass() + ")");
			}
		}
		
		return null;
	}
	
	public Timestamp getTimestamp(String fieldName, long def){
		Object value = getObject(fieldName);
		if(value instanceof Timestamp){
			return (Timestamp)value;
		} else if(value instanceof Date){
			Date date = (Date)value;
			return new Timestamp(date.getTime());
		} else {
			return new Timestamp(def);
		}
	}
	
	public Timestamp getTimestamp(String fieldName){
		Object value = getObject(fieldName);
		if(value instanceof Timestamp){
			return (Timestamp)value;
		} else if(value instanceof Date){
			Date date = (Date)value;
			return new Timestamp(date.getTime());
		}
		
		return null;
	}
	
	/**
	 * fieldName에 해당하는 Number 값을 반환한다.
	 * @param fieldName 필드명
	 * @return
	 */
	public Number getNumber(String fieldName){
		return getNumber(fieldName, null);
	}

	/**
	 * fieldName에 해당하는 Number 값을 반환한다. 
	 * @param fieldName 필드명
	 * @param def 만약 값이 null일 경우의 기본값
	 * @return
	 */
	public Number getNumber(String fieldName, Number def){
		Object value = getObject(fieldName);
		return (value != null) ? (Number)value : def;
	}	
	
	public Object get(Object key) {
		if(key instanceof String ){
			return getObject((String)key);
		}
		
		return null;
	}

	public boolean isEmpty() {
		return false;
	}

	public Object put(String key, Object value) {
		set(key, value);
		return value;
	}
	
	public int size() {
		return getColumnCount();
	}

	public RecordStatus getStatus() {
		if (containsKey(RecordStatus.class.getName())) {
			return (RecordStatus)get(RecordStatus.class.getName());
		} else {
			return RecordStatus.NONE;
		}
	}

	public void setStatus(RecordStatus status) {
		put(RecordStatus.class.getName(), status);
	}
	
}
