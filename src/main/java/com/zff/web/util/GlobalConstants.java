package com.zff.web.util;

import java.util.Properties;

public class GlobalConstants {
	public static Properties interfaceUrlProperties;

	/**
	 * @Title: getInterfaceUrl   
	 * @Description: TODO(������һ�仰�����������������)   
	 * @param: @param key
	 * @param: @return      
	 * @return: String      
	 * @throws
	 */
	public static String getInterfaceUrl(String key) {
		return (String) interfaceUrlProperties.get(key);
	}
}
