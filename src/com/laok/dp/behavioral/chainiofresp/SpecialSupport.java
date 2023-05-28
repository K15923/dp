package com.laok.dp.behavioral.chainiofresp;

/**
 * @author k 2022/8/28 9:38
 */
public class SpecialSupport extends Support {

    private int number;

    public SpecialSupport(String name, int number) {
        super(name);
        this.number = number;
    }

    @Override
    boolean resolve(Trouble trouble) {
        if (trouble.getNumber() == number) {
            return true;
        }
        return false;
    }
}
