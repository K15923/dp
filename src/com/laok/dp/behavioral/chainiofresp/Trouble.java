package com.laok.dp.behavioral.chainiofresp;

/**
 * @author k 2022/8/28 9:18
 */
public class Trouble {

    private int Number;

    private String desc;

    public Trouble(int number) {
        Number = number;
    }

    public int getNumber() {
        return this.Number;
    }

    @Override
    public String toString() {
        return "Trouble{" +
                "Number=" + Number +
                '}';
    }
}
