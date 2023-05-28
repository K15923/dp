package com.laok.dp.structural.Bridge;

/**
 * 验证类
 *
 * @author k 2022/8/27 0:08
 */
public class BridgeMain {

    public static void main(String[] args) {
        Display d1 = new Display(new StringDisPlayImpl("hello,china"));
        Display d2 = new CountDisplay(new StringDisPlayImpl("hello,world"));
        CountDisplay d3 = new CountDisplay(new StringDisPlayImpl("hello,earth"));

        d1.disPlay();
        d2.disPlay();
        d3.disPlay();
        d3.multiDisplay(5);
    }
}
