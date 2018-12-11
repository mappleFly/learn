package com.lms.design.prototype;

import lombok.Data;

import java.io.*;
import java.util.Date;

/**
 * 原型模式
 */
@Data
public class Sheep implements Cloneable, Serializable {
    private String name;
    private Date feteDay;

    public Sheep(String name, Date feteDay) {
        this.name = name;
        this.feteDay = feteDay;
    }

    /**
     * 重写clone
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Sheep clone = (Sheep) super.clone();
        clone.feteDay = (Date) this.feteDay.clone();
        return clone;
    }

    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        //测试 浅复制
        Sheep sheep = new Sheep("多利", new Date(666666666L));
        //sheep.feteDay = new Date();
        Sheep clone = (Sheep) sheep.clone();
        //clone.feteDay = new Date(5555555L);
        System.out.println("母亲:" + sheep.hashCode()+"--?"+sheep.name + "--->" + sheep.feteDay);
        System.out.println("孩子:" +clone.hashCode()+"-->"+ clone.name + "--->" + clone.feteDay);

        //深复制(序列化于反序列化) 防止序列化readResolve创建新对象
        String path = System.getProperty("user.dir") + "/a.txt";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
        oos.writeObject(clone);
        oos.close();
        //读
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
        //深复制出10个对象
        Sheep o = (Sheep) ois.readObject();
        /*for (int i = 0; i < 10; i++) {
            System.out.println(o.hashCode());
        }*/
        System.out.println("孩子复制品:" +o.hashCode()+"-->"+ o.name + "--->" + o.feteDay);
        System.out.println(o==clone);
    }
}
