package com.beauty.commonbase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

/**
 * todo description
 *
 * @author yufw
 * @version v0.1.0.0
 * @date 2021/1/7 19:58
 * @since v0.1.0.0
 */
@RequestMapping("/api/kafka/")
@RestController
public class KafkaProducer {
    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    @GetMapping("/send")
    public boolean send(@RequestParam String topic,@RequestParam String message) {
        try {
            kafkaTemplate.send(topic, message);
            System.out.println("消息发送成功...");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
}
