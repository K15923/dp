package com.dp.structural.Facade.pagemaker;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author k 2022/8/28 23:38
 */
public class Database {

    private Database() {
    }

    public static Properties getProperties(String dbname) {
        String filename = dbname + ".txt";
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(filename));
        } catch (IOException e) {
            System.out.println(filename + "file is not found");
            throw new RuntimeException(e);
        }
        return properties;
    }

}
