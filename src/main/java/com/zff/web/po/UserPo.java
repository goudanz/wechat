package com.zff.web.po;

/**
 * 
 * @ClassName:  UserPo   
 * @Description:用户po
 * @author: Android_Robot  
 * @date:   2017年6月6日 下午8:19:24   
 *
 */
public class UserPo extends BasePo{
	private Long userId;
	
	private String userName;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
