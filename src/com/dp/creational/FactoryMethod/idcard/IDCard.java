package com.dp.creational.FactoryMethod.idcard;

import com.dp.creational.FactoryMethod.framework.Product;

/**
 * @author k 2022/8/24 22:50
 */
public class IDCard extends Product {

    private String owner;

    /**
     * 构造方法只在本包下使用
     * @param owner
     */
    IDCard(String owner) {
        System.out.println("制作" + owner + "的id卡。");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "的Id卡。");
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }
}
