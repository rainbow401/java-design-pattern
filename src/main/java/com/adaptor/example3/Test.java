package com.adaptor.example3;

import com.adaptor.example3.A.A;
import com.adaptor.example3.B.B;
import com.adaptor.example3.B.BAdaptor;

/**
 * 替换依赖的外部系统
 * @Author: yanzhihao
 * @Date 2022/2/9 4:29 下午
 */
public class Test {

    public static void main(String[] args) {
        //一开始使用外部A系统
        Demo a = new Demo(new A());

        //将A系统更换为外部B系统
        Demo b = new Demo(new BAdaptor(new B()));
    }
}
