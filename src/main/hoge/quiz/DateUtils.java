package hoge.quiz;

import java.util.HashMap;

public class DateUtils {
	
	static HashMap<Integer,String> map = new HashMap<>();
	static {
		map.put(1, "��");
		map.put(2, "��");
		map.put(3, "��");
		map.put(4, "��");
		map.put(5, "��");
		map.put(6, "��");
		map.put(7, "�y");
	}
	public static String toDayOfWeekForJapanese(int week){
		if(week == 0 || week > 7 )
			return "";
		return map.get(week);
	}
	
	public static String toDayOfWeekForJapaneseThrowsException(int week) throws IllegalArgumentException{
		if(week == 0 || week > 7 ) {
			throw new IllegalArgumentException("������1-7�̐������w�肵�Ă��������B�w��l=" + week);
		}
		
		return map.get(week);
	}
}