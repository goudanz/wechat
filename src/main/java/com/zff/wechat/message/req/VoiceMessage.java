package com.zff.wechat.message.req;
/**
 * @ClassName:  VoiceMessage   
 * @Description:TODO(������Ϣ)   
 * @author: Android_Robot  
 * @date:   2017��6��2�� ����11:04:54   
 *
 */
public class VoiceMessage extends BaseMessage{
	// ý�� ID   
    private String MediaId;  
    // ������ʽ   
    private String Format;
	public String getMediaId() {
		return MediaId;
	}
	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}
	public String getFormat() {
		return Format;
	}
	public void setFormat(String format) {
		Format = format;
	}  
    
}
