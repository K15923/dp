package com.laok.dp.creational.singleton;

/**
 * @author k 2022/8/24 23:22
 */
public class SingletonMain {

    public static void main(String[] args) {
        System.out.println("start.");
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        if (s1==s2) {
            System.out.println("xiangtong");
        }else {
            System.out.println("butong");
        }
        System.out.println("end");
    }
}
