package hoge.quiz;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class StringUtils {
	public static List<String> distinct(List<String> list){
		if(list == null) {
			return null;
		} else {
			LinkedHashSet<String> set = new LinkedHashSet<>(list);
			List<String> lists = new ArrayList<>(set);
			return lists;
		}
	}
}
