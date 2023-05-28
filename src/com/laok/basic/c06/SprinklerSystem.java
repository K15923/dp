package com.laok.basic.c06;

/**
 * @author k 2023/5/23 16:54
 */
class WaterSource {
    private String s;

    WaterSource() {
        System.out.println("WaterSource()");
        s = new String("Constructed");
    }

    public String toString() {
        return s;
    }
}

public class SprinklerSystem {
    private String valve1, valve2, valve3, valve4;
    WaterSource source;
    int i;
    float f;

    void print() {
        System.out.println("valve1 = " + valve1);
        System.out.println("valve2 = " + valve2);
        System.out.println("valve3 = " + valve3);
        System.out.println("valve4 = " + valve4);
        System.out.println("i = " + i);
        System.out.println("f = " + f);
        System.out.println("source = " + source);

    }

    public static void main(String[] args) {
        SprinklerSystem x = new SprinklerSystem();
        x.print();
    }
}
