package com.zff.web.dao;

import org.springframework.stereotype.Repository;

import com.zff.web.po.WxTextPo;

@Repository
public interface WxTextDao {
	
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
