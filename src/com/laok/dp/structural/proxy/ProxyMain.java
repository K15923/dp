package com.laok.dp.structural.proxy;

/**
 * @author k 2022/8/29 0:07
 */
public class ProxyMain {
    public static void main(String[] args) {
        Printable alice = new PrinterProxy("Alice");
        System.out.println(alice.getPrinterName());
        alice.setPrinterName("bob");
        System.out.println(alice.getPrinterName());
        alice.print("hello,world");
    }
}
