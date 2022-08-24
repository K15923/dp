package com.dp.creational.FactoryMethod;

import com.dp.creational.FactoryMethod.framework.Factory;
import com.dp.creational.FactoryMethod.framework.Product;
import com.dp.creational.FactoryMethod.idcard.IDCardFactory;

/**
 * @author k 2022/8/24 23:02
 */
public class FactoryMain {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product p1 = factory.create("1");
        Product p2 = factory.create("2");
        Product p3 = factory.create("3");
        Product p4 = factory.create("4");
        p1.use();
        p2.use();
        p3.use();
        p4.use();
    }
}
