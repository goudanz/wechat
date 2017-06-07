package com.zff.wechat.controller;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zff.wechat.despatcher.EventDispatcher;
import com.zff.wechat.despatcher.MsgDispatcher;
import com.zff.wechat.util.MessageUtil;
import com.zff.wechat.util.SignUtil;

@Controller
@RequestMapping("/wechat")
public class WechatSecurity {
    private static Logger LOG = Logger.getLogger(WechatSecurity.class);

    MsgDispatcher msgDispatcher = new MsgDispatcher();
    /**
     * @Title: doGet   
     * @Description: TODO(用于接收 get 参数，返回验证参数)   
     * @param: @param request
     * @param: @param response
     * @param: @param signature
     * @param: @param timestamp
     * @param: @param nonce
     * @param: @param echostr      
     * @return: void      
     * @throws
     */
    @RequestMapping(value = "we", method = RequestMethod.GET)
    public void doGet(
            HttpServletRequest request,
            HttpServletResponse response,
            @RequestParam(value = "signature", required = true) String signature,
            @RequestParam(value = "timestamp", required = true) String timestamp,
            @RequestParam(value = "nonce", required = true) String nonce,
            @RequestParam(value = "echostr", required = true) String echostr) {
        try {
            if (SignUtil.checkSignature(signature, timestamp, nonce)) {
                PrintWriter out = response.getWriter();
                out.print(echostr);
                out.close();
            } else {
                LOG.info("这里存在非法请求！");
            }
        } catch (Exception e) {
            LOG.error(e, e);
        }
    }

    /**
     * @Title: DoPost   
     * @Description: TODO(方法用于接收微信服务端消息)
     * @param:       
     * @return: void      
     * @throws
     */
    @RequestMapping(value = "security", method = RequestMethod.POST)
    public void DoPost(HttpServletRequest request,HttpServletResponse response) {
        try{
            Map<String, String> map=MessageUtil.parseXml(request);
            String msgtype=map.get("MsgType");
            String context = map.get("Content");
            System.out.println("==========================="+context);
            response.setCharacterEncoding("utf-8");
            if(MessageUtil.REQ_MESSAGE_TYPE_EVENT.equals(msgtype)){
                EventDispatcher.processEvent(map); //进入事件处理
            }else{
            	//进入事件处理
                String respXML = msgDispatcher.processMessage(map);
                PrintWriter out = response.getWriter();
                out.print(respXML);
                out.flush();
                out.close();
            }
        }catch(Exception e){
            LOG.error(e,e);
        }
    }
}