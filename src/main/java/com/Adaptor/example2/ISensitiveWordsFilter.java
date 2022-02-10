package com.Adaptor.example2;

/**
 * 使用适配器模式
 * 统一的接口定义
 */
public interface ISensitiveWordsFilter {
    String filter(String text);
}
