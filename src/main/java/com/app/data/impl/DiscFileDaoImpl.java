package com.app.data.impl;

import com.app.bean.Disc;
import com.app.data.DiscDao;
import com.app.data.database.FileDatabase;

import java.util.List;
import java.util.stream.Collectors;

public class DiscFileDaoImpl implements DiscDao{

    private FileDatabase database;
    private static final String tableName = "DISC";

    public DiscFileDaoImpl(){
        database = FileDatabase.getInstance ().createDatabase (tableName);
    }

    public Long addDisc (Disc disc) {
        disc.setId (Long.valueOf (database.getIncrement (tableName)));
        database.add (tableName, disc.getId (), disc);
        return disc.getId ();
    }

    public void removeDisc (Disc disc) {

    }

    @Override
    public List<Disc> listAll () {
        return database.returnAll (tableName).stream ()
                .map(Disc.class::cast)
                .collect(Collectors.toList());
    }

    public List<Disc> findDiscByAuthor (String author) {
        return database.returnAll (tableName).stream ()
                .filter(Disc.class::isInstance)
                .map(Disc.class::cast)
                .filter(d -> d.getSinger ().equals(author))
                .collect(Collectors.toList());
    }
}
