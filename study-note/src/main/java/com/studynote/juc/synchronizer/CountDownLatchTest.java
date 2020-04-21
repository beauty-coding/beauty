package com.studynote.juc.synchronizer;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {

    public static void main(String[] args) {
        CountDownLatch latch1 = new CountDownLatch(6);
        CountDownLatch latch2 = new CountDownLatch(1);

        new Thread(getWorker2(latch1, latch2),"t1").start();

        new Thread(getWorker(latch1),"t2").start();

    }

    private static Runnable getWorker2(CountDownLatch latch1, CountDownLatch latch2) {
        return ()-> {
            System.out.println(Thread.currentThread().getName()+"start=========");
            try {
                latch1.await();
                latch2.countDown();
                System.out.println("t1执行");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("门闩2还有"+latch2.getCount());
            System.out.println(Thread.currentThread().getName()+"end=========");
        };
    }

    private static Runnable getWorker(CountDownLatch latch1) {
        return ()-> {
            System.out.println(Thread.currentThread().getName()+"start=========");
            for (int i = 0; i < 6; i++) {
                latch1.countDown();
                System.out.println("门闩1还有"+latch1.getCount());
            }
            //                latch2.await();
            System.out.println("t2执行");
            System.out.println(Thread.currentThread().getName()+"end=========");
        };
    }


}
