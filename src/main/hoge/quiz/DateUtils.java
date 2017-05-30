package hoge.quiz;

import java.util.HashMap;

public class DateUtils {
	static HashMap<Integer, String> map = new HashMap<Integer, String>() {
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
		// テストコミット
		String week_d;
		
		if (map.containsKey(week)) {
			week_d = map.get(week);
		} else {
			week_d = "";
		}
		return week_d;
	}

	public static String toDayOfWeekForJapaneseThrowsException(int week) throws IllegalArgumentException {
		String week_d;
		
		if (map.containsKey(week)) {
			week_d = map.get(week);
		} else if(week == 8) {
			throw new IllegalArgumentException("引数に1-7の数字を指定してください。指定値=8");
		} else {
			week_d = "";
		}
		return week_d;
	}
}
