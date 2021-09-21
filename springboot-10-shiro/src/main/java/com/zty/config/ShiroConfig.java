package com.zty.config;

import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
public class ShiroConfig {

    // 3. shiroFilterFactoryBean
    @Bean
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("getDefaultWebSecurityManager") DefaultWebSecurityManager defaultWebSecurityManager) {
        ShiroFilterFactoryBean bean = new ShiroFilterFactoryBean();
        // 设置安全管理器
        bean.setSecurityManager(defaultWebSecurityManager);
        Map<String, String> filterMap = new LinkedHashMap<>();

        //授权，正常情况下，没有授权会跳转到为授权页面
        filterMap.put("/user/add","perms[user:add]");
        filterMap.put("/user/update","perms[user:update]");

        //为授权页面
        bean.setUnauthorizedUrl("/noauto");

        bean.setFilterChainDefinitionMap(filterMap);
        //设置登录的请求
        bean.setLoginUrl("/toLogin");
        return bean;
    }

    // 2. DefaultWebSecurityManager
    @Bean
    public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("userRealm") UserRealm userRealm) {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();

        // 关联userRealm
        securityManager.setRealm(userRealm);
        return securityManager;
    }

    // 1. 创建realm对象，需要自定义类
    @Bean
    public UserRealm userRealm() {
        return new UserRealm();
    }

    // 整合ShiroDialect： 用来整合 Shiro thymeleaf
    @Bean
    public ShiroDialect getShiroDialect() {
        return new ShiroDialect();
    }

}
