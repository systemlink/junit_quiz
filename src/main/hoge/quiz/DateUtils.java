package hoge.quiz;

public class DateUtils {
	
	public static String toDayOfWeekForJapanese(int week){
		// テストコミット
		String week_d;
		switch(week) {
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
		default:
			week_d = "";
			break;
		}
		return week_d;
	}
	
	public static String toDayOfWeekForJapaneseThrowsException(int week) throws IllegalArgumentException{
		return null;
	}
}
