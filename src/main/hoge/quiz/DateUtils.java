package hoge.quiz;

import java.util.HashMap;

public class DateUtils {

	public static String toDayOfWeekForJapanese(int week) {
		// テストコミット
		String week_d;
		HashMap<Integer, String> map = new HashMap<Integer, String>() {
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
		if (true == map.containsKey(week)) {
			week_d = map.get(week);
		} else {
			week_d = "";
		}
		return week_d;
	}

	public static String toDayOfWeekForJapaneseThrowsException(int week) throws IllegalArgumentException {
		String week_d;
		switch (week) {
		case 1:
			week_d = "日";
			break;
		case 2:
			week_d = "月";
			break;
		case 3:
			week_d = "火";
			break;
		case 4:
			week_d = "水";
			break;
		case 5:
			week_d = "木";
			break;
		case 6:
			week_d = "金";
			break;
		case 7:
			week_d = "土";
			break;
		case 8:
			throw new IllegalArgumentException("引数に1-7の数字を指定してください。指定値=8");
		default:
			week_d = "";
			break;
		}
		return week_d;
	}
}
