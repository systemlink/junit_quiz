package hoge.quiz;


import java.util.stream.Collectors;
import java.util.List;

public class StringUtils {
	public static List<String> distinct(List<String> list){
		if(list == null) {
			return null;
		}
		return list.stream().distinct().collect(Collectors.toList());
	}
}
