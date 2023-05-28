package com.laok.dp.behavioral.templateMethod;

/**
 * @author k 2022/8/24 22:29
 */
public class CharDisplay extends AbstractDisplay{

    private char ch;

    public CharDisplay(char ch) {
        this.ch = ch;
    }

    @Override
    void open() {
        System.out.print("<<");
    }

    @Override
    void print() {
        System.out.print(ch);
    }

    @Override
    void close() {
        System.out.println(">>");
    }
}
