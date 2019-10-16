package hoge.quiz;

import java.util.HashMap;

public class DateUtils {
	
	static HashMap<Integer,String> map = new HashMap<>();
	static {
		map.put(1, "日");
		map.put(2, "月");
		map.put(3, "火");
		map.put(4, "水");
		map.put(5, "木");
		map.put(6, "金");
		map.put(7, "土");
	}
	public static String toDayOfWeekForJapanese(int week){
		if(week == 0 || week > 7 )
			return "";
		return map.get(week);
	}
	
	public static String toDayOfWeekForJapaneseThrowsException(int week) throws IllegalArgumentException{
		if(week == 0 || week > 7 ) {
			throw new IllegalArgumentException("引数に1-7の数字を指定してください。指定値=" + week);
		}
		
		return map.get(week);
	}
}