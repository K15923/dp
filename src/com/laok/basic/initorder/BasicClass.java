package com.laok.basic.initorder;

/**
 * @author k 2023/5/18 15:38
 */
public class BasicClass extends AStatic {

    private String name;

    public BasicClass(BStatic bStatic) {
        super(bStatic);
    }

    public static void main(String[] args) {
        AStatic aStatic = new AStatic(new BStatic());
        System.out.println();
    }

}
