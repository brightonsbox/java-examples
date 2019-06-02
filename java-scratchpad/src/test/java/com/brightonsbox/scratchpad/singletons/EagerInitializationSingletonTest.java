package com.brightonsbox.scratchpad.singletons;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EagerInitializationSingletonTest {

    @Test
    void test() {

        EagerInitializationSingleton singleton1 = EagerInitializationSingleton.INSTANCE;
        singleton1.setValue(2);

        EagerInitializationSingleton singleton2 = EagerInitializationSingleton.INSTANCE;
        assertThat(singleton2.getValue()).isEqualTo(2);

        singleton2.setValue(5);
        assertThat(singleton1.getValue()).isEqualTo(5);
    }
}