package com.app.data;

import com.app.bean.Consumer;

public interface ConsumerDao {

    public Long addConsumer(Consumer consumer);

    public Consumer getConsumerById(Long id);

}
