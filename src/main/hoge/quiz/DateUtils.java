package hoge.quiz;

import java.util.HashMap;

public class DateUtils {

	static HashMap<Integer, String> week_map = new HashMap<Integer, String>() {
		{
			put(1, "日");
			put(2, "月");
			put(3, "火");
			put(4, "水");
			put(5, "木");
			put(6, "金");
			put(7, "土");
		}
	};
	
	public static String toDayOfWeekForJapanese(int week) {
		String week_s;
		
		if(week_map.containsKey(week)) {
			week_s = week_map.get(week);
		} else {
			week_s = "";
		}
		
		return week_s;
	}

	public static String toDayOfWeekForJapaneseThrowsException(int week) throws IllegalArgumentException {
		return null;
	}
}
