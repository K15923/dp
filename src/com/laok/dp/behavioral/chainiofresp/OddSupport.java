package com.laok.dp.behavioral.chainiofresp;

/**
 * @author k 2022/8/28 9:38
 */
public class OddSupport extends Support {


    public OddSupport(String name) {
        super(name);

    }

    @Override
    boolean resolve(Trouble trouble) {
        if (trouble.getNumber() % 2 == 1) {
            return true;
        }
        return false;
    }
}
