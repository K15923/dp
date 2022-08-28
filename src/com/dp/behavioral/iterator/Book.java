package com.dp.behavioral.iterator;

/**
 * 书
 * @author k 2022/8/23 16:20
 */
public class Book {

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Book(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
}
