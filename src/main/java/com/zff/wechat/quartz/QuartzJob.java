package com.zff.wechat.quartz;

import org.apache.log4j.Logger;

import com.zff.wechat.common.WeChatTask;

public class QuartzJob{
    private static Logger LOG = Logger.getLogger(QuartzJob.class);

    /**
     * 
     * @Title: workForToken   
     * @Description:����ִ�л�ȡ token
     * @param:       
     * @return: void      
     * @throws
     */
    public void workForToken() {
        try {
            WeChatTask timer = new WeChatTask();
            timer.getToken_getTicket();
        } catch (Exception e) {
            LOG.error(e, e);
        }
    }

}