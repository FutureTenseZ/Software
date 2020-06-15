package com.java1234.util;
/**
 * 字符串工具类
 * @author houpu
 *
 */
public class StringUtil {

	public static boolean isEmpty(String str) {
		if(str==null ||"".equals(str.trim())) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean isNotEmpty(String str) {
		if(str!=null &&"".equals(str.trim())) {
			return true;
		}else {
			return false;
		}
	}
}
