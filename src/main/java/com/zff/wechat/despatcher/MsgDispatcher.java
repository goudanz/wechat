package com.zff.wechat.despatcher;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.druid.support.logging.Log;
import com.alibaba.druid.support.logging.LogFactory;
import com.zff.web.po.WxTextPo;
import com.zff.web.service.WxTextService;
import com.zff.web.service.impl.WxTextServiceImpl;
import com.zff.wechat.message.resp.Article;
import com.zff.wechat.message.resp.NewsMessage;
import com.zff.wechat.message.resp.TextMessage;
import com.zff.wechat.util.MessageUtil;


/**
 * 
 * @ClassName:  MsgDispatcher   
 * @Description:(消息业务处理分发器)   
 * @author: Android_Robot  
 * @date:   2017年6月2日 上午11:06:16   
 *
 */
public class MsgDispatcher {
	private static final Log LOG = LogFactory.getLog(MsgDispatcher.class);
	
	@Autowired
	private WxTextService wxTextService;
	
	
	public String processMessage(Map<String, String> map) {
		String openid=map.get("FromUserName"); //用户 openid
    	String mpid=map.get("ToUserName");   //公众号原始 ID
    	String ttGreet = map.get("Content");
		// 文本消息
        if (map.get("MsgType").equals(MessageUtil.REQ_MESSAGE_TYPE_TEXT)) { 
        	LOG.info("==============这是文本消息！");
        	// 先获取到问的问题，然后去数据库中匹配，将匹配到的数据返回，如果匹配不到，就调用搜索接口，获取信息
//        	WxTextPo wxTextPo = wxTextService.fetchAnswerByGreet(ttGreet);
//        	 普通文本消息
        	TextMessage txtmsg=new TextMessage();
        	txtmsg.setFromUserName(mpid);
        	txtmsg.setToUserName(openid);
        	txtmsg.setCreateTime(new Date().getTime());
        	txtmsg.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);
        	if (map.get("MsgType").equals(MessageUtil.REQ_MESSAGE_TYPE_TEXT)) { // 文本消息
        	    txtmsg.setContent("你好，这里是周非凡个人账号！");
        	    return MessageUtil.textMessageToXml(txtmsg);
        	}
        }

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        if (map.get("MsgType").equals(MessageUtil.REQ_MESSAGE_TYPE_IMAGE)) { // 图片消息
            LOG.info("==============这是图片消息！");
            //对图文消息
            NewsMessage newmsg=new NewsMessage();
            newmsg.setToUserName(openid);
            newmsg.setFromUserName(mpid);
            newmsg.setCreateTime(new Date().getTime());
            newmsg.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_NEWS);

            if (map.get("MsgType").equals(MessageUtil.REQ_MESSAGE_TYPE_IMAGE)) { // 图片消息
                System.out.println("==============这是图片消息！");
                Article article=new Article();
                article.setDescription("图文消息"); //图文消息的描述
                article.setPicUrl(""); //图文消息图片地址
                article.setTitle("图文消息 ");  //图文消息标题
                article.setUrl("http://www.dancoder.cn/");  //图文 url 链接
                List<Article> list=new ArrayList<Article>();
                list.add(article);     //这里发送的是单图文，如果需要发送多图文则在这里 list 中加入多个 Article 即可！
                newmsg.setArticleCount(list.size());
                newmsg.setArticles(list);
                return MessageUtil.newsMessageToXml(newmsg);
            }  
        }

        if (map.get("MsgType").equals(MessageUtil.REQ_MESSAGE_TYPE_LINK)) { // 链接消息
        	LOG.info("==============这是链接消息！");
        }

        if (map.get("MsgType").equals(MessageUtil.REQ_MESSAGE_TYPE_LOCATION)) { // 位置消息
        	LOG.info("==============这是位置消息！");
        }

        if (map.get("MsgType").equals(MessageUtil.REQ_MESSAGE_TYPE_VIDEO)) { // 视频消息
        	LOG.info("==============这是视频消息！");
        }

        if (map.get("MsgType").equals(MessageUtil.REQ_MESSAGE_TYPE_VOICE)) { // 语音消息
        	if (map.get("MsgType").equals(MessageUtil.REQ_MESSAGE_TYPE_VOICE)) { 
        		LOG.info("==============这是语音消息！");
            	
            	//普通语音消息
            	TextMessage txtmsg=new TextMessage();
            	txtmsg.setFromUserName(mpid);
            	txtmsg.setToUserName(openid);
            	txtmsg.setCreateTime(new Date().getTime());
            	txtmsg.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);

            	if (map.get("MsgType").equals(MessageUtil.REQ_MESSAGE_TYPE_VOICE)) { // 语音消息
            	    txtmsg.setContent("我知道你想和我语音交流，但是很抱歉哦，小狗蛋家里有人哦！不方便呢！");
            	    return MessageUtil.textMessageToXml(txtmsg);
            	}
            }
        }

        return null;
    }
}
