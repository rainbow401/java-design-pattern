package com.adaptor.example3.B;

import com.adaptor.example3.A.IA;

/**
 * 替换依赖的外部系统
 * @Author: yanzhihao
 * @Date 2022/2/9 4:28 下午
 */
public class BAdaptor implements IA {

    private B b;

    public BAdaptor(B b) {
        this.b = b;
    }

    @Override
    public void fa() {
        // ...
        b.fb();
    }
}
