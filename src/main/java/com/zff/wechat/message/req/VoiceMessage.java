package com.zff.wechat.message.req;
/**
 * @ClassName:  VoiceMessage   
 * @Description:TODO(语音消息)   
 * @author: Android_Robot  
 * @date:   2017年6月2日 上午11:04:54   
 *
 */
public class VoiceMessage extends BaseMessage{
	// 媒体 ID   
    private String MediaId;  
    // 语音格式   
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
