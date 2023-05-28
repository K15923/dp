package com.laok.dp.structural.decorator;

/**
 * @author k 2022/8/27 23:16
 */
public class FullBorder extends Border {

    public FullBorder(Display display) {
        super(display);
    }

    @Override
    int getColumns() {
        return 1 + display.getColumns() + 1;
    }

    @Override
    int getRows() {
        return 1 + display.getRows() + 1;
    }

    @Override
    String getRowText(int row) {
        if (row == 0) {
            return "+" + makeLine('-', display.getColumns()) + "+";
        } else if (row == display.getRows() + 1) {
            return "+" + makeLine('-', display.getColumns()) + "+";
        } else {
            return "|" + display.getRowText(row - 1) + "|";
        }
    }

    private String makeLine(char s, int columns) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < columns; i++) {
            stringBuffer.append(s);
        }
        return stringBuffer.toString();

    }
}
