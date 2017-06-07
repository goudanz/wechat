package com.zff.web.dao;

import org.springframework.stereotype.Repository;

import com.zff.web.po.WxTextPo;

@Repository
public interface WxTextDao {
	
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
