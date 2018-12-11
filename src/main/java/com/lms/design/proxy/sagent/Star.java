package com.lms.design.proxy.sagent;

/**
 * 真实角色与代理角色的公共接口
 */
public interface Star {

    void confer(); //面谈
    void singContract(); //起草合同
    void bookTicket(); //订票
    void sing(); //唱歌  (真实角色需要做的事)
    void collecMoney(); //收钱
}
