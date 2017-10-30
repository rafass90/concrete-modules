package com.app.data.impl;

import com.app.bean.Consumer;
import com.app.data.ConsumerDao;
import com.app.data.database.FileDatabase;

import java.util.List;
import java.util.stream.Collectors;

public class ConsumerFileDaoImpl implements ConsumerDao {

    private FileDatabase file;
    private static final String tableName = "CONSUMER";

    public ConsumerFileDaoImpl(){
        file = FileDatabase.getInstance ().createDatabase(tableName);
    }

    public Long addConsumer (Consumer consumer) {
        consumer.setId (Long.valueOf (file.getIncrement (tableName)));
        file.add (tableName, consumer.getId (), consumer);
        return consumer.getId ();
    }

    @Override
    public Consumer getConsumerById (Long id) {
        return null;
    }

    @Override
    public List<Consumer> findAllConsumers () {
        return file.returnAll (tableName)
                .stream ()
                .filter(Consumer.class::isInstance)
                .map(Consumer.class::cast)
                .collect (Collectors.toList ());
    }
}
