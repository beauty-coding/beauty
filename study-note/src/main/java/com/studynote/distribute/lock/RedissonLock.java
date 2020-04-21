package com.studynote.distribute.lock;

import org.junit.jupiter.api.Test;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * description
 * author yufw
 * data 2020/4/19 23:19
 */
@Component
public class RedissonLock {

    @Autowired
    private RedissonClient redissonClient;

    @Test
    public void testRedissonLock(){

        int r = 0;

        // 获取锁
        RLock rLock = redissonClient.getLock("test1");


        // 上锁
        rLock.lock(12, TimeUnit.SECONDS);


        // 解锁
        rLock.unlock();

    }



}
