package com.app.data;

import com.app.bean.Consumer;

import java.util.List;

public interface ConsumerDao {

    public Long addConsumer(Consumer consumer);

    public Consumer getConsumerById(Long id);

    public List<Consumer> findAllConsumers();

}