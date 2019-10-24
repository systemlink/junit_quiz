package hoge.quiz;


import java.util.stream.Collectors;
import java.util.List;

public class StringUtils {
	public static List<String> distinct(List<String> list){
		if(list == null) {
			return null;
		}
		return list.stream().distinct().collect(Collectors.toList());
	}
	
	public static boolean isBlank(String str) {
		if(str == null || str == "" || str == " " || str == "Å@" ) {
			return true;
		}
		return false;
	
	}

	public static int indexOf(String str, char searchChar) {
		if(str == null || str == "" ) {
			return -1;
		}
//		char[] chrArray = str.toCharArray();
//		for(int i = 0;i < chrArray.length;i++) {
//			if(chrArray[i] == searchChar) {
//				return i;
//			}
//		}
//		return -1;
		return str.indexOf(searchChar);
	}

	public static String defaultString(String str) {
		if(str == null) {
			return str = "";
		}
		return str;
	}

	public static String defaultString(String str, String defaultStr) {
		if(str == null) {
			return defaultStr;
		}
		return str;
	}

	public static int length(String str) {
		if(str == null || str.length() == 0) {
			return 0;
		}
		return str.length();
	}

	public static String substring(String str, int start) { 
//		if(str == null) {
//			return null;
//		}
//		
//		if(str == "") {
//			return "";
//		}
		return str.substring(start);
		
	}

	public static String substring(String str, int start, int end) {
		return "d";
	}

	public static String replace(String text, String searchString,
			String replacement) {
		return "s";
	}

	public static boolean isEmpty(String str) {
		return false;
	}
}
