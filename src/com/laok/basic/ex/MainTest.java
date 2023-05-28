package com.laok.basic.ex;

/**
 * @author k 2023/5/23 16:37
 */
public class MainTest {

    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.getName());
        System.out.println(b.getNameA());
        if (b instanceof AbsC) {
            System.out.println(b.getName());
        }
    }

}
