package com.laok.dp.structural.proxy;

/**
 * @author k 2022/8/28 23:57
 */
public class Printer implements Printable {

    private String name;

    public Printer(String name) {
        this.name = name;
        heavyJob("z正在生成Printer的实例（" + name + "）");
    }

    private void heavyJob(String s) {
        System.out.println(s);
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(".");
        }
        System.out.println("end.");
    }

    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String str) {
        System.out.println("=========" + name + "========");
        System.out.println(str);
    }
}
