package com.laok.dp.structural.adapter.classadapter;

/**
 * @author k 2022/8/24 16:29
 */
public class PrintBanner extends Banner implements Print{
    public PrintBanner(String a) {
        super(a);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
       showWithAster();
    }
}
