package com.laok.dp.creational.builder;

/**
 * @author k 2022/8/25 23:21
 */
public abstract class Builder {

    abstract void makeTitle(String title);
    abstract void makeString(String str);
    abstract void makeItems(String[] items);
    abstract void close();


}
