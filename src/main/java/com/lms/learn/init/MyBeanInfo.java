package com.lms.learn.init;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value = 2)
public class MyBeanInfo implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        //获取初始化的数据源
        //Config config = new Config();
        System.out.println("=======开始任务一========");

    }
}
