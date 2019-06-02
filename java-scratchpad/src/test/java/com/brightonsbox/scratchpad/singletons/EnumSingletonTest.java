package com.brightonsbox.scratchpad.singletons;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EnumSingletonTest {

    @Test
    void test() {

        EnumSingleton singleton1 = EnumSingleton.INSTANCE;
        singleton1.setValue(2);

        EnumSingleton singleton2 = EnumSingleton.INSTANCE;
        assertThat(singleton2.getValue()).isEqualTo(2);

        singleton2.setValue(5);
        assertThat(singleton1.getValue()).isEqualTo(5);
    }
}