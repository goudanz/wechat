package com.zff.wechat.message.resp;

/**
 * @ClassName:  Video   
 * @Description:��Ƶ��Ϣ��
 * @author: Android_Robot  
 * @date:   2017��6��2�� ����4:23:28   
 *
 */
public class Video {

    private String MediaId;
    private String Title;
    private String Description;

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

    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }

}
