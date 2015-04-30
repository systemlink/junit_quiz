package hoge.quiz;

import java.util.HashMap;

public class DateUtils {
	public static String toDayOfWeekForJapanese(int week){

		HashMap<Integer,String> hashWeek = new HashMap<Integer,String>();

		{
			hashWeek.put(0, "");
			hashWeek.put(1,"日");
			hashWeek.put(2,"月");
			hashWeek.put(3,"火");
			hashWeek.put(4,"水");
			hashWeek.put(5,"木");
			hashWeek.put(6,"金");
			hashWeek.put(7,"土");
			hashWeek.put(8,"");
		}

		String toDayOfWeek = hashWeek.get(week);
		return toDayOfWeek;
	}

	public static String toDayOfWeekForJapaneseThrowsException(int week) throws IllegalArgumentException{
		return null;
	}
}
