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
		boolean result = false;
		if (str == null || str.replaceAll("　", " ").trim().isEmpty()) {
			result = true;
		}
		return result;
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
		return null;
	}

	public static String substring(String str, int start) {
		return null;
	}

	public static String substring(String str, int start, int end) {
		return null;
	}

	public static String replace(String text, String searchString, String replacement) {
		return null;
	}
}
