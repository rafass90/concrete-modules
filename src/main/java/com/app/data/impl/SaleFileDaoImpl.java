package com.app.data.impl;

import com.app.bean.Sale;
import com.app.data.SaleDao;
import com.app.data.database.FileDatabase;

public class SaleFileDaoImpl implements SaleDao {

    private FileDatabase database;

    public Long insertSale (Sale sale) {
        sale.setId (Long.valueOf (database.getIncrement ()));
        database.add (sale.getId (), sale);
        return sale.getId ();
    }
}
