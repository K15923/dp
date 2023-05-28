package com.laok.dp.creational.Prototype;

import com.laok.dp.creational.Prototype.framework.AbstractProduct;
import com.laok.dp.creational.Prototype.framework.Product;

import java.nio.charset.StandardCharsets;

/**
 * @author k 2022/8/25 22:42
 */
public class MessageBox extends AbstractProduct implements Product {

    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes(StandardCharsets.UTF_8).length;
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decochar);
        }

        System.out.println("");

        System.out.println(decochar + "  " + s + "  " + decochar);

        for (int i = 0; i < length + 4; i++) {
            System.out.print(decochar);
        }
        System.out.println("");

    }


}
