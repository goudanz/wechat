package com.zff.wechat.despatcher;

import java.util.Map;

import com.alibaba.druid.support.logging.Log;
import com.alibaba.druid.support.logging.LogFactory;
import com.zff.wechat.util.MessageUtil;


/**
 * @ClassName:  EventDispatcher   
 * @Description:TODO(事件消息业务分发器)   
 * @author: Android_Robot  
 * @date:   2017年6月2日 上午11:34:31   
 *
 */
public class EventDispatcher {
	
	private static final Log LOG = LogFactory.getLog(MsgDispatcher.class);
	
	public static String processEvent(Map<String, String> map) {
        if (map.get("Event").equals(MessageUtil.EVENT_TYPE_SUBSCRIBE)) { //关注事件
            LOG.info("==============这是关注事件！");
        }

        if (map.get("Event").equals(MessageUtil.EVENT_TYPE_UNSUBSCRIBE)) { //取消关注事件
            LOG.info("==============这是取消关注事件！");
        }

        if (map.get("Event").equals(MessageUtil.EVENT_TYPE_SCAN)) { //扫描二维码事件
            LOG.info("==============这是扫描二维码事件！");
        }

        if (map.get("Event").equals(MessageUtil.EVENT_TYPE_LOCATION)) { //位置上报事件
            LOG.info("==============这是位置上报事件！");
        }

        if (map.get("Event").equals(MessageUtil.EVENT_TYPE_CLICK)) { //自定义菜单点击事件
            LOG.info("==============这是自定义菜单点击事件！");
        }

        if (map.get("Event").equals(MessageUtil.EVENT_TYPE_VIEW)) { //自定义菜单 View 事件
            LOG.info("==============这是自定义菜单 View 事件！");
        }

        return null;
    }
}
