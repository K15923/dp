package com.laok.dp.behavioral.templateMethod;

/**
 * 抽象类定义模板
 * @author k 2022/8/24 22:26
 */
public abstract class AbstractDisplay {

    abstract void open();

    abstract void print();

    abstract void close();

    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }

}
