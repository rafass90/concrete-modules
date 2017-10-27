package com.app.service;

import com.app.bean.Consumer;
import com.app.bean.IProduct;
import com.app.bean.Sale;
import com.app.data.ConsumerDao;
import com.app.data.SaleDao;
import com.app.data.impl.ConsumerFileDaoImpl;
import com.app.data.impl.SaleFileDaoImpl;
import com.sun.tools.javac.util.Assert;

import java.util.List;

public class ConsumerService {

    public void insertSale(Consumer consumer, List<IProduct> products){
        Assert.checkNonNull (products, "Carrinho de compras vazio");
        Assert.checkNonNull (consumer, "Cliente não identificado");

        //No JigSaw
        ConsumerDao consumerDao = new ConsumerFileDaoImpl ();
        consumerDao.addConsumer (consumer);

        Sale sale = new Sale (consumer.getId (), products);

        SaleDao saleDao = new SaleFileDaoImpl ();
        saleDao.insertSale (sale);
    }

    private Long insertConsumer(Consumer consumer){
        if(consumer.getId () != null)
            return consumer.getId ();
        ConsumerDao consumerDao = new ConsumerFileDaoImpl ();
        return consumerDao.addConsumer (consumer);
    }
}
