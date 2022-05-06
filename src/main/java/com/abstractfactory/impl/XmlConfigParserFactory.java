package com.abstractfactory.impl;

import com.abstractfactory.IConfigParserFactory;
import com.abstractfactory.parser.ISystemConfigParser;
import com.abstractfactory.parser.XmlSystemConfigParser;
import com.simplefactory.config.IRuleConfigParser;
import com.simplefactory.config.XmlRuleConfigParser;

/**
 * @Description:
 * @Author: yanzhihao
 * @Date: 2022/1/24 4:46 下午
 */
public class XmlConfigParserFactory implements IConfigParserFactory {
    @Override
    public IRuleConfigParser createRuleParser() {
        return new XmlRuleConfigParser();
    }

    @Override
    public ISystemConfigParser createSystemParser() {
        return new XmlSystemConfigParser();
    }
}
