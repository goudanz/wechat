package com.zff.wechat.message.req;

/**
 * @ClassName:  BaseMessage   
 * @Description:(微信请求消息基本类)   
 * @author: Android_Robot  
 * @date:   2017年6月2日 上午11:00:52   
 *
 */
public class BaseMessage {
	// 开发者微信号
    private String ToUserName;
    // 发送方帐号（一个 OpenID）
    private String FromUserName;
    // 消息创建时间 （整型）
    private Long CreateTime;
    // 消息类型（text/image/location/link/video/shortvideo）
    private String MsgType;
    // 消息 id，64 位整型
    private Long MsgId;
	public String getToUserName() {
		return ToUserName;
	}
	public void setToUserName(String toUserName) {
		ToUserName = toUserName;
	}
	public String getFromUserName() {
		return FromUserName;
	}
	public void setFromUserName(String fromUserName) {
		FromUserName = fromUserName;
	}
	public Long getCreateTime() {
		return CreateTime;
	}
	public void setCreateTime(Long createTime) {
		CreateTime = createTime;
	}
	public String getMsgType() {
		return MsgType;
	}
	public void setMsgType(String msgType) {
		MsgType = msgType;
	}
	public Long getMsgId() {
		return MsgId;
	}
	public void setMsgId(Long msgId) {
		MsgId = msgId;
	}
    
}
