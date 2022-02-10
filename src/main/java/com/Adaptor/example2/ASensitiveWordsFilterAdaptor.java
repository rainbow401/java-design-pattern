package com.Adaptor.example2;

/**
 * 统一多个类的接口设计
 * @Author: yanzhihao
 * @Date 2022/2/9 3:56 下午
 */
public class ASensitiveWordsFilterAdaptor implements ISensitiveWordsFilter {

    private ASensitiveWordsFilter aFilter;

    @Override
    public String filter(String text) {
        String maskedText = aFilter.filterSexyWords(text);
        maskedText = aFilter.filterPoliticalWords(maskedText);
        return maskedText;
    }
}
