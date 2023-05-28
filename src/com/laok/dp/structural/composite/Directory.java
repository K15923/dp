package com.laok.dp.structural.composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author k 2022/8/27 16:06
 */
public class Directory extends Entry {


    private String name;
    private ArrayList directory = new ArrayList();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    int getSize() {
        int size = 0;
        Iterator iterator = directory.iterator();
        while (iterator.hasNext()) {
            Entry next = (Entry) iterator.next();
            size += next.getSize();
        }
        return size;
    }


    @Override
    public Entry add(Entry entry) {
        directory.add(entry);
        return this;
    }

    @Override
    void printList(String s) {
        System.out.println(s + "/" + this);
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            entry.printList(s + "/" + name);
        }
    }
}
