package com.beauty.commonopenapi;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@EnableKnife4j
@SpringBootApplication
public class CommonOpenApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommonOpenApiApplication.class, args);
    }

}
