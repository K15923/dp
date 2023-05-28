package com.laok.basic.initorder;

/**
 * @author k 2023/5/18 15:38
 */
public class BStatic {



    public String a = "b基础属性>";
    public static String ab = "bstatic属性>";

    {
        System.out.print("b代码块>");
    }

    static {
        System.out.print(ab);
        System.out.print("bstatic代码块>");
    }


    public BStatic() {
        System.out.print("b构造方法>");
    }

    public static void main(String[] args) {
        System.out.println(new BStatic());
    }

    @Override
    public String toString() {
        return "btoString>";
    }

    @Override
    public String clone() {
        return "b";
    }

}
