package com.laok.dp.structural.Bridge;

/**
 * 类的功能层次
 *
 * @author k 2022/8/26 00:31
 */
public class Display {

    private DisPlayImpl disPlay;

    public Display(DisPlayImpl disPlay) {
        this.disPlay = disPlay;
    }

    public void open() {
        disPlay.rawOpen();
    }

    public void print() {
        disPlay.rawPrint();
    }

    public void close() {
        disPlay.rawClose();
    }

    public final void disPlay() {
        open();
        print();
        close();
    }
}
