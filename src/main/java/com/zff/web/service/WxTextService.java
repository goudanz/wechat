package com.zff.web.service;

import com.zff.web.po.WxTextPo;

/**
 * 
 * @ClassName:  WxTextService   
 * @Description:�ı���Ϣservice
 * @author: Android_Robot  
 * @date:   2017��6��7�� ����2:13:33   
 *
 */
public interface WxTextService {
	/**
	 * @Title: fetchAnswerByGreet   
	 * @Description: �����ʺ���Ϣ��ȡ�ش���Ϣ 
	 * @param: @param wxTextPo
	 * @param: @return      
	 * @return: WxTextPo      
	 * @throws
	 */
	WxTextPo fetchAnswerByGreet(String ttGreet);
}
