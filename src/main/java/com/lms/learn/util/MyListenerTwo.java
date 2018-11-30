package com.lms.learn.util;

import com.lms.learn.event.MyEvent;
import org.springframework.context.ApplicationListener;


/**
 * 监听自定义事件
 */
public class MyListenerTwo implements ApplicationListener<MyEvent> {
    //Logger logger = Logger.getLogger(MyListenerTwo.class);
    @Override
    public void onApplicationEvent(MyEvent myEvent) {
        System.out.println("监听到事件源:"+MyListenerTwo.class.getName());
    }
}
