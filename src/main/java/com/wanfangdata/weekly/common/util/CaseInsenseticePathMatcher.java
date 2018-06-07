package com.wanfangdata.weekly.common.util;

import org.springframework.util.AntPathMatcher;

import java.util.Map;

/**
 * 路径大小写不敏感
 */
public class CaseInsenseticePathMatcher extends AntPathMatcher {
    @Override
    protected boolean doMatch(String pattern, String path, boolean fullMatch, Map<String, String> uriTemplateVariables) {
        return super.doMatch(pattern.toLowerCase(), path.toLowerCase(), fullMatch, uriTemplateVariables);
    }
}
