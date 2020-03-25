package com.hanwha.hive_web.util.record;

import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;

public class RecordMetadata extends AbstractSet<String> implements Serializable, Iterable<String> {
	private static final long serialVersionUID = 3401141849461892316L;

	public final static String[] EMPTY_STRING_ARRAY = new String[0];
	
	private String[] keyArray;
	private Entry entryArray[];

	/**
	 * 
	 * <pre>
	 * Map의 key사전 정의
	 * keys는 {@link #getKeys()}를 통해 참조 가능
	 * </pre>
	 * @param keys Map({@link Record})에 입력 가능한 key들의 사전 정의
	 */
	public RecordMetadata(String[] keys){
		init(keys);
	}
	
	
	protected RecordMetadata(RecordMetadata other){
		init(other.getKeyArray());
	}
	
	private void init(String[] keys) {
		if(keys == null){
			throw new IllegalArgumentException( "keys must not be null");
		}
		keyArray = keys;
		entryArray = new Entry[(int)(keyArray.length*1.2)];

		for (int i = keyArray.length - 1; i >= 0; i--) {
			setIndex(keyArray[i], i);
		}
	}

	protected String[] getKeyArray(){
		return keyArray;
	}
	
	private void setIndex(String key, int index) {
		int hash = key.hashCode();
		int entryIdx = (hash & 0x7FFFFFFF) % entryArray.length;

		for (Entry e = entryArray[entryIdx]; e != null; e = e.next) {
			if ((e.key == key) || (e.key.equals(key))) {
				throw new IllegalArgumentException(
						"Attribute key must be unique.");
			}
		}

		Entry e = new Entry(key, index, entryArray[entryIdx]);
		entryArray[entryIdx] = e;
	}

	/**
	 * @param key 등록 여부를 확인하려는 key
	 * @return 해당 key가 존재하는지 확인
	 */
	public final boolean contains(String key) {
		return getIndexAny(key) > -1;
	}


	/**
	 * hashing을 이용한 key-index값 검색
	 * @param key index값을 찾으려는 key
	 * @return 해당 key의 인덱스 : 없으면 -1
	 */
	protected final int getIndexAny(String key) {
		int hash = key.hashCode();
		int index = (hash & 0x7FFFFFFF) % entryArray.length;

		for (Entry e = entryArray[index]; e != null; e = e.next) {
			if ((e.key == key) || (e.key.equals(key))) {
				return e.index;
			}
		}
		return -1;
	}

	
	/**
	 * @param key index값을 찾으려는 key
	 * @return 해당 key의 인덱스 : 없으면 IllegalArgumentException
	 */
	public int getIndex(String key) {
		int index = getIndexAny(key);

		if(index < 0){
			throw new IllegalArgumentException("Record key[" + key + "] is not registered.");
		}
		
		return index;
	}

	/**
	 * @param index 초기에 등록된 index로 key 참조
	 * @return 해당 key
	 */
	public final String getKey(int index) {
		return keyArray[index];
	}

	/**
	 * 초기 등록된 key배열 참조
	 */
	public final Iterator<String> getKeys() {
		return iterator();
	}
	
	/**
	 * <pre>
	 * 초기 등록된 key배열 참조 (순서 유지)
	 * </pre>
	 * 
	 * @return
	 * @see java.lang.Iterable#iterator()
	 * @see #getKeys()
	 */
	public Iterator<String> iterator() {
		return new StringArrayIterator(keyArray);
	}
	
	
	/**
	 * 등록된 key의 개수
	 */
	public final int size() {
		return keyArray.length;
	}

	public boolean equals(RecordMetadata other) {
		if(other != null){
			if(other.hashCode() == this.hashCode()){
				return true;
			}
			
			return Arrays.equals(keyArray, other.keyArray);
		}
		
		return false;
	}

	/**
	 * inner class : map entry
	 */
	private static class Entry  implements Serializable {
		private static final long serialVersionUID = 4801509094207445665L;

		Object key;

		int index;

		Entry next;

		Entry(Object key, int index, Entry next) {
			this.key = key;
			this.index = index;
			this.next = next;
		}
	}

	/**
	 * inner class
	 */
	private class StringArrayIterator implements Iterator<String> {
		
		String[] array;
		int cursor;
		
		public StringArrayIterator(String[] array) {
			cursor = -1;
			if(array == null){
				array = EMPTY_STRING_ARRAY;
			}

			this.array = array;
		}

		public boolean hasNext(){
			return (cursor+1) < array.length;
		}
		
		public String next(){
			if(!hasNext()) {
				throw new IndexOutOfBoundsException("StringEnumerator excess list size.");
			}
			
			cursor++;
			
			return array[cursor];
		}
		
		public void remove() {
			throw new RuntimeException("remove operation is not supported.");
		}
	}
	
}
