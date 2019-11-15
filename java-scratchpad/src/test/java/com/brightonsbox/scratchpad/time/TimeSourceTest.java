package com.thefloow.utils.time;

import org.junit.jupiter.api.Test;


import java.time.Instant;
import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;

class TimeSourceTest {

    @Test
    void checkNowAsDate() {
        TimeSource source = TimeSource.of(new Date(1234));
        assertThat(source.nowAsDate()).hasSameTimeAs(new Date(1234));
        assertThat(source.nowAsMillis()).isEqualTo(1234L);
    }

    @Test
    void checkOf() {
        TimeSource source = TimeSource.of("2013-02-03T11:01:52.923Z");
        assertThat(source.now()).isEqualTo(Instant.parse("2013-02-03T11:01:52.923Z"));
    }
}
