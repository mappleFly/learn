package com.lms.design.structural;


/**
 * 适配器模式实现
 */
public class Client {

    void pritlnWorld(Target target){
        target.handleReq();
    }
    public static void main(String[] args){
        //电脑
        Client client = new Client();
        //键盘
        ConnectionKey key = new Adaptee();
        //适配器
        Target target = new Adapter(key);
        client.pritlnWorld(target);
    }
}
