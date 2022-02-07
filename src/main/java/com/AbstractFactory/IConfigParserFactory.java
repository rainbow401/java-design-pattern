package com.AbstractFactory;

import com.AbstractFactory.parser.ISystemConfigParser;
import com.SimpleFactory.config.IRuleConfigParser;

/**
 * @Description:
 * @Author: yanzhihao
 * @Date: 2022/1/24 4:43 下午
 */
public interface IConfigParserFactory {
    IRuleConfigParser createRuleParser();
    ISystemConfigParser createSystemParser();
    //此处可以扩展新的parser类型，比如IBizConfigParser
}

