package hoge.quiz;

import java.util.stream.Collectors;

import org.junit.Assert;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;


public class StringUtils {
	//test5
	public static List<String> distinct(List<String> list){
		if(list == null) {
			return null;
		}
		return list.stream().distinct().collect(Collectors.toList());
	}
	
	//test6
	public static boolean isBlank(String str) {
		if(str == null) {
			return true;
		}
		str = str.replaceAll("　","");
		str = str.trim();
		if(str.length() > 0) {
			return false;
		}
		return true;
	}

	//test7
	public static int indexOf(String str, char searchChar) {
		if(str == null || str == "" ) {
			return -1;
		}
		return str.indexOf(searchChar);
	}

	//test8
	public static String defaultString(String str) {
		if(str == null) {
			return "";
		}
		return str;
	}

	//test9
	public static String defaultString(String str, String defaultStr) {
		if(str == null) {
			return defaultStr;
		}
		return str;
	}

	//test10
	public static int length(String str) {
		if(str == null || str == "") {
			return 0;
		}
		return str.length();
	}

	
	
	
	//test11
	public static String substring(String str, int start) { 
		if(str == null) {
			return null;
		}
	
		String[] strArray = str.split("");
		StringBuilder sb = new StringBuilder();
		
		//start引数が(-)の場合の標準化
		if(start < 0) {
			start = str.length() + start;
		}
		
		//strの切り出し
		for(int i = 0;i < str.length();i++) {
			if(i >= start) {
				sb.append(strArray[i]);
			}
		}
		return str = sb.toString();
	}
	
	//test12
	public static String substring(String str, int start, int end) {
		if(str == null) {
			return null;
		}
	
		//end引数がstr.lengthより大きい場合エラーになるのでエラー回避
		if(end > str.length()) {
			end = str.length();
		}
		
		String[] strArray = str.split("");
		StringBuilder sb = new StringBuilder();
		
		//start引数が(-)の場合の標準化
		if(start < 0) {
			start = str.length() + start;
		}
		
		//end引数が(-)の場合の標準化
		if(end < 0) {
			end = str.length() + end;
		}
		
		//strの切り出し
		for(int i = 0;i < end;i++) {
			if(i >= start) {
				sb.append(strArray[i]);
			}
		}
		return str = sb.toString();
	}

//------------------------------------------------------------------------------------------
	
		//test13
		public static String replace(String text, String searchString,String replacement) {
			if(text == null) {
				return null;
			} else if(text == "") {
				return "";
			}
			
			if(searchString == null || replacement == null) {
				return text;
			}
			
			
			
		return text.replace(searchString,replacement);
		}
	
//------------------------------------------------------------------------------------------------
	//test14
	public static boolean isEmpty(String str) {
		if(str == null || str == "") {
			return true;
		}
		return false;
	}
}
