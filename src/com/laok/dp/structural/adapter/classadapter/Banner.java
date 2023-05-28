package com.laok.dp.structural.adapter.classadapter;

/**
 * @author k 2022/8/24 16:20
 */
public class Banner {

    private String a;

    public Banner(String a) {
        this.a = a;
    }

    public void showWithParen(){
        System.out.println("showWithParen_" + a + "");
    }

    public void showWithAster() {
        System.out.println("showWithAster_" + a + "");
    }


}
