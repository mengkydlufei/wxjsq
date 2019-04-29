package com.ddqmua.wxjsq.wxlogin.controller;

import com.ddqmua.wxjsq.wxlogin.service.CoreService;
import com.ddqmua.wxjsq.wxlogin.utils.SignUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by 1 on 2018/10/11.
 */
@Controller
public class WeChatController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "wechat",method = RequestMethod.GET)
    public void wechat(HttpServletRequest request, HttpServletResponse response) throws IOException {
        logger.info("请求成功");

        // 微信加密签名
        String signature = request.getParameter("signature");
        // 时间戳
        String timestamp = request.getParameter("timestamp");
        // 随机数
        String nonce = request.getParameter("nonce");
        // 随机字符串
        String echostr = request.getParameter("echostr");
        logger.info(signature+"----------"+timestamp+"--------"+nonce+"----------"+echostr);
        PrintWriter out = response.getWriter();
        // 通过检验signature对请求进行校验，若校验成功则原样返回echostr，表示接入成功，否则接入失败
        if (SignUtil.checkSignature(signature, timestamp, nonce)) {
            out.print(echostr);
        }

        out.close();
        out = null;
    }

    @RequestMapping(value = "do",method = RequestMethod.POST)
    public void dopost(HttpServletRequest request, HttpServletResponse response) throws Exception{
        // 消息的接收、处理、响应
        // 将请求、响应的编码均设置为UTF-8（防止中文乱码）
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        // 调用核心业务类接收消息、处理消息
        String respXml = CoreService.processRequest(request);

        // 响应消息
        PrintWriter out = response.getWriter();
        out.print(respXml);
        out.close();
    }

}
