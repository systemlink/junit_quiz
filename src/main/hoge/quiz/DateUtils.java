package hoge.quiz;

import java.util.HashMap;

public class DateUtils {

	static HashMap<Integer,String> map = new HashMap<Integer,String>();
	static String[] array = {"","日","月","火","水","木","金","土"};

	static{
		for(int i=0;i<array.length;i++){
			map.put(i, array[i]);
		}
	}

	public static String toDayOfWeekForJapanese(int week){

		if(map.get(week) == null) return map.get(0);

		return map.get(week);
	}

	public static String toDayOfWeekForJapaneseThrowsException(int week) throws IllegalArgumentException{

		return null;
	}
}
