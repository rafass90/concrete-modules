package com.app.data.impl;

import com.app.bean.Disc;
import com.app.data.DiscDao;
import com.app.data.database.FileDatabase;

import java.util.List;
import java.util.stream.Collectors;

public class DiscFileDaoImpl implements DiscDao{

    private FileDatabase database;

    public Long addDisc (Disc disc) {
        disc.setId (Long.valueOf (database.getIncrement ()));
        database.add (disc.getId (), disc);
        return disc.getId ();
    }

    public void removeDisc (Disc disc) {

    }

    public List<Disc> findDiscByAuthor (String author) {
        return database.returnAll ().stream ()
                .filter(Disc.class::isInstance)
                .map(Disc.class::cast)
                .filter(d -> d.getSinger ().equals(author))
                .collect(Collectors.toList());
    }
}
