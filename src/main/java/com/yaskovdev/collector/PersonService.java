package com.yaskovdev.collector;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
class PersonService {

    private final CollectorConfig config;

    void send(final Person person) {
        log.info("Calculation seed was {}", config.getCalculationSeed());
    }
}
