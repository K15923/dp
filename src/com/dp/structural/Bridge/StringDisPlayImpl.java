package com.dp.structural.Bridge;

/**
 * 类的实现层次
 *
 * @author k 2022/8/27 0:07
 */
public class StringDisPlayImpl extends DisPlayImpl {

    private String string;
    private int width;

    public StringDisPlayImpl(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    @Override
    public void rawPrint() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void rawClose() {
        printLine();
    }
}
