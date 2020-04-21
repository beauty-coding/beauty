package com.studynote.juc.synchronizer;

import java.util.concurrent.CyclicBarrier;


/**
 * 开五个线程分别计算 10个数的和
 * 都完成以后 计算总和
 */
public class CyclicBarrierTest {

    public static void main(String[] args) {
        int threadNum = 5;
        CyclicBarrier barrier = new CyclicBarrier(threadNum);

//        int totalSum = 0;

        for(int i = 0; i < threadNum; i++) {
            int startNum = i*10;
            int endNum = startNum + 10;
            int sum = 0;

            new Worker(barrier,startNum,endNum,sum).start();
//            totalSum += sum;
//            System.out.println("totalSum"+ totalSum);
        }

    }

}

class Worker extends Thread {

    CyclicBarrier barrier;
    int startNum;
    int endNum;
    int sum;

    public Worker() {
    }

    public Worker(CyclicBarrier param){
        this.barrier = param;
    }

    public Worker(CyclicBarrier param,int startNum,int endNum,int sum){
        this.barrier = param;
        this.startNum = startNum;
        this.endNum = endNum;
        this.sum = sum;
    }

    @Override
    public void run() {
        int temp = startNum;
        while(temp < endNum){
            sum += temp;
            ++temp;
        }

        try {
            Thread.sleep(1000);
            System.out.println(getName() + " 到达栅栏 A");
            barrier.await();
            System.out.println(getName() + " 冲破栅栏 A");
            System.out.println(sum);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}