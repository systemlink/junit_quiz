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
}
