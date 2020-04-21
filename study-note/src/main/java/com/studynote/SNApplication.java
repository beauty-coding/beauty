package com.studynote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * description
 * author yufw
 * data 2020/4/20 9:54
 */
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class SNApplication {

    public static void main(String[] args) {
        SpringApplication.run(SNApplication.class,args);
    }

}
