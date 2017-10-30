package com.app.data;

import com.app.bean.Sale;

import java.util.List;

public interface SaleDao {

    public Long insertSale(Sale sale);

    public List<Sale> findAllSales ();
}
