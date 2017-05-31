package hoge.quiz;

import java.util.List;
import java.util.stream.Collectors;

public class StringUtils {
	public static List<String> distinct(List<String> list){
		if(list == null) {
			return null;
		} else {
			List<String> lists = list.stream().distinct().collect(Collectors.toList());
			return lists;
		}
	}
}
