package com.app.data.impl;

import com.app.bean.Book;
import com.app.bean.Disc;
import com.app.data.BookDao;
import com.app.data.database.FileDatabase;

import java.util.List;
import java.util.stream.Collectors;

public class BookFileDaoImpl implements BookDao {

    private FileDatabase file;
    private static final String tableName = "BOOK";

    public BookFileDaoImpl(){
        file = FileDatabase.getInstance ().createDatabase(tableName);
    }

    public Long addBook(Book book){
        book.setId (file.getIncrement (tableName));
        file.add (tableName, book.getId (), book);
        return book.getId ();
    }

    @Override
    public List<Book> listAll () {
        return file.returnAll (tableName).stream ()
                .map(Book.class::cast)
                .collect(Collectors.toList());
    }

    public List<Book> findBooksByAuthor(String author){
        return file.returnAll (tableName).stream ()
                .map(Book.class::cast)
                .filter(b -> author.equals(b.getName ()))
                .collect(Collectors.toList());
    }
}
