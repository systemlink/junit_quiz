package hoge.quiz;

public class DateUtils {

	public static String toDayOfWeekForJapanese(int week) {
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
			week_s = "";
		}
		return week_s;
	}

	public static String toDayOfWeekForJapaneseThrowsException(int week) throws IllegalArgumentException {
		return null;
	}
}
