package com.studynote.base;


public class StaticMethodTest {

    private static int a = 0;

    public static void main(String[] args) {

        new Thread(StaticMethodTest::run, "thread1").start();


        new Thread(() -> run2(), "thread2").start();
    }


    public static void test(int param) throws InterruptedException {
        System.out.println("==============="+Thread.currentThread().getName()+"操作之前的a值："+a+"===================");
        // 先让 线程进行操作之前 都能 先拿值（造成线程安全问题）
        Thread.sleep(1000);
        a += param;
        System.out.println("==============="+Thread.currentThread().getName()+"进行加"+param+"操作之后的a值："+a+"=============");

    }

    private static void run() {
        try {
            test(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void run2() {
        try {
            // 目的 ： 等待 其他线程执行完毕后在执行
            // 让执行此业务的 线程 先sleep 1秒
            Thread.sleep(1000);
            test(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
