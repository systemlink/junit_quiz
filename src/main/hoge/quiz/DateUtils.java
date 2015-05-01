package hoge.quiz;

import java.util.HashMap;

public class DateUtils {

	static HashMap<Integer,String> map = new HashMap<Integer,String>();
	static String[] array = {"日","月","火","水","木","金","土"};

	static{
		for(int i=0;i<array.length;i++){
			map.put(i, array[i]);
		}
	}

	public static String toDayOfWeekForJapanese(int week){

		String weekName = map.get(week - 1);
		if(weekName == null) weekName = "";

		return weekName;
	}

	public static String toDayOfWeekForJapaneseThrowsException(int week) throws IllegalArgumentException{

		String weekName = map.get(week - 1);

		if(weekName == null){
			String msg = "引数に1-7の数字を指定してください。指定値=" + week;
			throw new IllegalArgumentException(msg);
		}

		return weekName;
	}
}
