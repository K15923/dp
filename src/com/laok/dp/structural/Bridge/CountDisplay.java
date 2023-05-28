package com.laok.dp.structural.Bridge;

/**
 * 类的功能层次
 * 对Display进行功能的增加
 *
 * @author k 2022/8/27 0:07
 */
public class CountDisplay extends Display {


    public CountDisplay(DisPlayImpl disPlay) {
        super(disPlay);
    }

    public void multiDisplay(int times) {
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }

}
