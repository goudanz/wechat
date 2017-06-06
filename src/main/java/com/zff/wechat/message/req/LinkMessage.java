package com.zff.wechat.message.req;

/**
 * @ClassName:  LinkMessage   
 * @Description:(链接消息)   
 * @author: Android_Robot  
 * @date:   2017年6月2日 上午11:02:15   
 *
 */
public class LinkMessage {

	// 消息标题
    private String Title;
    // 消息描述
    private String Description;
    // 消息链接
    private String Url;
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getUrl() {
		return Url;
	}
	public void setUrl(String url) {
		Url = url;
	}
    
}
