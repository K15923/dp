package com.laok.dp.behavioral.iterator;

/**
 * 遍历书架的类
 *
 * @author k 2022/8/23 16:21
 */
public class BookShelfIterator implements Iterator {
    private BookShelf bookShelf;
    private int index;


    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (index < bookShelf.getLength()) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        Book bookAt = bookShelf.getBookAt(index);
        index++;
        return bookAt;
    }
}
