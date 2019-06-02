package com.brightonsbox.scratchpad.singletons;

/**
 * Pros:
 *   * Simple way of creating Singleton without worrying about multithreading.
 *
 * Cons:
 *   * Eager initialisation could be expensive, only use if sure that the
 *     object will be needed.
 */
public class EagerInitializationSingleton {

    public static final EagerInitializationSingleton INSTANCE = new EagerInitializationSingleton();

    private int value;

    private EagerInitializationSingleton() {
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
