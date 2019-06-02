package com.brightonsbox.scratchpad.singletons;

/**
 * Like the {@link LazyThreadSafeSingleton} version, but as of JDK 5,
 * using the volatile keyword on the static INSTANCE variable, we
 * can safely make an non-sychronized check to see if the INSTANCE is null,
 * removing the thread blocking on the getInstance() method.
 *
 * See http://www.cs.umd.edu/~pugh/java/memoryModel/DoubleCheckedLocking.html
 * for discussion of the initial problem with this method that was resolved with
 * JDK 5.
 */
public class DoubleCheckedLockingSingleton {

    private static volatile DoubleCheckedLockingSingleton INSTANCE;

    private int value;

    private DoubleCheckedLockingSingleton() {
    }

    public static DoubleCheckedLockingSingleton getInstance() {
        if (INSTANCE == null) {

            synchronized (DoubleCheckedLockingSingleton.class) {

                if (INSTANCE == null) {
                    INSTANCE = new DoubleCheckedLockingSingleton();
                }
            }
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
