package com.zff.web.po;

/**
 * 
 * @ClassName:  WxTextPo   
 * @Description:�ظ���Ϣʵ��
 * @author: Android_Robot  
 * @date:   2017��6��7�� ����5:08:19   
 *
 */
public class WxTextPo extends BasePo{
	
	/** ����*/ 
	private Long ttTextId;
	
	/** ��*/
	private String ttGreet;
	
	/** ��*/
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
