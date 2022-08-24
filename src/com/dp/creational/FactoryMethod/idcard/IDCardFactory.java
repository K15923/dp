package com.dp.creational.FactoryMethod.idcard;

import com.dp.creational.FactoryMethod.framework.Factory;
import com.dp.creational.FactoryMethod.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @author k 2022/8/24 22:50
 */
public class IDCardFactory extends Factory {

    private List owners = new ArrayList<>();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard) product).getOwner());
    }

    public List getOwners() {
        return owners;
    }
}
