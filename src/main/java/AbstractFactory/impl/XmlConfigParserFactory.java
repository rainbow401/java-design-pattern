package AbstractFactory.impl;

import AbstractFactory.IConfigParserFactory;
import AbstractFactory.parser.ISystemConfigParser;
import AbstractFactory.parser.XmlSystemConfigParser;
import SimpleFactory.config.IRuleConfigParser;
import SimpleFactory.config.XmlRuleConfigParser;

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
