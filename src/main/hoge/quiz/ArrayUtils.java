package hoge.quiz;

import java.util.List;

public class ArrayUtils {

	public static boolean equals(List<String> list1, List<String> list2) {
		if (list1 == null || list2 == null) {
			return false;
		}
		
		return list1.equals(list2);
	}

	public static boolean contains(List<String> list1, List<String> list2) {
		if (list1 == null || list2 == null) {
			return false;
		}

		return list1.containsAll(list2);
	}
}
