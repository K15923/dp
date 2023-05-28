package com.laok.dp.structural.proxy;

/**
 * @author k 2022/8/28 23:57
 */
public interface Printable {

    void setPrinterName(String name);

    String getPrinterName();

    void print(String str);

}
