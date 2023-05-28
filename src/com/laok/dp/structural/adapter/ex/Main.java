package com.laok.dp.structural.adapter.ex;

import java.io.IOException;

/**
 * @author k 2022/8/24 21:31
 */
public class Main {

    public static void main(String[] args) {
        FileIO fileIO = new FileProperties();
        try {
            fileIO.readFromFile("D:\\workspace\\study\\dp\\file.txt");
            fileIO.setValue("1","1");
            fileIO.setValue("2","2");
            fileIO.setValue("3","3");
            fileIO.writerToFile("D:\\workspace\\study\\dp\\newFile.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
