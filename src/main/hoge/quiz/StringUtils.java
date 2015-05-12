package hoge.quiz;

import java.util.ArrayList;
import java.util.List;

public class StringUtils {
	public static List<String> distinct(List<String> list){
		List<String> uniqueArray = new ArrayList<String>();

		if(list == null){
			return null;
		}

		for(String s : list){
			if(!uniqueArray.contains(s)){
				uniqueArray.add(s);
			}
		}
		return  uniqueArray;
	}
}
