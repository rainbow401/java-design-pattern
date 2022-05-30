package com.chainofresponsibility.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yanzhihao
 * @since 2022/5/24
 */
public class SensitiveWordFilterChain {

    private List<SensitiveWordFilter> filters = new ArrayList<>();

    public void addFilter(SensitiveWordFilter filter) {
        this.filters.add(filter);
    }

    public boolean filter(Content content) {
        for (SensitiveWordFilter filter : filters) {
            if (filter.doFilter(content)) {
                return false;
            }
        }
        return true;
    }
}
