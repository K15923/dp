package com.laok.dp.creational.Prototype.framework;

import java.util.HashMap;

/**
 * @author k 2022/8/25 22:34
 */
public class Manager {

    private HashMap showcase = new HashMap();

    public void register(String name, Product product) {
        showcase.put(name,product);
    }

    public Product create(String product) {
       Product p = (Product) showcase.get(product);
       return p.createClone();
    }

}
