package com.example.yaml.app;

import com.example.yaml.config.ArrayConfig;
import com.example.yaml.config.Depth1Config;
import com.example.yaml.config.RootDepthConfig;
import com.example.yaml.config.SingleConfig;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
@Slf4j
public class MyApp {
    private final ArrayConfig arrayConfig;
    private final SingleConfig singleConfig;
    private final RootDepthConfig rootDepthConfig;
    private final Depth1Config depth1Config;

    @PostConstruct
    public void init() {
        log.info("arrayConfig = " + arrayConfig);
        log.info("singleConfig = " + singleConfig);
        log.info("rootDepthConfig = " + rootDepthConfig);
        log.info("depth1Config = " + depth1Config);
    }
}
