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

    public static boolean isBlank(String str){
    	if(str == null || str.length() == 0){
    		return true;
    	}
        return false;
    }

    public static boolean indexOf(String str,char searchChar){
        return false;
    }

    public static String defaultString(String str){
        return null;
    }

    public static String defaultString(String str, String defaultStr){
        return null;
    }

    public static int length(String str){
        return (Integer) null;
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
