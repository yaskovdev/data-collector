package com.yaskovdev.collector;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Data
@Validated
@Component
@ConfigurationProperties(prefix = "collector")
public class CollectorConfig {

    @Min(0)
    @Max(1)
    private int calculationSeed;
}

