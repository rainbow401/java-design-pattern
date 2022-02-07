package com.DynamicProxy;

/**
 * @Description:
 * @Author: yanzhihao
 * @Date: 2022/1/25 1:48 下午
 */
public class UserController implements IUserController{
    @Override
    public void getUser() {
        System.out.println("get user!");
    }
}
