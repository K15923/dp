package com.dp.behavioral.chainiofresp;

/**
 * @author k 2022/8/28 9:35
 */
public class NoSupport extends Support{


    public NoSupport(String name) {
        super(name);
    }

    @Override
    boolean resolve(Trouble trouble) {
        return false;
    }
}
