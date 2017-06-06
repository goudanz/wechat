package com.zff.wechat.common;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import net.sf.json.JSONObject;

import com.zff.web.util.GlobalConstants;
import com.zff.wechat.quartz.QuartzJob;
import com.zff.wechat.util.HttpUtils;

/**
 * 
 * @ClassName:  WeChatTask   
 * @Description:微信两小时定时任务体
 * @author: Android_Robot  
 * @date:   2017年6月6日 下午7:34:41   
 *
 */
public class WeChatTask {
	
	private static Logger LOG = Logger.getLogger(QuartzJob.class);
    /**
     * @Description: 任务执行体
     * @param @throws Exception
     * @author dapengniao
     * @date 2016 年 3 月 10 日 下午 2:04:37
     */
    public void getToken_getTicket() throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("grant_type", "client_credential");
        params.put("appid", GlobalConstants.getInterfaceUrl("appid"));
        params.put("secret", GlobalConstants.getInterfaceUrl("AppSecret"));
        String jstoken = HttpUtils.sendGet(
                GlobalConstants.getInterfaceUrl("tokenUrl"), params);
        String access_token = JSONObject.fromObject(jstoken).getString(
                "access_token"); // 获取到 token 并赋值保存
        GlobalConstants.interfaceUrlProperties.put("access_token", access_token);
        LOG.info(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())+" token 为====================="+access_token);
    }

}
