package com.lms.design.structural;

/**
 * 目标对象（需要适配的对象）
 */
public class Adaptee implements ConnectionKey{
    @Override
    public void operating() {
        System.out.println("已经连接 开始打字...");
    }
}
