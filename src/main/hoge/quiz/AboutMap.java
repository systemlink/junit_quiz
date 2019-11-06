package hoge.quiz;

import java.util.TreeMap;
import java.util.NavigableMap;

public class AboutMap<K, V> extends TreeMap<K, V> {
	private static final long serialVersionUID = 1518115962300131292L;

	public static TreeMap<Integer, String> map = new TreeMap<Integer, String>();
	private boolean descending = false;
	/**
	 * �R���X�g���N�^ ���Tree�}�b�v
	 */
	public AboutMap() {
		super();
	}
	
	public AboutMap(boolean descending) {
		this.descending = descending;
	}
	
	public void put(int key, String value) {
		map.put(key, value);
	}
	
	//short�^ �I�[�o�[���[�h
	public void put(short key, String value) {
		map.put((int)key, value);
	}
	
	//float�^ �I�[�o�[���[�h
	public void put(float key, String value) {
		map.put((int)key, value);
	}
	
	public String get(int key) {
		if(map.containsKey(key)) {
			return map.get(key);
		}
		if(descending == false) {
			if(key < map.firstKey()) {
				return null;
			}
			return map.get(map.floorKey(key));
		}else {
			if(key > map.lastKey()) {
				return null;
			}
			return map.get(map.higherKey(key));
		}
	}
	
	//short�^ �I�[�o�[���[�h
	public String get(short key) {
		if(map.containsKey((int)key)) {
			return map.get((int)key);
		}
		
		if((int)key < map.firstKey()) {
			return null;
		}
		
		return map.get(map.floorKey((int)key));
	}
	
	//float�^ �I�[�o�[���[�h
	public String get(float key) {
		if(map.containsKey((int)key)) {
			return map.get((int)key);
		}
		
		if((int)key < map.firstKey()) {
			return null;
		}
		
		return map.get(map.floorKey((int)key));
	}
	
	public String getOrDefault(int key,String defaultWord) {
		if(map.containsKey((int)key)) {
			return map.get((int)key);
		}
		
		if(descending == false) {
			if(key < map.firstKey()) {
				return defaultWord;
			}
			return map.get(map.floorKey(key));
		}else {
			if(key > map.lastKey()) {
				return defaultWord;
			}
		return map.get(map.higherKey(key));
	}
	
//	public Exception testException(int key) {
//		if(map.containsKey(key)) {
//			return map.get(key);
//		}else {
//			return 
//		}
//		return
//	}
		
}
	
	
	/**
	 * �R���X�g���N�^ ���Tree�}�b�v
	 * @param descending�@true:�~��  false:���� (default)
	 */



	

	
	
}