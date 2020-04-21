package com.studynote.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

/**
 * description
 * author yufw
 * data 2020/4/20 9:33
 */
@Configuration
public class RedissonManager {

    @Value("${spring.redis.url}")
    private String addressUrl;

    public RedissonManager() {
    }

    @Bean
    public RedissonClient redissonClientSingle() throws IOException {
        RedissonClient redisson = null;
        Config config = new Config();
        config.useSingleServer().setAddress("redis://" + addressUrl);
        redisson = Redisson.create(config);
        // 可通过打印redisson.getConfig().toJSON().toString()来检测是否配置成功
        return redisson;
    }

}