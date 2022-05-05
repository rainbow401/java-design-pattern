package com.bridge.sender;

import java.util.List;

/**
 * @Description:
 * @Author: yanzhihao
 * @Date: 2022/2/7 9:49 上午
 */
public class TelephoneMsgSender implements MsgSender{
    private List<String> telephones;

    public TelephoneMsgSender(List<String> telephones) {
        this.telephones = telephones;
    }

    @Override
    public void send(String message) {
        //... 手机信息通知发送逻辑
    }
}
