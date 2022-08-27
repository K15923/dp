package com.dp.structural.decorator;

/**
 * 结果验证类
 *
 * @author k 2022/8/27 23:17
 */
public class DecoratorMain {

    // TODO java.io 包中很多用到了装饰器模式
    public static void main(String[] args) {
        Display d1 = new StringDisplay("hello,world!");
        Display d2 = new SideBorder(d1, '#');
        Display d3 = new FullBorder(d2);
        d1.show();
        d2.show();
        d3.show();
        Display d4 = new SideBorder(
                new FullBorder(
                        new SideBorder(
                                new FullBorder(
                                        new StringDisplay("你好，世界！")
                                ), '*'
                        )
                ), '/'
        );
        d4.show();
    }

}
