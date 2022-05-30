package com.chainofresponsibility.a;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yanzhihao
 * @since 2022/5/24
 */
public class HandlerChain {

    private List<IHandler> handlers = new ArrayList<>();

    public void addHandler(IHandler handler) {
        this.handlers.add(handler);
    }

    public void handle() {
        for (IHandler handler : handlers) {
            boolean handled = handler.handle();
            if (handled) {
                break;
            }
        }
    }
}
