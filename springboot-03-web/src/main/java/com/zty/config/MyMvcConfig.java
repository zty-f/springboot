package com.zty.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Locale;

//扩展SpringMvc
@Configuration
public class MyMvcConfig implements WebMvcConfigurer
{


    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
            // 浏览器发送/zty ， 就会跳转到test页面；
            registry.addViewController("/zty").setViewName("test");
        }





    //如果我们想自定义一些功能，只需要写这些组件，然后将它交给springboot
    //springboot会帮我们自动装配！

//    @Bean
//    public ViewResolver myViewResolver(){
//        return new MyViewResolver();
//
//    }
//
//    //自定义一个视图解析器  MyViewResolver
//    public static  class MyViewResolver implements ViewResolver{
//        @Override
//        public View resolveViewName(String s, Locale locale) throws Exception {
//            return null;
//        }
//
//    }
}
