package hoge.quiz;

public class DateUtils {
	
	public static String toDayOfWeekForJapanese(int week){
		String day = "";	
//		if(week == 1) {
//			day = "��";
//		}else if(week == 2){
//			day = "��";
//		}else if(week == 3) {
//			day = "��";	
//		}else if(week == 4) {
//			day = "��";
//		}else if(week == 5) {
// 			day = "��";
//		}else if(week == 6) {
// 			day = "��";
//		}else if(week == 7) {
// 			day = "�y";	
//		}else{
// 			day = "";	
//		}	
//		return day;
		
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
			default:
				day = "";
				break;
		}
		return day;	
	}
	
	public static String toDayOfWeekForJapaneseThrowsException(int week) throws IllegalArgumentException{
		return null;
	}
}
