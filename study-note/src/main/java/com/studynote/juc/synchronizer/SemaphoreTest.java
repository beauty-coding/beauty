package com.studynote.juc.synchronizer;

import java.util.concurrent.*;

import static java.util.concurrent.ThreadPoolExecutor.DiscardPolicy;

public class SemaphoreTest {


    public static void main(String[] args) {

        int coreThreadNum = 2;

        int maxThreadNum = 4;

        BlockingQueue queue = new ArrayBlockingQueue(1);

        long keepAliveTime = 1000L;

        TimeUnit unit = TimeUnit.MILLISECONDS;

        Semaphore semaphore = new Semaphore(1);

        ThreadPoolExecutor pool = new ThreadPoolExecutor(coreThreadNum,maxThreadNum,keepAliveTime,unit,queue,Executors.defaultThreadFactory(), new DiscardPolicy());


        Thread t1 = new Thread(()->{
            System.out.println("t1---running");
            try {
                semaphore.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("t1---end");
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            semaphore.release();
            System.out.println("已释放");

        },"t1");

        Thread t2 = new Thread(()->{
            System.out.println("t2---running");
            try {
                semaphore.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("t2---end");
        },"t2");

        pool.execute(t1);
        pool.execute(t2);



    }




}
