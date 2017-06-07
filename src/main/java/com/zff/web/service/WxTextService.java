package com.zff.web.service;

import com.zff.web.po.WxTextPo;

/**
 * 
 * @ClassName:  WxTextService   
 * @Description:文本信息service
 * @author: Android_Robot  
 * @date:   2017年6月7日 下午2:13:33   
 *
 */
public interface WxTextService {
	/**
	 * @Title: fetchAnswerByGreet   
	 * @Description: 根据问候信息获取回答信息 
	 * @param: @param wxTextPo
	 * @param: @return      
	 * @return: WxTextPo      
	 * @throws
	 */
	WxTextPo fetchAnswerByGreet(String ttGreet);
}
