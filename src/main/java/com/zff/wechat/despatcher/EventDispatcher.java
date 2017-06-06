package com.zff.wechat.despatcher;

import java.util.Map;

import com.alibaba.druid.support.logging.Log;
import com.alibaba.druid.support.logging.LogFactory;
import com.zff.wechat.util.MessageUtil;


/**
 * @ClassName:  EventDispatcher   
 * @Description:TODO(�¼���Ϣҵ��ַ���)   
 * @author: Android_Robot  
 * @date:   2017��6��2�� ����11:34:31   
 *
 */
public class EventDispatcher {
	
	private static final Log LOG = LogFactory.getLog(MsgDispatcher.class);
	
	public static String processEvent(Map<String, String> map) {
        if (map.get("Event").equals(MessageUtil.EVENT_TYPE_SUBSCRIBE)) { //��ע�¼�
            LOG.info("==============���ǹ�ע�¼���");
        }

        if (map.get("Event").equals(MessageUtil.EVENT_TYPE_UNSUBSCRIBE)) { //ȡ����ע�¼�
            LOG.info("==============����ȡ����ע�¼���");
        }

        if (map.get("Event").equals(MessageUtil.EVENT_TYPE_SCAN)) { //ɨ���ά���¼�
            LOG.info("==============����ɨ���ά���¼���");
        }

        if (map.get("Event").equals(MessageUtil.EVENT_TYPE_LOCATION)) { //λ���ϱ��¼�
            LOG.info("==============����λ���ϱ��¼���");
        }

        if (map.get("Event").equals(MessageUtil.EVENT_TYPE_CLICK)) { //�Զ���˵�����¼�
            LOG.info("==============�����Զ���˵�����¼���");
        }

        if (map.get("Event").equals(MessageUtil.EVENT_TYPE_VIEW)) { //�Զ���˵� View �¼�
            LOG.info("==============�����Զ���˵� View �¼���");
        }

        return null;
    }
}
