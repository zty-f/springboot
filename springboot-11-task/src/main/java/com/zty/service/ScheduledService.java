/**
 * @program: springboot-11-task
 * @ClassName ScheduledService
 * @description:
 * @author: zty
 * @create: 2021-08-07 14:36
 * @Version 1.0
 **/
package com.zty.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledService {
    //在一个特定的时间执行这个方法~  Timer

    //cron表达式
    //秒  分  时  日  月  周几~
    //0 46 14 * * ?  每天的14:16执行一次
    //0 0/1 14,15 * * ?  每天的14点和15点，每隔1分钟执行一次
    //0 20 14 ? * 1-6  每个月的周一到周六的14:20分执行一次
    @Scheduled(cron = "0/2 * * * * ?")
    public void hello(){
        System.out.println("定时任务测试！");
    }
}
