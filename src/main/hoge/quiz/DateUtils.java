package hoge.quiz;

public class DateUtils {
	
	public static String toDayOfWeekForJapanese(int week){
		String day = "";	
//		if(week == 1) {
//			day = "“ú";
//		}else if(week == 2){
//			day = "Œ";
//		}else if(week == 3) {
//			day = "‰Î";	
//		}else if(week == 4) {
//			day = "…";
//		}else if(week == 5) {
// 			day = "–Ø";
//		}else if(week == 6) {
// 			day = "‹à";
//		}else if(week == 7) {
// 			day = "“y";	
//		}else{
// 			day = "";	
//		}	
//		return day;
		
		switch(week) {
			case 1:
				day = "“ú";
				break;
			case 2:
				day = "Œ";
				break;
			case 3:
				day = "‰Î";
				break;
			case 4:
				day = "…";
				break;
			case 5:
				day = "–Ø";
				break;
			case 6:
				day = "‹à";
				break;
			case 7:
				day = "“y";
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
