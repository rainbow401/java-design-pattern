package com.chainofresponsibility.b;

/**
 * 所有的handler执行
 * @author yanzhihao
 * @since 2022/5/24
 */
public class Test {
    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new HandlerA());
        chain.addHandler(new HandlerB());
        chain.handle();
    }
}
