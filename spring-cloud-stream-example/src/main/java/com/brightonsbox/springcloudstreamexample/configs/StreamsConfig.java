package com.brightonsbox.springcloudstreamexample.configs;

import com.brightonsbox.springcloudstreamexample.MessageStreams;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(MessageStreams.class)
public class StreamsConfig {
}
