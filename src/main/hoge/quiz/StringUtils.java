package hoge.quiz;

import java.util.ArrayList;
import java.util.List;

public class StringUtils {

	public static List<String> distinct(List<String> list){
		if(list==null){
			return list;
		}

		List<String> uniqueList = new ArrayList<String>();

		for(int i=0; i<list.size(); i++){
			if(!uniqueList.contains(list.get(i))){
				uniqueList.add(list.get(i));				}
		}
		return uniqueList;
	}
}
