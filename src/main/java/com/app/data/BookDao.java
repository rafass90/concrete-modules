package com.app.data;

import com.app.bean.Book;

import java.util.List;

public interface BookDao {

    public Long addBook(Book book);

    public List<Book> listAll();

    public List<Book> findBooksByAuthor(String author);

}
