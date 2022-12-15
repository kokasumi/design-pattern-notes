package com.github.kokasumi;

import java.util.List;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/11/16 10:27
 * @description
 * @since v1.0
 */
public class AlertRule {
    private List<Rule> rules;

    public Rule getMatchedRule(String api) {
        return rules.stream().filter(rule -> rule.getApi().equals(api))
                .findAny().get();
    }
}
