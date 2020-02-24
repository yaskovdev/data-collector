package com.yaskovdev.collector;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
class Person {

    @NotBlank
    private final String firstName;

    @NotBlank
    private final String lastName;

    @Min(1)
    private final int age;

    @JsonCreator
    Person(@JsonProperty("first_name") final String firstName, @JsonProperty("last_name") final String lastName,
            @JsonProperty("age") final int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}
