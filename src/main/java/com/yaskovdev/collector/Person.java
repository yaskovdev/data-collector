package com.yaskovdev.collector;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
class Person {

    @NotBlank
    private final String firstName;

    @NotBlank
    private final String lastName;

    @NotNull
    @Positive
    private final Integer age;

    @JsonCreator
    public Person(@JsonProperty("first_name") final String firstName, @JsonProperty("last_name") final String lastName,
            @JsonProperty("age") final Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}
