package com.laok.dp.creational.singleton;

/**
 * @author k 2022/8/24 23:19
 */
public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton () {
        System.out.println("生成了一个实例");
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
