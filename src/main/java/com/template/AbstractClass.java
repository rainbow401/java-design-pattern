package com.template;

/**
 * 模板模式
 * @author yanzhihao
 * @since 2022/5/7
 */
public abstract class AbstractClass {

    public final void templateMethod() {
        //...
        method1();
        //...
        method2();
    }

    protected abstract void method1();
    protected abstract void method2();
}
