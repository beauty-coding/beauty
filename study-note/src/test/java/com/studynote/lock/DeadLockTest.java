package com.studynote.lock;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DeadLockTest {

    @Test
    void deadLockTest() {
        System.out.println(1);
        Assertions.assertEquals(1,1);
    }
}