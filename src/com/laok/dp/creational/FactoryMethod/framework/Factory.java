package com.laok.dp.creational.FactoryMethod.framework;

/**
 * @author k 2022/8/24 22:49
 */
public abstract class Factory {

    public final Product create(String owner) {
        Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }

    protected abstract Product createProduct(String owner);

    protected abstract void registerProduct(Product product);


}
