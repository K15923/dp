package com.laok.dp.structural.adapter.entrust;

/**
 * @author k 2022/8/24 21:16
 */
public class PrintBanner extends Print{

    private Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    @Override
    void printWeak() {
        banner.showWithAster();
    }

    @Override
    void printStrong() {
        banner.showWithParen();
    }
}
