package hoge.quiz;

import java.util.List;

public class ArrayUtils {

	public static boolean equals(List<String> list1, List<String> list2) {

		if (list1 == null || list2 == null) {
			return false;
		} else if (list1.equals(list2)) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean contains(List<String> list1, List<String> list2) {

		if (list1 == null || list2 == null) { 
			return false;
		} else if(list1.contains(list2) || list1.size() < list2.size()){
			return false;
		} else {
			return true;
		}
	}
}
