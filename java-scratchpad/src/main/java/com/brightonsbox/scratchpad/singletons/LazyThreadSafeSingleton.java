package com.brightonsbox.scratchpad.singletons;

/**
 * Pros:
 *   * Lazy initialization
 *   * Thread safe due to synchronized call to getInstance()
 *
 * Cons:
 *   * Synchronized call to getInstance() blocks threads
 */
public class LazyThreadSafeSingleton {

    private static LazyThreadSafeSingleton INSTANCE;

    private int value;

    private LazyThreadSafeSingleton() {
    }

    public static synchronized LazyThreadSafeSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazyThreadSafeSingleton();
        }
        return INSTANCE;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
