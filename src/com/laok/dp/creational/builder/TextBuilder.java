package com.laok.dp.creational.builder;

/**
 * @author k 2022/8/25 23:22
 */
public  class TextBuilder extends Builder {

    private StringBuffer stringBuffer = new StringBuffer();

    @Override
    void makeTitle(String title) {
        stringBuffer.append("========\n");
        stringBuffer.append("<" + title + ">");
        stringBuffer.append("\n");
    }

    @Override
    void makeString(String str) {
        stringBuffer.append("");
        stringBuffer.append("\n");
    }

    @Override
    void makeItems(String[] items) {
        for (int i = 0; i < items.length; i++) {
            stringBuffer.append("  " + items[i] + " ");
        }
        stringBuffer.append("\n");
    }

    @Override
    void close() {
        stringBuffer.append("========\n");
    }

    public String getResult() {
        return stringBuffer.toString();
    }
}
