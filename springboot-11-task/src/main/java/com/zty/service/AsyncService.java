package com.zty.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncService {

  /** @Author zty
   * @Description //TODO
   * @Date 19:20 2021/8/5
   * @Param []
   * @return void
   **/

  @Async//告诉spring这是一个异步的方法
    public void hello(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("数据正在处理中！");
    }
}
