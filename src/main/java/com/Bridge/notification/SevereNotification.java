package com.Bridge.notification;

import com.Bridge.sender.MsgSender;

/**
 * @Description:
 * @Author: yanzhihao
 * @Date: 2022/2/7 9:55 上午
 */
public class SevereNotification extends Notification{

    public SevereNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {
        msgSender.send(message);
    }
}
