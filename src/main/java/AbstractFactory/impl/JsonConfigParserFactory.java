package AbstractFactory.impl;

import AbstractFactory.IConfigParserFactory;
import AbstractFactory.parser.ISystemConfigParser;
import AbstractFactory.parser.JsonSystemConfigParser;
import SimpleFactory.config.IRuleConfigParser;
import SimpleFactory.config.JsonRuleConfigParser;

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
