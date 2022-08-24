package com.dp.structural.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 书架
 *
 * @author k 2022/8/23 16:20
 */
public class BookShelf implements Aggregate {

    private List<Book> books;

    private int last = 0;


    public BookShelf(int maxsize) {
        this.books = new ArrayList<>(maxsize);
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        this.books.add(book);
        last++;

    }

    public int getLength() {
        return this.books.size();
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
