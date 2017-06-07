package com.zff.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zff.web.dao.WxTextDao;
import com.zff.web.po.WxTextPo;
import com.zff.web.service.WxTextService;

/**
 * 
 * @ClassName:  WxTextServiceImpl   
 * @Description:文本信息service 实现类
 * @author: Android_Robot  
 * @date:   2017年6月7日 下午2:14:17   
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
			// 如果为空，则调用搜索接口，查出该回复什么信息，保存并返回
		}
		return newWxTextPo;
	}

}
