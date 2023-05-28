package com.laok.basic.initorder;

/**
 * @author k 2023/5/18 15:38
 */
public class AStatic {

    public BStatic bStatic;

    public String a = "a基础属性>";
    public static String ab = "astatic属性>";

    {
        System.out.print("a代码块>");
    }

    static {
        System.out.print(ab);
        System.out.print("astatic代码块>");
    }


    public AStatic(BStatic bStatic) {
        this.bStatic = bStatic;
        System.out.print("a构造方法>");
    }

    public static void main(String[] args) {
        System.out.println(new AStatic(new BStatic()));
    }

    @Override
    public String toString() {
        return "atoString>";
    }

    @Override
    public String clone() {
        return "a";
    }

}
