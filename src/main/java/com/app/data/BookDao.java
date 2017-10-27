package com.app.data;

import com.app.bean.Book;

public interface BookDao {

    public void addBook(Book book);

    public Book findBookByAuthor(String author);

}
