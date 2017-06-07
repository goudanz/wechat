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
 * @Description:(��Ϣҵ����ַ���)   
 * @author: Android_Robot  
 * @date:   2017��6��2�� ����11:06:16   
 *
 */
public class MsgDispatcher {
	private static final Log LOG = LogFactory.getLog(MsgDispatcher.class);
	
	@Autowired
	private WxTextService wxTextService;
	
	
	public String processMessage(Map<String, String> map) {
		String openid=map.get("FromUserName"); //�û� openid
    	String mpid=map.get("ToUserName");   //���ں�ԭʼ ID
    	String ttGreet = map.get("Content");
		// �ı���Ϣ
        if (map.get("MsgType").equals(MessageUtil.REQ_MESSAGE_TYPE_TEXT)) { 
        	LOG.info("==============�����ı���Ϣ��");
        	// �Ȼ�ȡ���ʵ����⣬Ȼ��ȥ���ݿ���ƥ�䣬��ƥ�䵽�����ݷ��أ����ƥ�䲻�����͵��������ӿڣ���ȡ��Ϣ
//        	WxTextPo wxTextPo = wxTextService.fetchAnswerByGreet(ttGreet);
//        	 ��ͨ�ı���Ϣ
        	TextMessage txtmsg=new TextMessage();
        	txtmsg.setFromUserName(mpid);
        	txtmsg.setToUserName(openid);
        	txtmsg.setCreateTime(new Date().getTime());
        	txtmsg.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);
        	if (map.get("MsgType").equals(MessageUtil.REQ_MESSAGE_TYPE_TEXT)) { // �ı���Ϣ
        	    txtmsg.setContent("��ã��������ܷǷ������˺ţ�");
        	    return MessageUtil.textMessageToXml(txtmsg);
        	}
        }

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        if (map.get("MsgType").equals(MessageUtil.REQ_MESSAGE_TYPE_IMAGE)) { // ͼƬ��Ϣ
            LOG.info("==============����ͼƬ��Ϣ��");
            //��ͼ����Ϣ
            NewsMessage newmsg=new NewsMessage();
            newmsg.setToUserName(openid);
            newmsg.setFromUserName(mpid);
            newmsg.setCreateTime(new Date().getTime());
            newmsg.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_NEWS);

            if (map.get("MsgType").equals(MessageUtil.REQ_MESSAGE_TYPE_IMAGE)) { // ͼƬ��Ϣ
                System.out.println("==============����ͼƬ��Ϣ��");
                Article article=new Article();
                article.setDescription("ͼ����Ϣ"); //ͼ����Ϣ������
                article.setPicUrl(""); //ͼ����ϢͼƬ��ַ
                article.setTitle("ͼ����Ϣ ");  //ͼ����Ϣ����
                article.setUrl("http://www.dancoder.cn/");  //ͼ�� url ����
                List<Article> list=new ArrayList<Article>();
                list.add(article);     //���﷢�͵��ǵ�ͼ�ģ������Ҫ���Ͷ�ͼ���������� list �м����� Article ���ɣ�
                newmsg.setArticleCount(list.size());
                newmsg.setArticles(list);
                return MessageUtil.newsMessageToXml(newmsg);
            }  
        }

        if (map.get("MsgType").equals(MessageUtil.REQ_MESSAGE_TYPE_LINK)) { // ������Ϣ
        	LOG.info("==============����������Ϣ��");
        }

        if (map.get("MsgType").equals(MessageUtil.REQ_MESSAGE_TYPE_LOCATION)) { // λ����Ϣ
        	LOG.info("==============����λ����Ϣ��");
        }

        if (map.get("MsgType").equals(MessageUtil.REQ_MESSAGE_TYPE_VIDEO)) { // ��Ƶ��Ϣ
        	LOG.info("==============������Ƶ��Ϣ��");
        }

        if (map.get("MsgType").equals(MessageUtil.REQ_MESSAGE_TYPE_VOICE)) { // ������Ϣ
        	if (map.get("MsgType").equals(MessageUtil.REQ_MESSAGE_TYPE_VOICE)) { 
        		LOG.info("==============����������Ϣ��");
            	
            	//��ͨ������Ϣ
            	TextMessage txtmsg=new TextMessage();
            	txtmsg.setFromUserName(mpid);
            	txtmsg.setToUserName(openid);
            	txtmsg.setCreateTime(new Date().getTime());
            	txtmsg.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);

            	if (map.get("MsgType").equals(MessageUtil.REQ_MESSAGE_TYPE_VOICE)) { // ������Ϣ
            	    txtmsg.setContent("��֪����������������������Ǻܱ�ǸŶ��С������������Ŷ���������أ�");
            	    return MessageUtil.textMessageToXml(txtmsg);
            	}
            }
        }

        return null;
    }
}
