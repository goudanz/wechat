package com.zff.web.po;

/**
 * 
 * @ClassName:  UserPo   
 * @Description:�û�po
 * @author: Android_Robot  
 * @date:   2017��6��6�� ����8:19:24   
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
