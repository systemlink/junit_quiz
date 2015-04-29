package hoge.quiz;

import java.util.HashMap;

public class DateUtils {

	public static String toDayOfWeekForJapanese(int week){

		HashMap<String,String> map = new HashMap<String,String>();
		String[] array = {"","日","月","火","水","木","金","土"};

		map.put("false",array[0]);
		int i=week % 8;
		if(week>=0 && week<=8){
			return array[i];
		}else{
			return map.get("false");
		}
	}

	public static String toDayOfWeekForJapaneseThrowsException(int week) throws IllegalArgumentException{
		return null;
	}
}
