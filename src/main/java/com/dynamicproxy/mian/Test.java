package com.dynamicproxy.mian;

import com.dynamicproxy.IUserController;
import com.dynamicproxy.UserController;

/**
 * @Description: 使用举例
 * @Author: yanzhihao
 * @Date: 2022/1/25 1:57 下午
 */
public class Test {
    public static void main(String[] args) {
        MetricsCollectorProxy proxy = new MetricsCollectorProxy();
        IUserController userController = (IUserController) proxy.createProxy(new UserController());
        userController.getUser();
    }
}
