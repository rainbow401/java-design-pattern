package com.abstractfactory.impl;

import com.abstractfactory.IConfigParserFactory;
import com.abstractfactory.parser.ISystemConfigParser;
import com.abstractfactory.parser.JsonSystemConfigParser;
import com.simplefactory.config.IRuleConfigParser;
import com.simplefactory.config.JsonRuleConfigParser;

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
