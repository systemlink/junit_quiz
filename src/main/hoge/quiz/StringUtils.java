package hoge.quiz;

import java.util.stream.Collectors;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;


public class StringUtils {
	public static List<String> distinct(List<String> list){
		if(list == null) {
			return null;
		}
		return list.stream().distinct().collect(Collectors.toList());
	}
	
	public static boolean isBlank(String str) {
		if(str == null || str == "") {
			return true;
		}
		List<String> strList = Arrays.asList(str.split(""));
		if(Collections.frequency(strList,strList.get(0)) == strList.size()) {
			if(strList.get(0) == " " || strList.get(0) == "�@") {
				return true;
			}
		}
		return false;
		
//		if(org.apache.commons.lang3.StringUtils.isBlank(str)) {
//			return true;
//		}
//		return false;
	}

	public static int indexOf(String str, char searchChar) {
		if(str == null || str == "" ) {
			return -1;
		}
		char[] chrArray = str.toCharArray();
		for(int i = 0;i < chrArray.length;i++) {
			if(chrArray[i] == searchChar) {
				return i;
			}
		}
		return -1;
	}

	public static String defaultString(String str) {
		if(str == null) {
			return "";
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
		int count = 0;
		if(str == null || str == "") {
			return 0;
		}
		String[] strArray = str.split("");
		for(int i = 0;i < strArray.length;i++) {
			count += 1;
		}
		return count;
	}

	public static String substring(String str, int start) { 
		if(str == null) {
			return null;
		}else if(str == "" || str.length() -start < 0) {
			return "";
		}
		
		String[] strArray = str.split("");
		List<String> strList = new ArrayList<String>();
		if(start < 0) {
			if(str.length() + start < 0) {
				for(int i = 0;i < str.length();i++) {
					strList.add(strArray[i]);
				}
			}else {
				for(int i = str.length() + start; i < str.length();i++) {
					strList.add(strArray[i]);
				}
			}
		}else {
			for (int i = start;i < str.length();i++) {
				strList.add(strArray[i]);
			}
		}
		
		return str = String.join("", strList);
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
