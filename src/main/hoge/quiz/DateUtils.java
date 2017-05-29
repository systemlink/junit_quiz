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
		String week_s;
		switch (week) {
		case 1:
			week_s = "日";
			break;
		case 2:
			week_s = "月";
			break;
		case 3:
			week_s = "火";
			break;
		case 4:
			week_s = "水";
			break;
		case 5:
			week_s = "木";
			break;
		case 6:
			week_s = "金";
			break;
		case 7:
			week_s = "土";
			break;
		default :
			throw new IllegalArgumentException("引数に1-7の数字を指定してください。指定値=" + week);
		}
		return week_s;
	}
}
