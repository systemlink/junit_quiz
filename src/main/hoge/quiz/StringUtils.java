package hoge.quiz;

import java.util.ArrayList;
import java.util.List;

public class StringUtils {
	public static List<String> distinct(List<String> list) {
		if (list == null) {
			return null;
		}

		List<String> uniqueArray = new ArrayList<String>();
		for (String s : list) {
			if (!uniqueArray.contains(s)) {
				uniqueArray.add(s);
			}
		}
		return uniqueArray;
	}

	public static boolean isBlank(String str) {
		if (str == null || str.length() == 0) {
			return true;
		}
		return false;
	}

	public static int indexOf(String str, char searchChar) {
		if (str == null || str.length() == 0) {
			return -1;
		}

		return str.indexOf(searchChar);
	}

	public static String defaultString(String str) {
		if (str == null)
			str = "";
		return str;
	}

	public static String defaultString(String str, String defaultStr) {
		if (str == null) {
			return defaultStr;
		}
		return str;
	}

	public static int length(String str) {
		if (str == null) {
			return 0;
		}

		return str.length();
	}

	public static String substring(String str, int start) {
		if (str == null) {
			return null;
		}

		if (str == "" || str.length() < start) {
			return "";
		}

		if (start < 0) {
			if (str.length() > -start) {
				start = str.length() + start;
			} else {
				start = 0;
			}
		}

		return str.substring(start);
	}

	public static String substring(String str, int start, int end) {
		if (str == null || str == "") {
			return str;
		}

		if (end == 0 || str.length() <= start) {
			return "";
		}

		if (str.length() < end) {
			return str.substring(str.length() - 1);
		}

		if (start < 0) {
			if (str.length() < -start) {
				return str.substring(0, end);
			}
			return str.substring(str.length() + start, str.length() + end);
		}
		return str.substring(start, end);
	}

	public static String replace(String text, String searchString,
			String replacement) {
		return null;
	}
}
