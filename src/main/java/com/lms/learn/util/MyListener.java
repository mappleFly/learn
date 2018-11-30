package com.lms.learn.util;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 监听器配置
 */
public class MyListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        /**
         * 应用运行时，事件会以下面的次序发送：
         * 	1. 在运行开始，但除了监听器注册和初始化以外的任何处理之前，会发送一个ApplicationStartedEvent。
         * 	2. 在Environment将被用于已知的上下文，但在上下文被创建前，会发送一个ApplicationEnvironmentPreparedEvent。
         * 	3. 在refresh开始前，但在bean定义已被加载后，会发送一个ApplicationPreparedEvent。
         * 	4. 在refresh之后，相关的回调处理完，会发送一个ApplicationReadyEvent，表示应用准备好接收请求了。
         *  启动过程中如果出现异常，会发送一个ApplicationFailedEvent
         */
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(applicationEvent.getTimestamp()));
        System.out.println("时间触发时间:" + new SimpleDateFormat("yyyy-MM-dd HH:mm").format(calendar.getTime()));
    }
}
