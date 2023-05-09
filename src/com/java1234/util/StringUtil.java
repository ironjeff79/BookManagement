package com.java1234.util;

/**
 * 字符串工具类
 * @author 47922
 *
 */
public class StringUtil {
	/**
	 * 判断是否是空
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str){
		if(null == str || "".equals(str.trim())){
			return true;
		}else{
			return false;
		}
	}
	/**
	 * 判断是否不是空
	 * @param str
	 * @return
	 */
	public static boolean isNotEmpty(String str){
		if(null != str && !"".equals(str.trim())){
			return true;
		}else{
			return false;
		}
	}
}
