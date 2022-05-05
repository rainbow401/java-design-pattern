package com.bridge.notification;

import com.bridge.sender.MsgSender;

/**
 * @Description:
 * @Author: yanzhihao
 * @Date: 2022/2/7 9:52 上午
 */
public abstract class Notification {
    protected MsgSender msgSender;

    public Notification(MsgSender msgSender) {
        this.msgSender = msgSender;
    }

    public abstract void notify(String message);
}
