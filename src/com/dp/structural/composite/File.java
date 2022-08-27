package com.dp.structural.composite;

/**
 * @author k 2022/8/27 16:06
 */
public class File extends Entry {

    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    int getSize() {
        return size;
    }

    @Override
    void printList(String s) {
        System.out.println(s + "/" + this);
    }


}
