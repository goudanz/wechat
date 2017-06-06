package com.zff.wechat.message.resp;

/**
 * @ClassName:  TextMessage   
 * @Description:TODO(文本消息消息体)   
 * @author: Android_Robot  
 * @date:   2017年6月2日 下午4:20:19   
 *
 */
public class TextMessage extends BaseMessage {  
    // 回复的消息内容   
    private String Content;  

    public String getContent() {  
        return Content;  
    }  

    public void setContent(String content) {  
        Content = content;  
    }  
}