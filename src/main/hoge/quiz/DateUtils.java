package hoge.quiz;

import java.util.HashMap;

public class DateUtils {

	static HashMap<Integer,String> hashWeek = new HashMap<Integer,String>();

	static{
		hashWeek.put(1,"日");
		hashWeek.put(2,"月");
		hashWeek.put(3,"火");
		hashWeek.put(4,"水");
		hashWeek.put(5,"木");
		hashWeek.put(6,"金");
		hashWeek.put(7,"土");
	}

	public static String toDayOfWeekForJapanese(int week){

		String weekName = hashWeek.get(week) ;

		if(weekName == null)
			weekName = "";

		return weekName;
	}

	public static String toDayOfWeekForJapaneseThrowsException(int week) throws IllegalArgumentException{

		String weekName = hashWeek.get(week);

		if(weekName == null)
			throw new IllegalArgumentException("引数に1-7の数字を指定してください。指定値=" + week);

		return weekName;
	}
}
