package hoge.quiz;

import java.util.HashMap;

public class DateUtils {
	
	public static String toDayOfWeekForJapanese(int week){
		HashMap<Integer,String> map = new HashMap<>();
		map.put(0, "");
		map.put(1, "��");
		map.put(2, "��");
		map.put(3, "��");
		map.put(4, "��");
		map.put(5, "��");
		map.put(6, "��");
		map.put(7, "�y");
		map.put(8, "");
		
		return map.get(week);
	}
	
	public static String toDayOfWeekForJapaneseThrowsException(int week) throws IllegalArgumentException{
		String day = "";
		
		if(week == 8) {
			throw new IllegalArgumentException("������1-7�̐������w�肵�Ă��������B�w��l=8");
		}
		
		switch(week) {
			case 1:
				day = "��";
				break;
			case 2:
				day = "��";
				break;
			case 3:
				day = "��";
				break;
			case 4:
				day = "��";
				break;
			case 5:
				day = "��";
				break;
			case 6:
				day = "��";
				break;
			case 7:
				day = "�y";
				break;
		}
		return day;
	}
}
