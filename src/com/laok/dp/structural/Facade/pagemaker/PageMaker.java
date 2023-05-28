package com.laok.dp.structural.Facade.pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @author k 2022/8/28 23:38
 */
public class PageMaker {

    public PageMaker() {
    }

    public static void makeWelcomePage(String miladdr,String filename) {
        try {
            Properties properties = Database.getProperties(filename);
            String maildata = properties.getProperty(miladdr);
            HtmlWriter htmlWriter = new HtmlWriter(new FileWriter(filename));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
