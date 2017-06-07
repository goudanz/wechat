package com.zff.web.po;

/**
 * 
 * @ClassName:  WxTextPo   
 * @Description:回复信息实体
 * @author: Android_Robot  
 * @date:   2017年6月7日 下午5:08:19   
 *
 */
public class WxTextPo extends BasePo{
	
	/** 主键*/ 
	private Long ttTextId;
	
	/** 问*/
	private String ttGreet;
	
	/** 答*/
	private String ttAnswer;

	public Long getTtTextId() {
		return ttTextId;
	}

	public void setTtTextId(Long ttTextId) {
		this.ttTextId = ttTextId;
	}

	public String getTtGreet() {
		return ttGreet;
	}

	public void setTtGreet(String ttGreet) {
		this.ttGreet = ttGreet;
	}

	public String getTtAnswer() {
		return ttAnswer;
	}

	public void setTtAnswer(String ttAnswer) {
		this.ttAnswer = ttAnswer;
	}
	
}
