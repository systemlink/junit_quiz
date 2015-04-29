package hoge.quiz;

public class DateUtils {
	public static String toDayOfWeekForJapanese(int week){
		String test = "";

		switch(week){
			case 0:
				test = "";
				break;
			case 1:
				test = "日";
				break;
			case 2:
				test = "月";
				break;
			case 3:
				test = "火";
				break;
			case 4:
				test = "水";
				break;
			case 5:
				test = "木";
				break;
			case 6:
				test = "金";
				break;
			case 7:
				test = "土";
		}
		return test;
	}

	public static String toDayOfWeekForJapaneseThrowsException(int week) throws IllegalArgumentException{
		return null;
	}
}
