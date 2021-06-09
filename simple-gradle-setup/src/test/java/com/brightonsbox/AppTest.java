package com.brightonsbox;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {
    @Test
    void appHasAGreeting() {
        App app = new App();

        assertThat(app.getGreeting()).isEqualTo("Hello world.");
    }
}
