package com.lms.design.proxy.sagent;

/**
 * 测试静态代理
 */
public class Client {

    public static void main(String[] args){
        Star star = new RealStar();
        Star proxy = new ProxyStar(star);
        proxy.confer();
        proxy.singContract();
        proxy.bookTicket();
        proxy.sing();
        proxy.collecMoney();
    }
}
