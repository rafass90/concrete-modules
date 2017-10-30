package com.app.service;

import com.app.bean.Consumer;
import com.app.bean.IProduct;
import com.app.bean.Sale;
import com.app.data.ConsumerDao;
import com.app.data.SaleDao;
import com.app.data.impl.ConsumerFileDaoImpl;
import com.app.data.impl.SaleFileDaoImpl;

import java.util.List;

public class ConsumerService {

    public void insertSale(Consumer consumer, List<IProduct> products) throws Exception {
        if(products == null || products.size () == 0)
            throw new Exception ("Carrinho de compras vazio");

        if(consumer == null)
            throw new Exception ("Cliente não identificado");

        //No JigSaw
        ConsumerDao consumerDao = new ConsumerFileDaoImpl ();
        consumerDao.addConsumer (consumer);

        Sale sale = new Sale (consumer.getId (), products);

        SaleDao saleDao = new SaleFileDaoImpl ();
        saleDao.insertSale (sale);
    }

    public Long insertConsumer(Consumer consumer){
        if(consumer.getId () != null)
            return consumer.getId ();
        ConsumerDao consumerDao = new ConsumerFileDaoImpl ();
        return consumerDao.addConsumer (consumer);
    }

    public List<Consumer> listAllConsumers(){
        ConsumerDao consumerDao = new ConsumerFileDaoImpl ();
        return consumerDao.findAllConsumers ();
    }

    public Consumer findConsumer(Long id){
        ConsumerDao consumerDao = new ConsumerFileDaoImpl ();
        return consumerDao.getConsumerById (id);
    }

    public List<Sale> listSales () {
        SaleDao saleDao = new SaleFileDaoImpl ();
        return saleDao.findAllSales();
    }
}
