package com.decorator;


/**
 * @Description:
 * @Author: yanzhihao
 * @Date: 2022/2/7 3:31 下午
 */
public class BufferedInputStream {
    protected volatile InputStream in;

    protected BufferedInputStream(InputStream in) {
        this.in = in;
    }

    // f()函数不需要增强，只是重新调用一下InputStream in对象的f()
    public void f() {
        in.f();
    }
}
