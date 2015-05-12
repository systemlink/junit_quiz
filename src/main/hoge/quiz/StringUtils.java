package hoge.quiz;

import java.util.ArrayList;
import java.util.List;

public class StringUtils {
	public static List<String> distinct(List<String> list){
		if(list == null){
			return null;
		}

		List<String> uniqueArray = new ArrayList<String>();
		for(String s : list){
			if(!uniqueArray.contains(s)){
				uniqueArray.add(s);
			}
		}
		return  uniqueArray;
	}
}
