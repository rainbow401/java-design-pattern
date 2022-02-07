package com.AbstractFactory.impl;

import com.AbstractFactory.IConfigParserFactory;
import com.AbstractFactory.parser.ISystemConfigParser;
import com.AbstractFactory.parser.JsonSystemConfigParser;
import com.SimpleFactory.config.IRuleConfigParser;
import com.SimpleFactory.config.JsonRuleConfigParser;

/**
 * @Description:
 * @Author: yanzhihao
 * @Date: 2022/1/24 4:45 下午
 */
public class JsonConfigParserFactory implements IConfigParserFactory {
    @Override
    public IRuleConfigParser createRuleParser() {
        return new JsonRuleConfigParser();
    }

    @Override
    public ISystemConfigParser createSystemParser() {
        return new JsonSystemConfigParser();
    }
}
