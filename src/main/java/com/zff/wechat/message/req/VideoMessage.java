package com.zff.wechat.message.req;

/**
 * 
 * @ClassName:  VideoMessage   
 * @Description:(��Ƶ/С������Ϣ)   
 * @author: Android_Robot  
 * @date:   2017��6��2�� ����11:03:48   
 *
 */
public class VideoMessage extends BaseMessage{

	private String MediaId; // ��Ƶ��Ϣý�� id�����Ե��ö�ý���ļ����ؽӿ���ȡ����
    private String ThumbMediaId; // ��Ƶ��Ϣ����ͼ��ý�� id�����Ե��ö�ý���ļ����ؽӿ���ȡ����
	public String getMediaId() {
		return MediaId;
	}
	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}
	public String getThumbMediaId() {
		return ThumbMediaId;
	}
	public void setThumbMediaId(String thumbMediaId) {
		ThumbMediaId = thumbMediaId;
	}
    
}
