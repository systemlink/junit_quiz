package hoge.quiz;

public class DateUtils {

	public static String toDayOfWeekForJapanese(int week){

		String[] array = {"","日","月","火","水","木","金","土"};
		int i=week % 8;

		return array[i];
	}

	public static String toDayOfWeekForJapaneseThrowsException(int week) throws IllegalArgumentException{
		return null;
	}
}
