package hoge.quiz;

import java.util.ArrayList;
import java.util.List;

public class StringUtils {

	public static List<String> distinct(List<String> list){
		List<String> uniqueList = new ArrayList<String>();

		if(list != null){
			uniqueList.add(list.get(0));

			for(int i=1; i<list.size(); i++){
				int j;

				for(j=0;j<uniqueList.size(); j++){
					if(uniqueList.get(j).equals(list.get(i))){
						break;
					}
				}
				if(j == uniqueList.size()){
					uniqueList.add(list.get(i));
				}
			}
		}else{
			uniqueList = list;
		}

		return uniqueList;
	}
}
