package com.app.data.impl;

import com.app.bean.Book;
import com.app.data.BookDao;
import com.app.data.database.FileDatabase;

public class BookFileDaoImpl implements BookDao {

    private FileDatabase file;

    public void addBook(Book book){
        file.add (book.getId (), book);
    }

    public Book findBookByAuthor(String author){
        return null;
    }
}
