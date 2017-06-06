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
 * @Description:΢����Сʱ��ʱ������
 * @author: Android_Robot  
 * @date:   2017��6��6�� ����7:34:41   
 *
 */
public class WeChatTask {
	
	private static Logger LOG = Logger.getLogger(QuartzJob.class);
    /**
     * @Description: ����ִ����
     * @param @throws Exception
     * @author dapengniao
     * @date 2016 �� 3 �� 10 �� ���� 2:04:37
     */
    public void getToken_getTicket() throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("grant_type", "client_credential");
        params.put("appid", GlobalConstants.getInterfaceUrl("appid"));
        params.put("secret", GlobalConstants.getInterfaceUrl("AppSecret"));
        String jstoken = HttpUtils.sendGet(
                GlobalConstants.getInterfaceUrl("tokenUrl"), params);
        String access_token = JSONObject.fromObject(jstoken).getString(
                "access_token"); // ��ȡ�� token ����ֵ����
        GlobalConstants.interfaceUrlProperties.put("access_token", access_token);
        LOG.info(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())+" token Ϊ====================="+access_token);
    }

}
