package com.laok.dp.structural.adapter.ex;

import java.io.IOException;

/**
 * @author k 2022/8/24 21:35
 */
public interface FileIO {
    void readFromFile(String fileName) throws IOException;

    void writerToFile(String fileName) throws IOException;

    void setValue(String key, String value);

    public String getValue(String key);

}
