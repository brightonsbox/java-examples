package com.brightonsbox.scratchpad.threads;

/**
 * Tips:
 *   * Don't use ThreadLocal with ExecutorService since you can't be guaranteed that
 *     you're using the same thread all the time.
 */
public class ThreadLocalRunnable implements Runnable {

    private final int increment;
    private final ThreadResultContainer container;

    public ThreadLocalRunnable(final int increment, final ThreadResultContainer container) {
        this.increment = increment;
        this.container = container;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            container.addToResult(increment);
        }

        System.out.println(container.result.get());
    }

    public static class ThreadResultContainer {

        private final ThreadLocal<Integer> result = ThreadLocal.withInitial(() -> 0);

        public void addToResult(final int val) {
            result.set(result.get() + val);
        }
    }
}
