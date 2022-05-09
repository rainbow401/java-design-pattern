package com.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * 策略模式
 * @author yanzhihao
 * @since 2022/5/9
 */
public class StrategyFactory {

    private static final Map<String, Strategy> strategies = new HashMap<>();

    static {
        strategies.put("A", new ConcreteStrategyA());
        strategies.put("B", new ConcreteStrategyB());
    }

    public static Strategy getStrategy(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("they should not be empty");
        }

        return strategies.get(type);
    }
}
