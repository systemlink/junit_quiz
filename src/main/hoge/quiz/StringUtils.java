package hoge.quiz;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class StringUtils {
	public static List<String> distinct(List<String> list) {

		if (list == null) {
			return null;
		} else {
			Set<String> set = new LinkedHashSet<String>(list);
			List<String> list2 = new ArrayList<String>(set);
			return list2;
		}
	}

	public static boolean isBlank(String str) {
		if (str == null || str.isEmpty() || str == " ") {
			return true;
		}
		return false;
	}

	public static int indexOf(String str, char searchChar) {

		if (str == null) {
			return -1;
		} else {
			return str.indexOf(searchChar);
		}
	}

	public static String defaultString(String str) {
		return null;
	}

	public static String defaultString(String str, String defaultStr) {
		return null;
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
