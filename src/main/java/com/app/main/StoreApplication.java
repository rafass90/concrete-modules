package com.app.main;

import com.app.bean.Book;
import com.app.bean.Consumer;
import com.app.bean.Disc;
import com.app.service.ConsumerService;
import com.app.service.StoreService;

import java.util.List;

public class StoreApplication {
    public static void main (String[] args) throws Exception {

        Consumer consumer = new Consumer ("Teste", 27);
        consumer.setId (999L);

        Disc d = new Disc ("Disco 1","Kubinho", 4.3d, Disc.Type.CD);

        ConsumerService c = new ConsumerService ();
        c.insertSale (consumer, List.of(d));

        System.out.println (c.listAllConsumers ());

        Book book1 = new Book("A volta dos que não foram", 2, 140.3d);
        Book book2 = new Book("Java 9 - Modules", 140, 29.99d);

        StoreService storeService = new StoreService ();
        storeService.insertBook (book1);
        storeService.insertBook (book2);

        c.insertSale (consumer, List.of(book1,book2));

        System.out.println (c.listAllConsumers ());

//        storeService.
    }
}
