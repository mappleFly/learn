package com.lms.learn.init;

import com.lms.learn.config.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Iterator;
import java.util.List;

@Component
@Order(value = 2)
public class MyBeanInfo implements ApplicationRunner {

    @Autowired
    private Config config;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        //获取初始化的数据源
        //Config config = new Config();
        List<String> servers = config.getServers();
        Iterator<String> iterator = servers.iterator();
        System.out.println("=======开始任务一========");
        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.println("key:"+key+"--->");
        }
    }
}
