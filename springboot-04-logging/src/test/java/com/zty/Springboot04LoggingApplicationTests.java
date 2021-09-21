package com.zty;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot04LoggingApplicationTests {

    //日志记录器
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    void contextLoads() {
        //日志的级别
        //由低到高 trance<debug<info<warn<error
        //可以调整输出的日志级别，日志就只会在这个级别以后的高级别生效
        logger.trace("这是trance日志");
        logger.debug("Processing trade with id: {} and symbol: {}", 1, 2);
        //springboot默认给我们使用的是info级别，如果不配置系统默认使用这个
        logger.info("这是info日志");
        logger.warn("这是warn日志");
        logger.error("这是error日志");
    }

}
