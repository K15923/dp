package com.laok.dp.behavioral.templateMethod;

/**
 * @author k 2022/8/24 22:34
 */
public class Main {
    public static void main(String[] args) {
        AbstractDisplay a1 = new CharDisplay('a');
        AbstractDisplay a2 = new StringDisplay("Hello,world");
        AbstractDisplay a3 = new StringDisplay("你好，世界");
        a1.display();
        a2.display();
        a3.display();
    }
}
