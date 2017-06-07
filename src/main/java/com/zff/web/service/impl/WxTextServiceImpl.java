package com.zff.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zff.web.dao.WxTextDao;
import com.zff.web.po.WxTextPo;
import com.zff.web.service.WxTextService;

/**
 * 
 * @ClassName:  WxTextServiceImpl   
 * @Description:�ı���Ϣservice ʵ����
 * @author: Android_Robot  
 * @date:   2017��6��7�� ����2:14:17   
 *
 */
@Service
public class WxTextServiceImpl implements WxTextService {

	@Autowired
	private WxTextDao wxTextDao;
	
	@Override
	public WxTextPo fetchAnswerByGreet(String ttGreet) {
		WxTextPo newWxTextPo = wxTextDao.fetchAnswerByGreet(ttGreet);
		if (newWxTextPo==null) {
			// ���Ϊ�գ�����������ӿڣ�����ûظ�ʲô��Ϣ�����沢����
		}
		return newWxTextPo;
	}

}
