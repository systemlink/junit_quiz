package hoge.quiz;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class StringUtils {
	public static List<String> distinct(List<String> list) {
		if (list == null) {
			return null;
		} else {
			LinkedHashSet<String> set = new LinkedHashSet<>(list);
			List<String> lists = new ArrayList<>(set);
			return lists;
		}
	}

	public static boolean isBlank(String str) {
		if (str == null) {
			return true;
		}
		return str.replaceAll("　", " ").trim().isEmpty();
	}

	public static int indexOf(String str, char searchChar) {
		if (str == null) {
			return -1;
		}
		return str.indexOf(searchChar);
	}

	public static String defaultString(String str) {
		if (str == null) {
			return "";
		}
		return str;
	}

	public static String defaultString(String str, String defaultStr) {
		if (str == null) {
			return defaultStr;
		}
		return str;
	}

	public static int length(String str) {
		if(str == null) {
    		return 0;
    	}
        return str.length();
	}

	public static String substring(String str, int start) {
		if (str == null || str.isEmpty()) {
			return str;
		} else if (str.length() < start) {
			return "";
		} else if (start < 0) {
			start += str.length();
			if (start < 0) {
				start = 0;
			}
		}
		return str.substring(start);
	}

	public static String substring(String str, int start, int end) {
		if (str == null || str.isEmpty()) {
			return str;
		} else if (str.length() <= start || start >= end) {
			return "";
		} else if (str.length() < end) {
			end = str.length();
		}
		if (start < 0) {
			start += str.length();
			if (start < 0) {
				start = 0;
			}
		}
		if (end < 0) {
			end += str.length();
			if (end <= 0) {
				return "";
			}
		}
		return str.substring(start, end);
	}

	public static String replace(String text, String searchString, String replacement) {
		return null;
	}
}
