package hoge.quiz;

import java.util.HashMap;

public class DateUtils {

	static HashMap<Integer,String> hashWeek = new HashMap<Integer,String>();

	static{
		hashWeek.put(0, "");
		hashWeek.put(1,"日");
		hashWeek.put(2,"月");
		hashWeek.put(3,"火");
		hashWeek.put(4,"水");
		hashWeek.put(5,"木");
		hashWeek.put(6,"金");
		hashWeek.put(7,"土");
	}

	public static String toDayOfWeekForJapanese(int week){
		if(week < 1 || week > 7 ){
			week = 0;
		}
		String toDayOfWeek = hashWeek.get(week);
		return toDayOfWeek;
	}

	public static String toDayOfWeekForJapaneseThrowsException(int week) throws IllegalArgumentException{

			if(week < 1 || week > 7 ){
				throw new IllegalArgumentException("引数に1-7の数字を指定してください。指定値=" + week);
			}

		String toDayOfWeek = hashWeek.get(week);
		return toDayOfWeek;
	}
}
