package com.chainofresponsibility.example;

/**
 * @author yanzhihao
 * @since 2022/5/24
 */
public interface SensitiveWordFilter {
    
    boolean doFilter(Content content);
}
