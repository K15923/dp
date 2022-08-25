package com.dp.creational.Prototype.framework;

/**
 * @author k 2022/8/25 23:15
 */
public abstract class AbstractProduct implements Product{


    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
