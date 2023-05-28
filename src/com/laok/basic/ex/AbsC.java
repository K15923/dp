package com.laok.basic.ex;

/**
 * @author k 2023/5/23 16:21
 */
public abstract class AbsC extends A implements Inter01{
    abstract String getAbstract(String s);

    @Override
    public String getName() {
        return "getAbstractName";
    }
}
