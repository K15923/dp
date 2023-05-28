package com.laok.dp.structural.adapter.ex;

import java.io.*;
import java.util.Properties;

/**
 * @author k 2022/8/24 21:32
 */
public class FileProperties extends Properties implements FileIO {


    public FileProperties() {
        super(new Properties());
    }

    @Override
    public void readFromFile(String fileName) throws IOException {
        InputStream is = new FileInputStream(fileName);
        defaults.load(is);
    }

    @Override
    public void writerToFile(String fileName) throws IOException {
        OutputStream os = new FileOutputStream(fileName);
        defaults.store(os, "");
    }

    @Override
    public void setValue(String key, String value) {
        defaults.setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return defaults.get(key).toString();
    }
}
