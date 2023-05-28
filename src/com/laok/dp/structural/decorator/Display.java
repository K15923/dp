package com.laok.dp.structural.decorator;

/**
 * 展示字符串的类
 *
 * @author k 2022/8/27 23:14
 */
public abstract class Display {

    abstract int getColumns();

    abstract int getRows();

    abstract String getRowText(int row);

    public final void show() {
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }

}
