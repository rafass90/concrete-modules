package com.app.data.impl;

import com.app.bean.Disc;
import com.app.bean.Sale;
import com.app.data.SaleDao;
import com.app.data.database.FileDatabase;

import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    public List<Sale> findAllSales () {
        return database.returnAll (tableName).stream ()
                .filter(Sale.class::isInstance)
                .map(Sale.class::cast)
                .collect(Collectors.toList());

    }
}
