package com.beauty.commonbase.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * todo description
 *
 * @author yufw
 * @version v0.1.0.0
 * @date 2021/1/7 19:59
 * @since v0.1.0.0
 */
@Component
public class KafkaConsumer {


    /**
     *
     * @param record
     */
    @KafkaListener(groupId = "test",topics = {"test-topic"})
    public void listen(ConsumerRecord record){
        System.out.println(record.topic()+":"+record.value());
    }
}
