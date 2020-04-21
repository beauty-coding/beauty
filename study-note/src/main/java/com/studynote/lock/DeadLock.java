package com.studynote.lock;

public class DeadLock {

    public static void main(String[] args) {
        DeadLockTest();

    }

    public static void DeadLockTest(){
        // 创建两把 对象锁
        Object o = new Object();

        Object o1 = new Object();

        // 此线程 首先 拿锁1 然后 拿锁2
        new Thread(()->{
            worker(o,o1);
        },"worker1").start();

        // 此线程 首先 拿锁2 然后 拿锁1
        new Thread(()->{
            worker(o1,o);
        },"worker2").start();
    }

    /**
     * 一个worker 完成一个 工作需要 获取两把锁
     * @param lock0 锁1
     * @param lock1 锁2
     */
    public static void worker(Object lock0, Object lock1){
        synchronized (lock0){
            System.out.println("get com.studynote.lock:"+lock0.toString()+"============"+Thread.currentThread().getName()+" is running");
            synchronized (lock1){
                System.out.println("get com.studynote.lock:"+lock1.toString()+"============"+Thread.currentThread().getName()+" is running");
            }
        }
    }




}
