package com.zff.wechat.message.req;

/**
 * 
 * @ClassName:  VideoMessage   
 * @Description:(视频/小视屏消息)   
 * @author: Android_Robot  
 * @date:   2017年6月2日 上午11:03:48   
 *
 */
public class VideoMessage extends BaseMessage{

	private String MediaId; // 视频消息媒体 id，可以调用多媒体文件下载接口拉取数据
    private String ThumbMediaId; // 视频消息缩略图的媒体 id，可以调用多媒体文件下载接口拉取数据
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
