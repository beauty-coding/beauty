package com.beauty.commonbase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

/**
 * @author yufw
 */
@EnableKafka
@SpringBootApplication
public class CommonBaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommonBaseApplication.class, args);
    }

}
