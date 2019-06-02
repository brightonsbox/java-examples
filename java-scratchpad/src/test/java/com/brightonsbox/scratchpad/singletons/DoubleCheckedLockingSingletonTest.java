package com.brightonsbox.scratchpad.singletons;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DoubleCheckedLockingSingletonTest {

    @Test
    void test() {

        DoubleCheckedLockingSingleton singleton1 = DoubleCheckedLockingSingleton.getInstance();
        singleton1.setValue(2);

        DoubleCheckedLockingSingleton singleton2 = DoubleCheckedLockingSingleton.getInstance();
        assertThat(singleton2.getValue()).isEqualTo(2);

        singleton2.setValue(5);
        assertThat(singleton1.getValue()).isEqualTo(5);
    }
}