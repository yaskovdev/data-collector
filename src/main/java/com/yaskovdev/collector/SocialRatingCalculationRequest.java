package com.yaskovdev.collector;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
public class SocialRatingCalculationRequest {

    @NotBlank
    private final String firstName;

    @NotBlank
    private final String lastName;

    @Min(1)
    private final int age;

    @Min(0)
    @Max(1)
    private final int calculationSeed;
}
