package com.app.data.impl;

import com.app.bean.Consumer;
import com.app.data.ConsumerDao;

public class ConsumerFileDaoImpl implements ConsumerDao {

    public Long addConsumer (Consumer consumer) {
        return 1L;
    }

    @Override
    public Consumer getConsumerById (Long id) {
        return null;
    }
}
