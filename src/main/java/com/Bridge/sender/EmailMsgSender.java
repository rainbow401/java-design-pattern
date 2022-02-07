package com.Bridge.sender;

import java.util.List;

/**
 * @Description:
 * @Author: yanzhihao
 * @Date: 2022/2/7 9:51 上午
 */
public class EmailMsgSender implements MsgSender{
    private List<String> emilList;

    public EmailMsgSender(List<String> emilList) {
        this.emilList = emilList;
    }

    @Override
    public void send(String message) {
        // ... 邮件通知发送逻辑
    }
}
