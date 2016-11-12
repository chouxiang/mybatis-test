package com.xzhang.util;

import java.io.UnsupportedEncodingException;

public class CommonUtil {
	
	
	/**
	 * 根据数据对(key-value)拼接成字符串,如果key对应的value没有值,必须填入空字符串或者null.
	 * @param keys
	 * @param vals
	 * @param concatChar
	 * @return
	 */
	public static String buildKeyValuePairStr(String[] keys, Object[] vals, String concatChar) {
		StringBuilder sb = new StringBuilder();
		if(keys != null && 
				vals != null && 
					keys.length == vals.length) {
			for(int i=0; i < keys.length; i++) {
				if(i==0) {
					sb.append(keys[0]);
					sb.append("=");
					if(vals[0]!=null) {						
						sb.append(vals[0]);
					}
				}else {
					sb.append(concatChar);
					sb.append(keys[i]);
					sb.append("=");
					if(vals[i]!=null) {						
						sb.append(vals[i]);
					}
				}
			}
		}
		return sb.toString();
	}
	
	/**
	 * URL编码（utf-8）
	 * 
	 * @param source
	 * @return
	 */
	public static String encodeUTF8(String source) {
		String result = source;
		try {
			result = java.net.URLEncoder.encode(source, "utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * URL编码（utf-8）
	 * 
	 * @param source
	 * @return
	 */
	public static String decodeUTF8(String source) {
		String result = source;
		try {
			result = java.net.URLDecoder.decode(source, "utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return result;
	}
	
}
