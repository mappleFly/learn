package com.lms.design.proxy.sagent;

/**
 * 代理角色
 */
public class ProxyStar implements Star {

    private Star star;

    public ProxyStar(Star star) {
        this.star = star;
    }

    @Override
    public void confer() {
        System.out.println("ProxyStar.confer()");
    }

    @Override
    public void singContract() {
        System.out.println("ProxyStar.singContract()");
    }

    @Override
    public void bookTicket() {
        System.out.println("ProxyStar.bookTicket()");
    }

    @Override
    public void sing() {
        //到唱歌时需要真实角色上
        System.out.println("=========真实角色开始唱歌========");
        star.sing();
        System.out.println("=========真实角色结束唱歌========");
        //System.out.println("ProxyStar.sing()");
    }

    @Override
    public void collecMoney() {
        System.out.println("ProxyStar.collecMoney()");
    }
}
