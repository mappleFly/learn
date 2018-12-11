package com.lms.design.structural;

/**
 * 适配器
 */
public class Adapter implements Target {

    //目标对象连接到适配器(如键盘)
    private ConnectionKey key;
    public Adapter(ConnectionKey key) {
        this.key = key;
    }
    @Override
    public void handleReq() {
        key.operating();
    }
}
