package hoge.quiz;

import java.util.HashMap;

public class DateUtils {
	
	public static String toDayOfWeekForJapanese(int week){
		HashMap<Integer,String> map = new HashMap<>();
		map.put(0, "");
		map.put(1, "日");
		map.put(2, "月");
		map.put(3, "火");
		map.put(4, "水");
		map.put(5, "木");
		map.put(6, "金");
		map.put(7, "土");
		map.put(8, "");
		
		return map.get(week);
	}
	
	public static String toDayOfWeekForJapaneseThrowsException(int week) throws IllegalArgumentException{
		String day = "";
		
		if(week == 8) {
			throw new IllegalArgumentException("引数に1-7の数字を指定してください。指定値=8");
		}
		
		switch(week) {
			case 1:
				day = "日";
				break;
			case 2:
				day = "月";
				break;
			case 3:
				day = "火";
				break;
			case 4:
				day = "水";
				break;
			case 5:
				day = "木";
				break;
			case 6:
				day = "金";
				break;
			case 7:
				day = "土";
				break;
		}
		return day;
	}
}
