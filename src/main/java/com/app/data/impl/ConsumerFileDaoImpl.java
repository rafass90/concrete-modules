package com.app.data.impl;

import com.app.bean.Consumer;
import com.app.data.ConsumerDao;
import com.app.data.database.FileDatabase;

public class ConsumerFileDaoImpl implements ConsumerDao {

    private FileDatabase file;

    public Long addConsumer (Consumer consumer) {
        consumer.setId (Long.valueOf (file.getIncrement ()));
        file.add (consumer.getId (), consumer);
        return consumer.getId ();
    }

    @Override
    public Consumer getConsumerById (Long id) {
        return null;
    }
}
