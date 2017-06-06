package com.zff.web.util;

import java.util.Properties;

public class GlobalConstants {
	public static Properties interfaceUrlProperties;

	/**
	 * @Title: getInterfaceUrl   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param: @param key
	 * @param: @return      
	 * @return: String      
	 * @throws
	 */
	public static String getInterfaceUrl(String key) {
		return (String) interfaceUrlProperties.get(key);
	}
}
