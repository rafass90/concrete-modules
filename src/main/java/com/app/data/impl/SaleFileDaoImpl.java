package com.app.data.impl;

import com.app.bean.Sale;
import com.app.data.SaleDao;
import com.app.data.database.FileDatabase;

public class SaleFileDaoImpl implements SaleDao {

    private FileDatabase database;
    private static final String tableName = "SALE";

    public SaleFileDaoImpl(){
        database = FileDatabase.getInstance ().createDatabase (tableName);
    }

    public Long insertSale (Sale sale) {
        sale.setId (Long.valueOf (database.getIncrement (tableName)));
        database.add (tableName, sale.getId (), sale);
        return sale.getId ();
    }
}
