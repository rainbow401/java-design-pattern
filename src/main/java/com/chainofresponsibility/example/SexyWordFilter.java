package com.chainofresponsibility.example;

/**
 * @author yanzhihao
 * @since 2022/5/24
 */
public class SexyWordFilter implements SensitiveWordFilter{
    @Override
    public boolean doFilter(Content content) {
        boolean legal = true;
        //...
        return legal;
    }
}
