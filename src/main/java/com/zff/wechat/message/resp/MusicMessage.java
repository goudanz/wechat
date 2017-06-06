package com.zff.wechat.message.resp;

/**
 * 
 * @ClassName:  MusicMessage   
 * @Description:音乐消息   
 * @author: Android_Robot  
 * @date:   2017年6月2日 下午4:23:01   
 *
 */
public class MusicMessage extends BaseMessage {  
    // 音乐   
    private Music Music;  

    public Music getMusic() {  
        return Music;  
    }  

    public void setMusic(Music music) {  
        Music = music;  
    }  
}
