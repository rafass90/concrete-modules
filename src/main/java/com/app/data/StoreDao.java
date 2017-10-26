package com.app.data;

import java.awt.print.Book;
import java.util.List;

public interface StoreDao {

    public List<Book> listBooks();

    public Long addBook(Book book);
}