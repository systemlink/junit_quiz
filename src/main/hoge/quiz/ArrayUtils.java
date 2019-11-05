package hoge.quiz;

import java.util.List;

public class ArrayUtils {
	static boolean flag = false;
	public static boolean equals(List<String> list1, List<String> list2){
		if(list1 == null || list2 == null) {
			flag = false;
		}else if(list1.equals(list2)) {
			flag = true;
		}
		return flag;
	}
	
	public static boolean contains(List<String> list1, List<String> list2){
		if(list1 == null || list2 == null) {
			flag = false;
		}else if(list1.equals(list2)) {
			flag = true;
		}else if(list1.containsAll(list2)){
			flag = true;
		}else {
			flag = false;
		}
		return flag;
	}
}