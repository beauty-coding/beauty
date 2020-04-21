package com.studynote.thread;

import java.util.concurrent.*;

import static java.util.concurrent.ThreadPoolExecutor.AbortPolicy;

public class ThreadPoolTest {

    public static void main(String[] args) {

        int corePoolSize = 4;
        int maximumPoolSize = 6;
        long keepAliveTime = 1000;
        TimeUnit unit = TimeUnit.MICROSECONDS;
        BlockingQueue a = new SynchronousQueue();

//        ArrayBlockingQueue  DelayQueue  LinkedBlockingQueue  PriorityBlockingQueue
        ThreadFactory threadFactory = Executors.defaultThreadFactory();
        RejectedExecutionHandler handler = new AbortPolicy();

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(corePoolSize,maximumPoolSize,keepAliveTime,unit,a,threadFactory,handler);

        for (int i = 0; i < 10; i++) {

            threadPoolExecutor.execute(()->{
                System.out.println(1);
            });
        }
    }


}
