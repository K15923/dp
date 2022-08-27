package com.dp.structural.decorator;

/**
 * 展示单行字符串的类
 *
 * @author k 2022/8/27 23:15
 */
public class StringDisplay extends Display {

    private String string;

    public StringDisplay(String string) {
        this.string = string;
    }

    @Override
    int getColumns() {
        return string.getBytes().length;
    }

    @Override
    int getRows() {
        return 1;
    }

    @Override
    String getRowText(int row) {
        if (row == 0) {
            return string;
        } else {
            return null;
        }
    }
}
