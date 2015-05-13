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
	public static boolean isBlank(String str){
		if(str == null || str.equals("")){
			return true;
		}
		return false;
    }

    public static int indexOf(String str,char searchChar){
    	if(str == null){
    		return -1;
    	}
    	return str.indexOf(searchChar);
    }

    public static String defaultString(String str){
    	if(str == null){
    		return "";
    	}
        return str;
    }

    public static String defaultString(String str, String defaultStr){
    	if(str == null){
    		return defaultStr;
    	}
        return str;
    }

    public static int length(String str){
        return 0;
    }

    public static String substring(String str, int start){
        return null;
    }

    public static String substring(String str, int start ,int end){
        return null;
    }

    public static String replace(String text, String searchString, String replacement){
        return null;
    }
}
