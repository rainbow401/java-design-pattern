package com.template;

/**
 * @author yanzhihao
 * @since 2022/5/7
 */
public class demo {
    public static void main(String[] args) {
        AbstractClass demo = new ConcreteClass1();
        demo.templateMethod();
    }
}
