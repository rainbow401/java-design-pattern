package SimpleFactory.config.main;

import SimpleFactory.config.IRuleConfigParser;
import SimpleFactory.config.InvalidRuleConfigException;
import SimpleFactory.config.RuleConfig;

/**
 * @Description:
 * @Author: yanzhihao
 * @Date: 2022/1/24 4:14 下午
 */
public class RuleConfigSource {

    public RuleConfig load(String ruleConfigFilePath) throws InvalidRuleConfigException {
        String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);
        IRuleConfigParser parser = RuleConfigParserFactory.createParser(ruleConfigFileExtension);
        if (parser == null) {
            throw new InvalidRuleConfigException("rule config file format is not supported: " + ruleConfigFilePath);
        }

        String configText = "";
        //从ruleConfigFilePath文件中读取配置文本到configText中
        RuleConfig ruleConfig = parser.parse(configText);
        return ruleConfig;
    }

    private String getFileExtension(String ruleConfigFilePath) {
        //...解析文件名获取扩展名，比如rule.json，返回jsonreturn"json";
        return "json";
    }
}

