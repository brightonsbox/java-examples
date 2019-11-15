package com.thefloow.utils.time;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;

import static com.thefloow.utils.time.DateUtils.toDate;
import static com.thefloow.utils.time.DateUtils.toInstant;
import static com.thefloow.utils.time.DateUtils.toMillis;

/**
 * Implementing class provide access to now as a given point in time.
 */
public interface TimeSource {

    static TimeSource systemUtc() {
        Clock clock = Clock.systemUTC();
        return clock::instant;
    }

    static TimeSource of(final Date date) {
        return () -> toInstant(date);
    }

    static TimeSource of(final LocalDate date) {
        return () -> toInstant(date);
    }

    static TimeSource of(final LocalDateTime date) {
        return () -> toInstant(date);
    }

    static TimeSource of(final String timestamp) {
        return () -> toInstant(timestamp);
    }

    /**
     * Represents now as {@link Instant} to nanosecond precision.
     *
     * @return the instant to be returned
     */
    Instant now();

    default LocalDate nowAsLocalDate() {
        return nowAsLocalDateTime().toLocalDate();
    }

    default Date nowAsDate() {
        return toDate(nowAsLocalDateTime());
    }

    default long nowAsMillis() {
        return toMillis(nowAsLocalDateTime());
    }

    default LocalDateTime nowAsLocalDateTime() {
        return LocalDateTime.ofInstant(now(), ZoneOffset.UTC);
    }

}
