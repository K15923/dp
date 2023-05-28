package com.laok.dp.structural.composite;

/**
 * @author k 2022/8/27 16:03
 */
public abstract class Entry {

    abstract String getName();

    abstract int getSize();

    public void printList() {
        printList("");
    }

    abstract void printList(String s);

    protected Entry add(Entry entry) throws FileTreatementException {
        throw new FileTreatementException();
    }

    @Override
    public String toString() {
        return getName() + "(" + getSize() + ")";
    }

}
