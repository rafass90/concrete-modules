package com.app.service;

import com.app.bean.Book;
import com.app.bean.Disc;
import com.app.bean.IProduct;
import com.app.data.BookDao;
import com.app.data.DiscDao;
import com.app.data.impl.BookFileDaoImpl;
import com.app.data.impl.DiscFileDaoImpl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StoreService {

    public StoreService(){
    }

    public Long insertBook(Book book){
       BookDao bookDao = new BookFileDaoImpl ();
       return bookDao.addBook (book);
    }

    public Long insertDisc(Disc disc){
        DiscDao discDao = new DiscFileDaoImpl ();
        return discDao.addDisc (disc);
    }

    public List<IProduct> listAllProducts(){
        DiscDao discDao = new DiscFileDaoImpl ();
        BookDao bookDao = new BookFileDaoImpl ();
        IProduct p1 = (IProduct) bookDao.listAll ();
        IProduct p2 = (IProduct) discDao.listAll ();

        return Stream.of (p1, p2)
                .collect (Collectors.toList ());
    }

    public List<Book> listAllBooks(){
        BookDao bookDao = new BookFileDaoImpl ();
        return bookDao.listAll ();
    }

    public List<Disc> listAllDiscs(){
        DiscDao discDao = new DiscFileDaoImpl ();
        return discDao.listAll ();
    }
}
