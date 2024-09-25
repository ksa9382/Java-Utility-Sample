package kr.co.direa.snakeyaml.app;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import kr.co.direa.snakeyaml.config.ArrayConfig;
import kr.co.direa.snakeyaml.config.Depth1Config;
import kr.co.direa.snakeyaml.config.RootDepthConfig;
import kr.co.direa.snakeyaml.config.SingleConfig;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Component
@Slf4j
public class MyBean {
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
