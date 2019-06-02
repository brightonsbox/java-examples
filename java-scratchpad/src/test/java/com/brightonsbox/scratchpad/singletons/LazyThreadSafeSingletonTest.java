package com.brightonsbox.scratchpad.singletons;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LazyThreadSafeSingletonTest {

    @Test
    void test() {

        LazyThreadSafeSingleton singleton1 = LazyThreadSafeSingleton.getInstance();
        singleton1.setValue(2);

        LazyThreadSafeSingleton singleton2 = LazyThreadSafeSingleton.getInstance();
        assertThat(singleton2.getValue()).isEqualTo(2);

        singleton2.setValue(5);
        assertThat(singleton1.getValue()).isEqualTo(5);
    }
}