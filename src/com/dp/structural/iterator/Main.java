package com.dp.structural.iterator;

/**
 *
 * @author k 2022/8/23 16:22
 */
public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("a"));
        bookShelf.appendBook(new Book("b"));
        bookShelf.appendBook(new Book("c"));
        bookShelf.appendBook(new Book("d"));
        Iterator iterator = bookShelf.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
