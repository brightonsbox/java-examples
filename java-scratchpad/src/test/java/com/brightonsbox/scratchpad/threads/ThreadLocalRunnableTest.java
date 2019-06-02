package com.brightonsbox.scratchpad.threads;

import com.brightonsbox.scratchpad.threads.ThreadLocalRunnable.ThreadResultContainer;
import org.junit.jupiter.api.Test;

class ThreadLocalRunnableTest {

    @Test
    void test() {

        ThreadResultContainer resultContainer = new ThreadResultContainer();

        new Thread(new ThreadLocalRunnable(1, resultContainer)).start();
        new Thread(new ThreadLocalRunnable(10, resultContainer)).start();
    }
}