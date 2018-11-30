package com.lms.learn.init;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

@Component
@Order(value = 1)
public class MyBean implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Timer timer = new Timer();
        //改方法会延迟多久会执行一次
        /*timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("定时执行任务");
            }
        },1000);*/
        System.out.println("======开始任务二========");
        //开始时间，多久执行一次
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("定时执行任务");
            }
        },new Date(),1000);
        Thread.sleep(10000);
        timer.cancel();
    }
}
