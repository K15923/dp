package com.laok.dp.behavioral.templateMethod.ex;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author k 2022/8/24 22:44
 */
public class IOMain {

    public static void main(String[] args) {
        InputStream inputStream = new InputStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }
        };
    }

}
