package com.bridge.notification;

import com.bridge.sender.MsgSender;

/**
 * @Description:
 * @Author: yanzhihao
 * @Date: 2022/2/7 9:57 上午
 */
public class UrgencyNotification extends Notification{

    public UrgencyNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {
        msgSender.send(message);
    }
}
