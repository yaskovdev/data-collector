package com.yaskovdev.collector;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
@Validated
@Component
@ConfigurationProperties(prefix = "collector")
class CollectorConfig {

    @NotBlank
    private String kafkaBootstrapServers;

    @Min(0)
    @Max(1)
    private int calculationSeed;
}
