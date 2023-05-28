package com.laok.dp.creational.Prototype;

import com.laok.dp.creational.Prototype.framework.Manager;
import com.laok.dp.creational.Prototype.framework.Product;

/**
 * @author k 2022/8/24 23:32
 */
public class PrototypeMain {
    public static void main(String[] args) {
        Manager manager = new Manager();
        UnderlinePen underlinePen = new UnderlinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');
        manager.register("underlinePen", underlinePen);
        manager.register("mbox", mbox);
        manager.register("sbox", sbox);


        Product p1 = manager.create("underlinePen");
        Product p2 = manager.create("mbox");
        Product p3 = manager.create("sbox");
        p1.use("hello world");
        p2.use("hello world");
        p3.use("hello world");
    }

}
