package com.laok.dp.creational.Prototype.framework;

/**
 * @author k 2022/8/25 22:33
 */
public interface Product extends Cloneable{

    void use(String s);

    Product createClone();

}
