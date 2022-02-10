package com.Adaptor.example2;

import java.util.ArrayList;
import java.util.List;

/**
 * 统一多个类的接口设计
 * @Author: yanzhihao
 * @Date 2022/2/9 3:59 下午
 */
public class RiskManagement {

    private List<ISensitiveWordsFilter> filters = new ArrayList<>();

    public void addSensitiveWordsFilter(ISensitiveWordsFilter filter) {
        filters.add(filter);
    }

    public String filterSensitiveWords(String text) {
        String maskedText = text;
        for (ISensitiveWordsFilter filter : filters) {
            maskedText = filter.filter(maskedText);
        }

        return maskedText;
    }
}
