package com.laok.basic.ex;

/**
 * @author k 2023/5/23 16:21
 */
public class B extends AbsC{

    public String getName() {
        System.out.println();
        return "BClass";
    }

    @Override
    public String getAbstract(String s) {
        return null;
    }
}
