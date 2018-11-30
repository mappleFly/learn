package com.lms.learn.util;

import com.lms.learn.event.MyEvent;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyListenerThree implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        if(applicationEvent instanceof MyEvent){
            System.out.println("监听到事件源:"+MyListenerThree.class.getName());
        }
    }
    /*@Value("${name}")
    private String name;
    @Value("${my.secret}")
    private String secret;
    @Value("${my.number.in.range}")
    private String range;*/
}
