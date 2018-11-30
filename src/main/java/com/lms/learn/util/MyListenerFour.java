package com.lms.learn.util;

import com.lms.learn.event.MyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyListenerFour {

    @EventListener
    public void listener(MyEvent myEvent){
        System.out.println("监听到事件源:"+MyListenerFour.class.getName());
    }
}
