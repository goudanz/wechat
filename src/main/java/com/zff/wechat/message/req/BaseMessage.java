package com.zff.wechat.message.req;

/**
 * @ClassName:  BaseMessage   
 * @Description:(΢��������Ϣ������)   
 * @author: Android_Robot  
 * @date:   2017��6��2�� ����11:00:52   
 *
 */
public class BaseMessage {
	// ������΢�ź�
    private String ToUserName;
    // ���ͷ��ʺţ�һ�� OpenID��
    private String FromUserName;
    // ��Ϣ����ʱ�� �����ͣ�
    private Long CreateTime;
    // ��Ϣ���ͣ�text/image/location/link/video/shortvideo��
    private String MsgType;
    // ��Ϣ id��64 λ����
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
